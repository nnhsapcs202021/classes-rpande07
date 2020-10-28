import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Write a description of class TargetComponent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent
{
   @Override
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;  // cast to Graphics2D object

      Target target = new Target(0, 0); // initialize a new Target object
      
      // draws target
      target.draw(g2); 
   }
}
