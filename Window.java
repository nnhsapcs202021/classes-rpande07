

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
 * @author Ria Pande
 * @version 10/28/20
 */
public class Window
{
    private int xLeft;
    private int yTop;

    /**
    Constructs a target.
    @param x the x coordinate of the top left corner
    @param y the y coordinate of the top left corner
     */
    public Window(int initialX, int initialY)
    {
        this.xLeft = initialX;
        this.yTop = initialY;
    }

    /**
    @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {   
        Rectangle2D.Double window = 
        new Rectangle2D.Double(this.xLeft, this.yTop, 20, 20);

        g2.setPaint(Color.yellow);
        g2.fill(window);
        
    }
}