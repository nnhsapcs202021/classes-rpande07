
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
public class Building
{
    private int buildingLength;
    private int buildingWidth;
    private int xLeft;
    private int yTop;

    /**
    Constructs a target.
    @param x the x coordinate of the top left corner
    @param y the y coordinate of the top left corner
     */
    public Building(int initialX, int initialY, int width, int length)
    {
        this.buildingLength = length;
        this.buildingWidth = width;
        this.xLeft = initialX;
        this.yTop = initialY;
    }

    /**
    Draws the target in the center.
    @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {   
        Rectangle2D.Double building = 
        new Rectangle2D.Double(this.xLeft, this.yTop, this.buildingWidth, this.buildingLength);

        g2.fill(building);
        
        
    }
}