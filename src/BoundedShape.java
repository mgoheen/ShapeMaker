import java.awt.*;

// -------------------------------------------------------------------------
/**
 * Bounds a shape
 *
 * @author Michael Goheen
 * @version Mar 13, 2011
 */
public abstract class BoundedShape
    extends Shape
{

    /**
     * The upperLeft point
     */
    public Point   upperLeft;
    /**
     * The Width
     */
    public int     width;
    /**
     * The height
     */
    public int     height;
    /**
     * Filled?
     */
    public boolean filled;


    // ----------------------------------------------------------
    /**
     * Create and return a point
     *
     * @param p1
     *            Point 1
     * @param p2
     *            Point 2
     * @return Point
     */
    public Point determineUpperLeft(Point p1, Point p2)
    {
        int x = (int)Math.min(p1.getX(), p2.getX());
        int y = (int)Math.min(p1.getY(), p2.getY());
        return new Point(x, y);
    }
}
