import java.awt.*;

// -------------------------------------------------------------------------
/**
 * Create a circle
 *
 * @author Michael Goheen
 * @version Mar 13, 2011
 */
public class Circle
    extends Oval
{

    // ----------------------------------------------------------
    /**
     * Create a new Circle object.
     *
     * @param p1
     *            Point 1
     * @param p2
     *            Point 2
     * @param shade
     *            Color
     * @param isFilled
     *            Filled?
     */
    public Circle(Point p1, Point p2, Color shade, boolean isFilled)
    {
        super(p1, p2, shade, isFilled);

        int potentialWidth = (int)Math.abs(p1.getX() - p2.getX());
        int potentialHeight = (int)Math.abs(p1.getY() - p2.getY());
        int min = Math.min(potentialWidth, potentialHeight);
        width = min;
        height = min;
    }
}
