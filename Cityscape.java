
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
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
    private int buildingLength;
    private int buildingWidth;

    /**
    Constructs a target.
    @param x the x coordinate of the top left corner
    @param y the y coordinate of the top left corner
     */
    public Cityscape(int length, int width)
    {
        this.buildingLength = length;
        this.buildingWidth = width;
    }

    /**
    Draws the target in the center.
    @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {   
        Rectangle2D.Double building1 = 
        new Rectangle2D.Double(200, 400, this.buildingWidth, this.buildingLength);

        Rectangle2D.Double building2 = 
        new Rectangle2D.Double(401, 400, this.buildingWidth, this.buildingLength);
        
        Rectangle2D.Double building3 = 
        new Rectangle2D.Double(602, 400, this.buildingWidth, this.buildingLength);
        
        Rectangle2D.Double building4 = 
        new Rectangle2D.Double(803, 400, this.buildingWidth, this.buildingLength);
        
        Rectangle2D.Double building5 = 
        new Rectangle2D.Double(300.5, 400, this.buildingWidth, this.buildingLength);

        Rectangle2D.Double building6 = 
        new Rectangle2D.Double(501.5, 400, this.buildingWidth, this.buildingLength);
        
        Rectangle2D.Double building7 = 
        new Rectangle2D.Double(702.5, 400, this.buildingWidth, this.buildingLength);
        
        Rectangle2D.Double building8 = 
        new Rectangle2D.Double(903.5, 400, this.buildingWidth, this.buildingLength);
        
        
        g2.fill(building1);
        g2.fill(building2);
        g2.fill(building3);
        g2.fill(building4);
        g2.fill(building5);
        g2.fill(building6);
        g2.fill(building7);
        g2.fill(building8);
    }
}