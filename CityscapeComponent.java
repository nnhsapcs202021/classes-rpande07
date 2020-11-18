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
 * @version 13 November 2020
 */

public class CityscapeComponent extends JComponent
{
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
  private Window window1;
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;  // cast to Graphics2D object

        Building building1 = new Building(200, 500, 100, 200);
        Building building2 = new Building(400, 400, 100, 300);
        Building building3 = new Building(600, 600, 100, 100);
        Building building4 = new Building(800, 300, 100, 400);
        Building building5 = new Building(301, 200, 98, 500);
        Building building6 = new Building(501, 500, 98, 200);
        Building building7 = new Building(701, 100, 98, 600);
        Building building8 = new Building(901, 200, 98, 500);
        Building building9 = new Building(0, 600, 100, 100);
        Building building10 = new Building(101, 300, 98, 400);
        Building building11 = new Building(1000, 600, 100, 100);
        Building building12 = new Building(1101, 300, 98, 400);
        Building building13 = new Building(1200, 200, 100, 500);
        Building building14 = new Building(1301, 400, 98, 300);

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
        
        
        Window window1 = new Window(100,100);
        
        window1.draw(g2);
    }

    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...

        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
