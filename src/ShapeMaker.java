import javax.swing.JFrame;

// -------------------------------------------------------------------------
/**
 * Creates the main window to contain the drawing area and control panel
 *
 * @author Michael Goheen
 * @version Mar 13, 2011
 */
public class ShapeMaker
{

    // ----------------------------------------------------------
    /**
     * Create Main Window
     *
     * @param args
     *            Main
     */
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Shape Maker");
        frame.getContentPane().add(new ShapeMakerPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
