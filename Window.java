
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author rpande
 * @version 28 October 2020
 * 
 * Window class creates windows with different coordinates. 
 * Small yellow squares that go on buildings. 
 * 
 */
public class Window
{
    private int xLeft;
    private int yTop;

    /**
    Constructs a window.
    @param initialX the x coordinate of the top left corner of window
    @param initialY the y coordinate of the top left corner of window
     */
    public Window(int initialX, int initialY)
    {
        this.xLeft = initialX;
        this.yTop = initialY;
    }

    /**
    @param g2 the graphics context
    draws window
     */
    public void draw(Graphics2D g2)
    {   
        Rectangle2D.Double window = 
            new Rectangle2D.Double(this.xLeft, this.yTop, 20, 20);

        g2.setPaint(Color.yellow);
        g2.fill(window);

    }
}