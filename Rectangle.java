
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    // instance variables - replace the example below with your own

    private double length;
    private double width;
    private double area;
    private double perimeter;
    private double diagonalLength;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(double newLength, double newWidth)
    {
        this.length = newLength;
        this.width = newWidth;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    
    public double getArea()
    {
        return area = this.width * this.length;
    }
    
    public double getPerimeter()
    {
        return perimeter = (this.width * 2) + (this.length * 2);
    }
    
    public double getDiagonalLength()
    {
        double a = Math.pow((this.width), 2) + Math.pow((this.length), 2);
        return diagonalLength = Math.pow(a, (0.5));
    }
    
    
}
