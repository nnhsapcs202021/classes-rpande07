

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MileageTrackerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MileageTrackerTest
{
    @Test
    public void testIncrementMilesDriven()
    {
        MileageTracker testTracker = new MileageTracker();
        testTracker.incrementMilesDriven(10);
        double amount = testTracker.getMilesDriven();
        assertEquals(10, amount, 1e-6);
        testTracker.incrementMilesDriven(5);
        amount = testTracker.getMilesDriven();
        assertEquals(15,amount, 1e-6);
    }
    @Test
    public void testIncrementFuelConsumed()
    {
        MileageTracker testTracker = new MileageTracker();
        testTracker.incrementFuelConsumed(2.5);
        double amount = testTracker.getFuelConsumed();
        assertEquals(2.5, amount, 1e-6);
        
        testTracker.incrementFuelConsumed(0.5);
        amount = testTracker.getFuelConsumed();
    }
    
    @Test
    public void testGetMileage()
    {
        MileageTracker testTracker = new MileageTracker();
        testTracker.incrementMilesDriven(100);
        testTracker.incrementFuelConsumed(4);
        double mileage = testTracker.getMileage();
        assertEquals(25.0, mileage, 1e-6);
    }
    
    @Test
    public void testSetVIN()
    {
        MileageTracker testTracker = new MileageTracker();
        String vin = new String("V176342FGB45B323A");
        testTracker.setVIN(vin);
        String returnedVIN = testTracker.getVIN();
        assertEquals(vin, returnedVIN);
    }
}
