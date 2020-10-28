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
        Ellipse2D.Double frontTire 
        = new Ellipse2D.Double(this.xLeft + 300, this.yTop + 250, 100, 100);
        Ellipse2D.Double rearTire 
        = new Ellipse2D.Double(this.xLeft + 300, this.yTop + 250, 50, 50);

        // draws the target
        g2.draw(frontTire);
        g2.draw(rearTire);
    }
}
