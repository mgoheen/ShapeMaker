import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

// -------------------------------------------------------------------------
/**
 * This class allows a user to draw shapes on a canvas Draw Shapes
 *
 * @author Michael Goheen
 * @version Mar 13, 2011
 */
public class ShapeMakerPanel
    extends JPanel
{
    private JComboBox        shapeChoice;
    private JPanel           currentColor;
    private JPanel           controlPanel;
    private JPanel           drawingArea;
    private JCheckBox        filled;
    private ArrayList<Shape> shapes;
    private Point            point1;
    private Point            point2;
    private Color            color;
    private Shape            currentShape;
    private JButton          clear;
    private JButton          undo;


    // ----------------------------------------------------------
    /**
     * Create a new ShapeMakerPanel object.
     */
    public ShapeMakerPanel()
    {
        shapes = new ArrayList<Shape>();
        point1 = null;
        point2 = null;
        color = Color.black;
        String[] shapeNames =
            { "Circle", "Square", "Line", "Oval", "Rectangle" };
        shapeChoice = new JComboBox(shapeNames);
        shapeChoice.setName("shapeChoice");

        currentColor = new JPanel();
        currentColor.setPreferredSize(new Dimension(20, 20));
        currentColor.setBackground(color);
        currentColor.addMouseListener(new ColorListener());
        currentColor.setName("currentColor");

        filled = new JCheckBox("Filled");
        filled.setName("filled");

        clear = new JButton("Clear");
        clear.setName("clear");
        clear.addMouseListener(new ClearListener());

        undo = new JButton("Undo");
        undo.setName("undo");
        undo.addMouseListener(new UndoListener());

        controlPanel = new JPanel();
        controlPanel.setName("controlPanel");
        controlPanel.setPreferredSize(new Dimension(500, 35));
        controlPanel.setBackground(Color.CYAN);
        controlPanel.add(shapeChoice);
        controlPanel.add(currentColor);
        controlPanel.add(filled);
        controlPanel.add(clear);
        controlPanel.add(undo);

        drawingArea = new JPanel();
        drawingArea.setName("drawingArea");
        add(controlPanel);
        add(drawingArea);
        addMouseListener(new ShapeListener());
        addMouseMotionListener(new ShapeDragListener());
        drawingArea.setBackground(Color.white);
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.WHITE);
    }


    // ----------------------------------------------------------
    /**
     * Get Starting Point
     *
     * @return Point
     */
    public Point getStartPoint()
    {
        return point1;
    }


    // ----------------------------------------------------------
    /**
     * Get Ending Point
     *
     * @return Point
     */
    public Point getEndPoint()
    {
        return point2;
    }


    // ----------------------------------------------------------
    /**
     * Make the shape
     *
     * @return Shape
     */
    private Shape makeShape()
    {
        Shape shape = null;

        switch (shapeChoice.getSelectedIndex())
        {
            case 0:
                shape = new Circle(point1, point2, color, filled.isSelected());
                break;
            case 1:
                shape = new Square(point1, point2, color, filled.isSelected());
                break;
            case 2:
                shape = new Line(point1, point2, color);
                break;
            case 3:
                shape = new Oval(point1, point2, color, filled.isSelected());
                break;
            case 4:
                shape =
                    new Rectangle(point1, point2, color, filled.isSelected());
                break;

        }

        return shape;
    }


    // ----------------------------------------------------------
    /**
     * Paint the window
     *
     * @param gc
     *            Graphics
     */
    public void paintComponent(Graphics gc)
    {
        super.paintComponent(gc);

        for (Shape shape : shapes)
        {
            shape.draw(gc);

            if (currentShape != null)
            {
                currentShape.draw(gc);
            }
        }
    }


    // ----------------------------------------------------------
    /**
     * UndoListener class
     */
    private class UndoListener
        extends MouseAdapter
    {
        public void mouseClicked(MouseEvent event)
        {
            shapes.remove(shapes.size()-1);
            repaint();
        }
    }

 // ----------------------------------------------------------
    /**
     * ClearListener class
     */
    private class ClearListener
        extends MouseAdapter
    {
        public void mouseClicked(MouseEvent event)
        {
            shapes.clear();
            repaint();
        }
    }


    // ----------------------------------------------------------
    /**
     * ColorListener class
     */
    private class ColorListener
        extends MouseAdapter
    {
        // ----------------------------------------------------------
        /**
         * If mouse is clicked
         *
         * @param event
         */
        public void mouseClicked(MouseEvent event)
        {
            color =
                JColorChooser.showDialog(currentColor, "Pick a Color", color);
            currentColor.setBackground(color);
        }
    }


    /**
     * ShapeListener Class
     */
    private class ShapeListener
        extends MouseAdapter
    {
        // ----------------------------------------------------------
        /**
         * If mouse is pressed
         *
         * @param event
         */
        public void mousePressed(MouseEvent event)
        {
            point1 = event.getPoint();
        }


        // ----------------------------------------------------------
        /**
         * If mouse is released
         *
         * @param event
         */
        public void mouseReleased(MouseEvent event)
        {
            point2 = event.getPoint();
            shapes.add(makeShape());
            currentShape = null;
            repaint();
        }
    }


    /**
     * ShapeListener Class
     */
    private class ShapeDragListener
        extends MouseMotionAdapter
    {
        // ----------------------------------------------------------
        /**
         * If mouse is dragged
         *
         * @param event
         */
        public void mouseDragged(MouseEvent event)
        {
            point2 = event.getPoint();
            currentShape = makeShape();
            repaint();
        }
    }
}
