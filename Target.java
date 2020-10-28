import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
/**
 * Write a description of class Target here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Target
{
    private int xLeft;
    private int yTop;

    /**
    Constructs a car with a given top left corner.
    @param x the x coordinate of the top left corner
    @param y the y coordinate of the top left corner
     */
    public Target(int initialX, int initialY)
    {
        this.xLeft = initialX;
        this.yTop = initialY;
    }

    /**
    Draws the car.
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
        g2.fill(ring2);
        g2.draw(ring3);
        g2.draw(ring4);
        g2.draw(ring5);
        g2.draw(ring6);
        g2.draw(ring7);
        g2.draw(ring8);
        g2.draw(ring9);
        g2.draw(ring10);
    }
}
