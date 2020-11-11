
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Information on how to draw target with alternating black and white rings.
 *
 * @author Ria Pande
 * @version 10/28/20
 */
public class Cityscape
{


    /**
    Constructs a target.
    @param x the x coordinate of the top left corner
    @param y the y coordinate of the top left corner
     */
    public Cityscape()
    {
        
    }

    /**
    Draws the target in the center.
    @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {   
        Rectangle2D.Double building1 = new Rectangle2D.Double(500, 500, 300, 300);

        g2.fill(building1);
        
    }
}