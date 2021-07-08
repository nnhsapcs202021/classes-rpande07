import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Information on how to draw target with alternating black and white rings.
 *
 * @author Ria Pande
 * @version 10/28/20
 */
public class Target
{
    private int xLeft;
    private int yTop;

    /**
    Constructs a target.
    @param x the x coordinate of the top left corner
    @param y the y coordinate of the top left corner
     */
    public Target(int initialX, int initialY)
    {
        this.xLeft = initialX;
        this.yTop = initialY;
    }

    /**
    Draws the target in the center.
    @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {   
        Ellipse2D.Double ring1 = 
        new Ellipse2D.Double(this.xLeft + 325, this.yTop + 125, 500, 500);
        Ellipse2D.Double ring2 = 
        new Ellipse2D.Double(this.xLeft + 350, this.yTop + 150, 450, 450);
        Ellipse2D.Double ring3 = 
        new Ellipse2D.Double(this.xLeft + 375, this.yTop + 175, 400, 400);
        Ellipse2D.Double ring4 = 
        new Ellipse2D.Double(this.xLeft + 400, this.yTop + 200, 350, 350);
        Ellipse2D.Double ring5 = 
        new Ellipse2D.Double(this.xLeft + 425, this.yTop + 225, 300, 300);
        Ellipse2D.Double ring6 = 
        new Ellipse2D.Double(this.xLeft + 450, this.yTop + 250, 250, 250);
        Ellipse2D.Double ring7 = 
        new Ellipse2D.Double(this.xLeft + 475, this.yTop + 275, 200, 200);
        Ellipse2D.Double ring8 = 
        new Ellipse2D.Double(this.xLeft + 500, this.yTop + 300, 150, 150);
        Ellipse2D.Double ring9 = 
        new Ellipse2D.Double(this.xLeft + 525, this.yTop + 325, 100, 100);
        Ellipse2D.Double ring10 = 
        new Ellipse2D.Double(this.xLeft + 550, this.yTop + 350, 50, 50);

        // draws the rings
        g2.fill(ring1);
        g2.setPaint(Color.white);
        g2.fill(ring2);
        g2.setPaint(Color.black);
        g2.fill(ring3);
        g2.setPaint(Color.white);
        g2.fill(ring4);
        g2.setPaint(Color.black);
        g2.fill(ring5);
        g2.setPaint(Color.white);
        g2.fill(ring6);
        g2.setPaint(Color.black);
        g2.fill(ring7);
        g2.setPaint(Color.white);
        g2.fill(ring8);
        g2.setPaint(Color.black);
        g2.fill(ring9);
        g2.setPaint(Color.white);
        g2.fill(ring10);
    }
}
