import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author rpande
 * @version 18 July 2014
 */

public class CityscapeComponent extends JComponent
{
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;  // cast to Graphics2D object

        Cityscape building1 = new Cityscape(400, 100);
        Cityscape building2 = new Cityscape(400, 100);
        Cityscape building3 = new Cityscape(400, 100);
        Cityscape building4 = new Cityscape(400, 100);
        Cityscape building5 = new Cityscape(400, 100);
        Cityscape building6 = new Cityscape(400, 100);
        Cityscape building7 = new Cityscape(400, 100);
        Cityscape building8 = new Cityscape(400, 100);

        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        building7.draw(g2);
        building8.draw(g2);
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
