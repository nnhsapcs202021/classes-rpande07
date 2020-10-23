
/**
 * Write a description of class VendingMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VendingMachine
{
    // instance variables - replace the example below with your own
    private int cans;
    private int tokens;

    /**
     * Constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        // initialise instance variables
        this.cans = 10;
        this.tokens = 0;
    }

    /**
     * Adds cans to this.cans 
     */
    public void fillUp(int addCans)
    {
        this.cans = this.cans + addCans;
    }

    /**
     * Adds one token to this.tokens and takes one can from this.cans
     */
    public void insertToken()
    {
        this.cans = this.cans - 1;
        this.tokens = this.tokens + 1;
    }

    /**
     * Returns number of tokens
     */
    public int getTokenCount()
    {
        return this.tokens;
    }

    /**
     * Returns number of cans
     */
    public int getCanCount()
    {
        return this.cans;
    }
}
