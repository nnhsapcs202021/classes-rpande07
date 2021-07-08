import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author rpande
 * @version 28 October 2020
 */

public class CityscapeComponent extends JComponent
{

    /**
     * defines objects (buildings and sky) and important integers 
     * (values of red, green, and blue in sky) as instance variables
     */

    private Sky sky;
    private int skyRed;
    private int skyGreen;
    private int skyBlue;

    private Building building1;
    private Building building2; 
    private Building building3; 
    private Building building4; 
    private Building building5; 
    private Building building6; 
    private Building building7; 
    private Building building8;
    private Building building9; 
    private Building building10; 
    private Building building11; 
    private Building building12; 
    private Building building13; 
    private Building building14;

    /**
     * defines the CityscapeComponent constructor and initializes 
     * all instance variables.
     */

    public CityscapeComponent()
    {
        this.skyRed = 7;
        this.skyGreen = 0;
        this.skyBlue = 108;

        sky = new Sky(skyRed, skyGreen, skyBlue, 50, 25, -1250, 600);

        building1 = new Building(200, 500, 99, 200); 
        building2 = new Building(400, 400, 99, 300);
        building3 = new Building(600, 600, 99, 100);
        building4 = new Building(800, 300, 99, 400);
        building5 = new Building(300, 200, 99, 500);
        building6 = new Building(500, 500, 99, 200); 
        building7 = new Building(700, 100, 99, 600);
        building8 = new Building(900, 200, 99, 500);
        building9 = new Building(0, 600, 99, 100);
        building10 = new Building(100, 300, 99, 400); 
        building11 = new Building(1000, 600, 99, 100);
        building12 = new Building(1100, 300, 99, 400);
        building13 = new Building(1200, 200, 99, 500);
        building14 = new Building(1300, 400, 99, 300);
    }

    /** 
     * This method is invoked by the Java Run-Time whenever the component
     * needs to be redrawn. It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing
     * operations. 
     * 
     */

    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;  // cast to Graphics2D object

        // draws sky, which is initially dark blue, with yellow cresent moon 
        sky.draw(g2);

        // draws 14 buildings with many windows on each
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        building7.draw(g2);
        building8.draw(g2);
        building9.draw(g2);
        building10.draw(g2);
        building11.draw(g2);
        building12.draw(g2);
        building13.draw(g2);
        building14.draw(g2);

    }

    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // changes color from dark blue to bright pink
        // moves the moon down diagonally
        // moves the sun up diagonally

        this.sky.changeColor();
        this.sky.moonMoveDownandRight();
        this.sky.sunMoveUpandRight();

        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
