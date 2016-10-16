
/**
 * Simple Rectangle class for COMP 1409 Lab05 TakeHome
 * 
 * @author Krzysztof Szczurowski
 * @version 1.1 / 10/16/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2087631/View
 */
public class Rectangle
{
    private static int counter = 0;
    public static final double DEFAULT_LENGTH = 5.0;
    
    public static final double DEFAULT_WIDTH = 5.0;
   
    private double rectangleLengthInCm;
    private double rectangleWidthInCm;
    
    public Rectangle()
    {
        counter++;
        this.rectangleLengthInCm = DEFAULT_LENGTH;
        this.rectangleWidthInCm = DEFAULT_WIDTH;
    }
    
    public Rectangle(int rectangleLengthInCm, int rectangleWidthInCm)
    {
        counter++;
        if(rectangleLengthInCm < 0 || rectangleWidthInCm < 0)
        {
            this.rectangleLengthInCm = DEFAULT_LENGTH;
            this.rectangleWidthInCm = DEFAULT_WIDTH;
        }
        else
        {
            this.rectangleLengthInCm = rectangleLengthInCm;
            this.rectangleWidthInCm = rectangleWidthInCm;
        }
    }
    
    public Rectangle(double rectangleLengthInCm, double rectangleWidthInCm)
    {
        counter++;
        if(rectangleLengthInCm < 0 || rectangleWidthInCm < 0)
        {
            this.rectangleLengthInCm = DEFAULT_LENGTH;
            this.rectangleWidthInCm = DEFAULT_WIDTH;
        }
        else
        {
            this.rectangleLengthInCm = rectangleLengthInCm;
            this.rectangleWidthInCm = rectangleWidthInCm;
        }
    }
    
    //Properties
    public double getRectangleLengthInCm()
    {
        return this.rectangleLengthInCm;
    }
    
    public void setrRectangleLengthInCm(double rectangleLengthInCm)
    {
        this.rectangleLengthInCm = (rectangleLengthInCm < 0 ? DEFAULT_LENGTH : rectangleLengthInCm);
    }
    
    public double getrectangleWidthInCm()
    {
        return this.rectangleWidthInCm;
    }
    
    public void setRectangleWidthInCm(double rectangleWidthInCm)
    {
        this.rectangleWidthInCm = (rectangleWidthInCm < 0 ? DEFAULT_WIDTH : DEFAULT_WIDTH);
    }
    
    public boolean isSquare()
    {
        return (rectangleLengthInCm == rectangleWidthInCm ? true : false);
    }
    
    public double getArea(char format)
    {
        double result;
        switch(format)
        {
            case 'c' :
                return rectangleLengthInCm * rectangleWidthInCm;
            case 'm' :
                return (rectangleLengthInCm * rectangleWidthInCm) / 10000;
            case 'i' :
                return (rectangleLengthInCm * rectangleWidthInCm) / 6.4516;
            default: 
                return -1;
        }
    }
    
    public double getPerimeter()
    {
        return ((2 * rectangleLengthInCm) + (2 * rectangleWidthInCm));
    }
    
    public static int getCount()
    {
        return counter;
    }
    
    public String toString()
    {
        return String.format("Rectagular Length: " + rectangleLengthInCm + 
                             "Rectagular Widht: " + rectangleWidthInCm);
    }
    
}
