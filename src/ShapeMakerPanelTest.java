import java.awt.Color;
import javax.swing.*;

// -------------------------------------------------------------------------
/**
 * Test Shape Maker Panel
 *
 * @author Michael Goheen
 * @version Mar 13, 2011
 */
public class ShapeMakerPanelTest
    extends student.GUITestCase
{

    // ----------------------------------------------------------
    /**
     * Test shapeMaker main window
     */
    public void testShapeMaker()
    {
        // Run the program
        ShapeMaker.main(null);

        // Make sure the main panel was created
        assertNotNull(getComponent(ShapeMakerPanel.class));
    }


    // ----------------------------------------------------------
    /**
     * Test drawing a Circle
     */
    public void testDrawCircle()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JComboBox clickCircle = getComponent(JComboBox.class, "shapeChoice");
        click(clickCircle);
        selectItem(clickCircle, "Circle");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }


    // ----------------------------------------------------------
    /**
     * Test Drawing a Square
     */
    public void testDrawSquare()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JComboBox clickSquare = getComponent(JComboBox.class, "shapeChoice");
        click(clickSquare);
        selectItem(clickSquare, "Square");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }


    // ----------------------------------------------------------
    /**
     * Test Drawing a line
     */
    public void testDrawLine()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JComboBox clickLine = getComponent(JComboBox.class, "shapeChoice");

        click(clickLine);
        selectItem(clickLine, "Line");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }


    // ----------------------------------------------------------
    /**
     * Test Drawing an oval
     */
    public void testDrawOval()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JComboBox clickOval = getComponent(JComboBox.class, "shapeChoice");

        click(clickOval);
        selectItem(clickOval, "Oval");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }


    // ----------------------------------------------------------
    /**
     * Test Drawing a Rectangle
     */
    public void testDrawRectangle()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JComboBox clickRectangle = getComponent(JComboBox.class, "shapeChoice");

        click(clickRectangle);
        selectItem(clickRectangle, "Rectangle");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }


    // ----------------------------------------------------------
    /**
     * Test drawing a Circle
     */
    public void testDrawFilledCircle()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JCheckBox filled = getComponent(JCheckBox.class, "filled");
        click(filled);

        JComboBox clickCircle = getComponent(JComboBox.class, "shapeChoice");
        click(clickCircle);
        selectItem(clickCircle, "Circle");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }


    // ----------------------------------------------------------
    /**
     * Test Drawing a Square
     */
    public void testDrawFiledSquare()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JCheckBox filled = getComponent(JCheckBox.class, "filled");
        click(filled);

        JComboBox clickSquare = getComponent(JComboBox.class, "shapeChoice");
        click(clickSquare);
        selectItem(clickSquare, "Square");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }


    // ----------------------------------------------------------
    /**
     * Test Drawing a line
     */
    public void testDrawFilledLine()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JCheckBox filled = getComponent(JCheckBox.class, "filled");
        click(filled);

        JComboBox clickLine = getComponent(JComboBox.class, "shapeChoice");
        click(clickLine);
        selectItem(clickLine, "Line");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }


    // ----------------------------------------------------------
    /**
     * Test Drawing an oval
     */
    public void testDrawFilledOval()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JCheckBox filled = getComponent(JCheckBox.class, "filled");
        click(filled);

        JComboBox clickOval = getComponent(JComboBox.class, "shapeChoice");
        click(clickOval);
        selectItem(clickOval, "Oval");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }


    // ----------------------------------------------------------
    /**
     * Test Drawing a Rectangle
     */
    public void testDrawFilledRectangle()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JCheckBox filled = getComponent(JCheckBox.class, "filled");
        click(filled);

        JComboBox clickRectangle = getComponent(JComboBox.class, "shapeChoice");
        click(clickRectangle);
        selectItem(clickRectangle, "Rectangle");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }


    // ----------------------------------------------------------
    /**
     * Test Drawing a Rectangle
     */
    public void testDrawFilledRectangleAndChangeColor()
    {
        ShapeMakerPanel panel = new ShapeMakerPanel();
        showInFrame(panel);

        JCheckBox filled = getComponent(JCheckBox.class, "filled");
        click(filled);

        JPanel color = getComponent(JPanel.class, "currentColor");
        click(color);
        selectColorInChooser(Color.ORANGE);

        JComboBox clickRectangle = getComponent(JComboBox.class, "shapeChoice");
        click(clickRectangle);
        selectItem(clickRectangle, "Rectangle");

        int width = panel.getWidth();
        int height = panel.getHeight();

        mouseDragFrom(panel, width * 3 / 4, height * 3 / 4);
        mouseDropOn(panel, width * 1 / 4, height * 1 / 4);

        assertEquals(width * 3 / 4, (int)panel.getStartPoint().getX());
        assertEquals(height * 3 / 4, (int)panel.getStartPoint().getY());
        assertEquals(width * 1 / 4, (int)panel.getEndPoint().getX());
        assertEquals(height * 1 / 4, (int)panel.getEndPoint().getY());
    }
}
