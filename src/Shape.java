import java.awt.*;

// -------------------------------------------------------------------------
/**
 * Represents abstract Shape
 *
 * @author Michael Goheen
 * @version Mar 13, 2011
 */
public abstract class Shape
{

    /**
     * The color.
     */
    protected Color color;


    // ----------------------------------------------------------
    /**
     * Draw
     *
     * @param gc
     *            Graphics
     */
    public abstract void draw(Graphics gc);
}
