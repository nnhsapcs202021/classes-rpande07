
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 *
 * @author rpande
 * @version 28 October 2020
 * 
 * Building class creates buildings with different heights
 * and coordinates. Window Class directly connects to 
 * Building class in order to get the buildings' height.
 */
public class Building
{
    /**
     * 
     * defines important integers (length, width, and x and y coordinates)
     * along with window objects (54 windows max per building)
     * 
     */

    private int buildingLength;
    private int buildingWidth;
    private int xLeft;
    private int yTop;
    private Window window1;
    private Window window2;
    private Window window3;
    private Window window4;
    private Window window5;
    private Window window6;
    private Window window7;
    private Window window8;
    private Window window9;
    private Window window10;
    private Window window11;
    private Window window12;
    private Window window13;
    private Window window14;
    private Window window15;
    private Window window16;
    private Window window17;
    private Window window18;
    private Window window19;
    private Window window20;
    private Window window21;
    private Window window22;
    private Window window23;
    private Window window24;
    private Window window25;
    private Window window26;
    private Window window27;
    private Window window28;
    private Window window29;
    private Window window30;
    private Window window31;
    private Window window32;
    private Window window33;
    private Window window34;
    private Window window35;
    private Window window36;
    private Window window37;
    private Window window38;
    private Window window39;
    private Window window40;
    private Window window41;
    private Window window42;
    private Window window43;
    private Window window44;
    private Window window45;
    private Window window46;
    private Window window47;
    private Window window48;
    private Window window49;
    private Window window50;
    private Window window51;
    private Window window52;
    private Window window53;
    private Window window54;

    /**
    Constructs a building.
    @param initialX the x coordinate of the top left corner of building
    @param initialY the y coordinate of the top left corner of building
    @param width the width of the building
    @param length the length/height of the building
     */
    public Building(int initialX, int initialY, int width, int length)
    {
        this.buildingLength = length;
        this.buildingWidth = width;
        this.xLeft = initialX;
        this.yTop = initialY;
    }

    /**
    @param g2 the graphics context
    draws building with windows
     */
    public void draw(Graphics2D g2)
    {   
        Rectangle2D.Double building = 
            new Rectangle2D.Double(this.xLeft, this.yTop, this.buildingWidth, this.buildingLength);

        g2.setPaint(Color.black);
        g2.fill(building);

        /**
         * 
         * for every 100 in height, add 9 windows to building.
         * 
         */
        if (buildingLength >= 100)
        {
            Window window1 = new Window(xLeft + 5,612);
            Window window2 = new Window(xLeft + 39,612);
            Window window3 = new Window(xLeft + 73,612);
            Window window4 = new Window(xLeft + 5,646);
            Window window5 = new Window(xLeft + 39,646);
            Window window6 = new Window(xLeft + 73,646);
            Window window7 = new Window(xLeft + 5,680);
            Window window8 = new Window(xLeft + 39,680);
            Window window9 = new Window(xLeft + 73,680);

            window1.draw(g2);
            window2.draw(g2);
            window3.draw(g2);
            window4.draw(g2);
            window5.draw(g2);
            window6.draw(g2);
            window7.draw(g2);
            window8.draw(g2);
            window9.draw(g2);
        }
        if (buildingLength >= 200)
        {
            Window window10 = new Window(xLeft + 5,578);
            Window window11 = new Window(xLeft + 39,578);
            Window window12 = new Window(xLeft + 73,578);
            Window window13 = new Window(xLeft + 5,544);
            Window window14 = new Window(xLeft + 39,544);
            Window window15 = new Window(xLeft + 73,544);
            Window window16 = new Window(xLeft + 5,510);
            Window window17 = new Window(xLeft + 39,510);
            Window window18 = new Window(xLeft + 73,510);

            window10.draw(g2);
            window11.draw(g2);
            window12.draw(g2);
            window13.draw(g2);
            window14.draw(g2);
            window15.draw(g2);
            window16.draw(g2);
            window17.draw(g2);
            window18.draw(g2);
        }
        if (buildingLength >= 300)
        {  
            Window window19 = new Window(xLeft + 5,476);
            Window window20 = new Window(xLeft + 39,476);
            Window window21 = new Window(xLeft + 73,476);
            Window window22 = new Window(xLeft + 39,442);
            Window window23 = new Window(xLeft + 5,442);
            Window window24 = new Window(xLeft + 73,442);
            Window window25 = new Window(xLeft + 73,408);
            Window window26 = new Window(xLeft + 39,408);
            Window window27 = new Window(xLeft + 5,408);

            window19.draw(g2);
            window20.draw(g2);
            window21.draw(g2);
            window22.draw(g2);
            window23.draw(g2);
            window24.draw(g2);
            window25.draw(g2);
            window26.draw(g2);
            window27.draw(g2);
        }
        if (buildingLength >= 400)
        {
            Window window28 = new Window(xLeft + 5,374);
            Window window29 = new Window(xLeft + 39,374);
            Window window30 = new Window(xLeft + 73,374);
            Window window31 = new Window(xLeft + 39,340);
            Window window32 = new Window(xLeft + 5,340);
            Window window33 = new Window(xLeft + 73,340);
            Window window34 = new Window(xLeft + 73,306);
            Window window35 = new Window(xLeft + 39,306);
            Window window36 = new Window(xLeft + 5,306);

            window28.draw(g2);
            window29.draw(g2);
            window30.draw(g2);
            window31.draw(g2);
            window32.draw(g2);
            window33.draw(g2);
            window34.draw(g2);
            window35.draw(g2);
            window36.draw(g2);
        }
        if (buildingLength >= 500)
        {
            Window window37 = new Window(xLeft + 5,272);
            Window window38 = new Window(xLeft + 39,272);
            Window window39 = new Window(xLeft + 73,272);
            Window window40 = new Window(xLeft + 39,238);
            Window window41 = new Window(xLeft + 5,238);
            Window window42 = new Window(xLeft + 73,238);
            Window window43 = new Window(xLeft + 73,204);
            Window window44 = new Window(xLeft + 39,204);
            Window window45 = new Window(xLeft + 5,204);

            window37.draw(g2);
            window38.draw(g2);
            window39.draw(g2);
            window40.draw(g2);
            window41.draw(g2);
            window42.draw(g2);
            window43.draw(g2);
            window44.draw(g2);
            window45.draw(g2);
        }
        if (buildingLength == 600)
        {
            Window window46 = new Window(xLeft + 5,170);
            Window window47 = new Window(xLeft + 39,170);
            Window window48 = new Window(xLeft + 73,170);
            Window window49 = new Window(xLeft + 39,136);
            Window window50 = new Window(xLeft + 5,136);
            Window window51 = new Window(xLeft + 73,136);
            Window window52 = new Window(xLeft + 73,102);
            Window window53 = new Window(xLeft + 39,102);
            Window window54 = new Window(xLeft + 5,102);

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
    }
}