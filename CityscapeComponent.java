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
        
        
        Window window1 = new Window(105,510);
        Window window2 = new Window(139,510);
        Window window3 = new Window(173,510);
        Window window4 = new Window(105,544);
        Window window5 = new Window(139,544);
        Window window6 = new Window(173,544);
        Window window7 = new Window(105,578);
        Window window8 = new Window(139,578);
        Window window9 = new Window(173,578);
        Window window10 = new Window(105,612);
        Window window11 = new Window(139,612);
        Window window12 = new Window(173,612);
        Window window13 = new Window(105,646);
        Window window14 = new Window(139,646);
        Window window15 = new Window(173,646);
        Window window16 = new Window(105,680);
        Window window17 = new Window(139,680);
        Window window18 = new Window(173,680);
        Window window19 = new Window(105,476);
        Window window22 = new Window(139,476);
        Window window25 = new Window(173,476);
        Window window20 = new Window(139,442);
        Window window23 = new Window(105,442);
        Window window26 = new Window(173,442);
        Window window21 = new Window(173,408);
        Window window24 = new Window(139,408);
        Window window27 = new Window(105,408);
        Window window28 = new Window(105,374);
        Window window29 = new Window(139,374);
        Window window30 = new Window(173,374);
        Window window31 = new Window(139,340);
        Window window32 = new Window(105,340);
        Window window33 = new Window(173,340);
        Window window34 = new Window(173,306);
        Window window35 = new Window(139,306);
        Window window36 = new Window(105,306);
        
        Window window37 = new Window(206,680);
        Window window38 = new Window(240,680);
        Window window39 = new Window(274,680);
        Window window40 = new Window(240,646);
        Window window41 = new Window(206,646);
        Window window42 = new Window(274,646);
        Window window43 = new Window(274,612);
        Window window44 = new Window(240,612);
        Window window45 = new Window(206,612);
        Window window46 = new Window(206,578);
        Window window47 = new Window(240,578);
        Window window48 = new Window(274,578);
        Window window49 = new Window(240,544);
        Window window50 = new Window(206,544);
        Window window51 = new Window(274,544);
        Window window52 = new Window(274,510);
        Window window53 = new Window(240,510);
        Window window54 = new Window(206,510);
        
        
        window1.draw(g2);
        window2.draw(g2);
        window3.draw(g2);
        window4.draw(g2);
        window5.draw(g2);
        window6.draw(g2);
        window7.draw(g2);
        window8.draw(g2);
        window9.draw(g2);
        window10.draw(g2);
        window11.draw(g2);
        window12.draw(g2);
        window13.draw(g2);
        window14.draw(g2);
        window15.draw(g2);
        window16.draw(g2);
        window17.draw(g2);
        window18.draw(g2);
        window19.draw(g2);
        window20.draw(g2);
        window21.draw(g2);
        window22.draw(g2);
        window23.draw(g2);
        window24.draw(g2);
        window25.draw(g2);
        window26.draw(g2);
        window27.draw(g2);
        window28.draw(g2);
        window29.draw(g2);
        window30.draw(g2);
        window31.draw(g2);
        window32.draw(g2);
        window33.draw(g2);
        window34.draw(g2);
        window35.draw(g2);
        window36.draw(g2);
        
        window37.draw(g2);
        window38.draw(g2);
        window39.draw(g2);
        window40.draw(g2);
        window41.draw(g2);
        window42.draw(g2);
        window43.draw(g2);
        window44.draw(g2);
        window45.draw(g2);
        window46.draw(g2);
        window47.draw(g2);
        window48.draw(g2);
        window49.draw(g2);
        window50.draw(g2);
        window51.draw(g2);
        window52.draw(g2);
        window53.draw(g2);
        window54.draw(g2);
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
