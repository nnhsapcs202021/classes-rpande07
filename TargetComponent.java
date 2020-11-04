import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Draws target with alternating black and white rings.
 *
 * @author Ria Pande
 * @version 10/28/20
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
