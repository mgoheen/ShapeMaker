import java.awt.*;

// -------------------------------------------------------------------------
/**
 * Make a Rectangle
 *
 * @author Michael Goheen
 * @version Mar 13, 2011
 */
public class Rectangle
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
    public Rectangle(Point p1, Point p2, Color shade, boolean isFilled)
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
            gc.fillRect(x, y, width, height);
        }
        else {
            gc.drawRect(x, y, width, height);
        }
    }
}
