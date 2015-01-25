import java.awt.*;

// -------------------------------------------------------------------------
/**
 * Make an oval
 *
 * @author Michael Goheen
 * @version Mar 13, 2011
 */
public class Oval
    extends BoundedShape
{
    // ----------------------------------------------------------
    /**
     * Creates a new Oval object
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
    public Oval(Point p1, Point p2, Color shade, boolean isFilled)
    {
        upperLeft = determineUpperLeft(p1, p2);
        width = (int)Math.abs(p1.getX() - p2.getX());
        height = (int)Math.abs(p1.getY() - p2.getY());
        filled = isFilled;
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

        int x = (int)upperLeft.getX();
        int y = (int)upperLeft.getY();

        if (filled) {
            gc.fillOval(x, y, width, height);
        }
        else {
            gc.drawOval(x, y, width, height);
        }
    }
}
