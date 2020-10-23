
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendingMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    @Test
    public void testFillUp()
    {
        VendingMachine testMachine = new VendingMachine();
        int numCans = testMachine.fillUp(10);

        assertEquals(numCans, 20);       
    }

    @Test
    public void testInsertToken()
    {
        VendingMachine testMachine = new VendingMachine();
        int numTokens = testMachine.insertToken();

        assertEquals(numTokens, 1);           
    }

    @Test
    public void testGetCanCount()
    {
        VendingMachine testMachine = new VendingMachine();
        int canCount = testMachine.getCanCount();

        assertEquals(canCount, 10);   
    }
    
    @Test
    public void testGetTokenCount()
    {
        VendingMachine testMachine = new VendingMachine();
        int tokenCount = testMachine.getTokenCount();

        assertEquals(tokenCount, 0);   
    }
}
