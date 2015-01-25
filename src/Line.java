import java.awt.*;

// -------------------------------------------------------------------------
/**
 * Create a line
 *
 * @author Michael Goheen
 * @version Mar 13, 2011
 */
public class Line
    extends Shape
{

    /**
     * Starting Point
     */
    public Point start;
    /**
     * Ending Point
     */
    public Point end;


    // ----------------------------------------------------------
    /**
     * Create a new Line object.
     *
     * @param p1
     *            Point 1
     * @param p2
     *            Point 2
     * @param shade
     *            Color
     */
    public Line(Point p1, Point p2, Color shade)
    {
        start = p1;
        end = p2;
        color = shade;
    }


    // ----------------------------------------------------------
    /**
     * Draw
     *
     * @param gc
     *            Graphics
     */
    public void draw(Graphics gc)
    {
        gc.setColor(color);
        gc.drawLine(
            (int)start.getX(),
            (int)start.getY(),
            (int)end.getX(),
            (int)end.getY());
    }
}
