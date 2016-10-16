
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
    
    /**
     * Parameterless constructor <br>
     * Increments static counter when new object is created <br>
     * Assigns default values to Length and Width
     */
    public Rectangle()
    {
        counter++;
        this.rectangleLengthInCm = DEFAULT_LENGTH;
        this.rectangleWidthInCm = DEFAULT_WIDTH;
    }
    
    /**
     * Custom constructor for Rectangle class <br>
     * @param lengthAndWidht of Length and Widdth as Integer
     */
    public Rectangle(int lengthAndWidht)
    {
        if(lengthAndWidht < 0)
        {
            this.rectangleLengthInCm = DEFAULT_LENGTH;
            this.rectangleWidthInCm = DEFAULT_WIDTH;
        }
        else
        {
            this.rectangleLengthInCm = this.rectangleWidthInCm = lengthAndWidht;
        }
    }
    
    /**
     * Custom constructor for Rectangle class <br>
     * @param lengthAndWidht of Length and Widdth as Double
     */
    public Rectangle(double lengthAndWidht)
    {
        if(lengthAndWidht < 0)
        {
            this.rectangleLengthInCm = DEFAULT_LENGTH;
            this.rectangleWidthInCm = DEFAULT_WIDTH;
        }
        else
        {
            this.rectangleLengthInCm = this.rectangleWidthInCm = lengthAndWidht;
        }
    }
    
    /**
     * Custom constructor taking two params for rectangle Length and Width <br>
     * Increment class level counter; <br>
     * Checks passed in parameters and if any of them is less then 0 default values
     * are assigned to instance variables
     * @param rectangle length as int;
     * @param rectangle width as int
     */
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
    
    /**
     * Custom constructor taking two params for rectangle Length and Width <br>
     * Increment class level counter; <br>
     * Checks passed in parameters and if any of them is less then 0 default values
     * are assigned to instance variables
     * @param rectangle length as double;
     * @param rectangle width as double
     */
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
    /**
     * Public getter for RectangleLengthInCm <br>
     * It does not take any parameters
     * @return length of rectangle as Double
     */
    public double getRectangleLengthInCm()
    {
        return this.rectangleLengthInCm;
    }
    
    /**
     * Public setter for RectangleLengthInCm <br>
     * It does return any value
     * @param new value of rectangle Length in cm as Double
     */
    public void setRectangleLengthInCm(double rectangleLengthInCm)
    {
        this.rectangleLengthInCm = (rectangleLengthInCm < 0 ? DEFAULT_LENGTH : rectangleLengthInCm);
    }
    
    /**
     * Public getter for RectangleWidthInCm <br>
     * It does not take any parameters
     * @return width of rectangle as Double
     */
    public double getrectangleWidthInCm()
    {
        return this.rectangleWidthInCm;
    }
    
    /**
     * Public setter for RectangleWidthInCm <br>
     * It does return any value
     * @param new value of rectangle widht in cm as double
     */
    public void setRectangleWidthInCm(double rectangleWidthInCm)
    {
        this.rectangleWidthInCm = (rectangleWidthInCm < 0 ? DEFAULT_WIDTH : DEFAULT_WIDTH);
    }
    
    //Public methods
    /**
     * Public method isSquare takes no parametes and returns flag whether Rectangles
     * is actually a Square
     * @return a flag as a Boolean
     */
    public boolean isSquare()
    {
        return (rectangleLengthInCm == rectangleWidthInCm ? true : false);
    }
    
    /**
     * Public method that calculates 
     * @param format as char
     * @return area of a rectangle as double
     */
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
    
    /**
     * Public method that calculates the perimeteer of a rectangle <br>
     * It does not take any input parameters
     * @return returns perimeter of a rectangle as double;
     */
    public double getPerimeter()
    {
        return ((2 * rectangleLengthInCm) + (2 * rectangleWidthInCm));
    }
    
    /**
     * Class level method that return a number of created Rectangle objects
     * @return counter of all rectangles as int
     */
    public static int getCount()
    {
        return counter;
    }
    
    /**
     * Public method showing details of the rectagled class (its private members) <br>
     * It does not take any parameters <br>
     * @return details of rectangle class as String
     */
    public String toString()
    {
        return String.format("Rectagular Length: " + rectangleLengthInCm + 
                             "Rectagular Widht: " + rectangleWidthInCm);
    }
}
