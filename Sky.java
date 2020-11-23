
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
 * Sky class creates large, dark blue rectangle that takes up the whole frame
 * and has a cresent moon. The sky is later changed to bright pink and as the
 * moon goes down, the sun goes up. 
 * 
 */
public class Sky
{
    private int skyRed;
    private int skyGreen;
    private int skyBlue;
    private int moonXLeft;
    private int moonYTop;
    private int sunXLeft;
    private int sunYTop;

    /**
    Constructs a target.
    @param red the int value of red in sky
    @param green the int value of green in sky
    @param blue the int value of blue in sky
    @param moonInitialX the x coordinate of the top left corner of the moon
    @param moonInitialY the y coordinate of the top left corner of the moon
    @param sunInitialX the x coordinate of the top left corner of the moon
    @param sunInitialY the y coordinate of the top left corner of the moon
    
     */
    public Sky(int red, int green, int blue, int moonInitialX, int moonInitialY, int 
    sunInitialX, int sunInitialY)
    {
        this.skyRed = red;
        this.skyGreen = green;
        this.skyBlue = blue;
        this.moonXLeft = moonInitialX;
        this.moonYTop = moonInitialY;
        this.sunXLeft = sunInitialX;
        this.sunYTop = sunInitialY;
    }

    /**
    @param g2 the graphics context
    draws sky with cresent moon
     */
    public void draw(Graphics2D g2)
    {   
        Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, 2560, 1700);
        Color skyColor = new Color(skyRed, skyGreen, skyBlue);

        g2.setPaint(skyColor);
        g2.fill(sky);

        Ellipse2D.Double filledMoon = 
            new Ellipse2D.Double(this.moonXLeft, this.moonYTop, 250, 250);

        Ellipse2D.Double emptyMoon = 
            new Ellipse2D.Double(this.moonXLeft + 100, this.moonYTop + 25, 200, 200);

        Ellipse2D.Double sun = 
            new Ellipse2D.Double(this.sunXLeft, this.sunYTop, 250, 250);

        g2.setPaint(Color.yellow);
        g2.fill(filledMoon);

        g2.setPaint(skyColor);
        g2.fill(emptyMoon);

        g2.setPaint(Color.orange);
        g2.fill(sun);

    }

    /**
     * moves the moon down diagonally and out of frame.
     */
    public void moonMoveDownandRight()
    {
        this.moonXLeft += 75;
        this.moonYTop += 33;
    }

    /**
     * moves the sun up diagonally and into frame.
     */
    public void sunMoveUpandRight()
    {
        this.sunXLeft += 75;
        this.sunYTop -= 33;
    }

    /**
     * changes the color of the sky from dark blue to bright pink.
     */
    public void changeColor()
    {
        this.skyRed += 14;
        this.skyBlue += 7;

    }
}