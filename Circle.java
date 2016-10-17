
/**
 * Simple Circle class for InClass Lab05
 * 
 * @author Krzysztof Szczuorwski
 * @version 1.1
 * @since 10/16/2016
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2087631/View
 */
public class Circle
{
    private static int counter  = 0;
    public static final double DEFAULT_RADIUS = 5.0;
    private static final double PI = 3.1415926;
    
    private double radiusInCentimeters;
    
    /**
     * Parameterless constructor of a Circle objects <br>
     * Increments class level counter by one <br>
     * Assigns default radius to the instance variable radiusInCentimeters
     */
    public Circle()
    {
        this.radiusInCentimeters = DEFAULT_RADIUS;
        counter++;
    }
    
    /**
     * Custom Circle class constructor which take one parameter, newRadius <br>
     * @param new value of a newRadius as Integer
     */
    public Circle(int newRadius)
    {
        this.radiusInCentimeters = (newRadius < 0 ? DEFAULT_RADIUS : newRadius);
        counter++;
    }
    
    /**
     * Custom Circle class constructor which take one parameter, newRadius <br>
     * @param new value of a newRadius as Double
     */
    public Circle(double newRadius)
    {
        this.radiusInCentimeters = (newRadius < 0 ? DEFAULT_RADIUS : newRadius);
    }
    
    //Properties
    /**
     * Public getter that return value of a circle radius in cm <br>
     * It does not take any parameters
     * @retun returns value of the radius as double
     */
    public double getRadiusInCentimeters()
    {
        return this.radiusInCentimeters;
    }
    
    
     /**
     * Public setter that sets the value of a circle radius in cm <br>
     * It does not return any value
     * @param takes value of the new radius as double
     */
    public void setRadiusInCentimeters(double value)
    {
        this.radiusInCentimeters = (value < 0 ? DEFAULT_RADIUS : value);
    }
    
    //Public methods
    /**
     * Public method getArea that calculates the area of the circle <br>
     * It takes one paramer of the format of the return calculation. <br>
     * If the passed character is non-of the "known" formats, the method returns -1
     * returns value of the calculation
     * @param takes parameter format as Char
     * @return returns value of the circle area as Double
     */
    public double getArea(char format)
    {
        switch(format)
        {
            case 'c' : 
                return (PI * radiusInCentimeters * radiusInCentimeters);
            case 'm' : 
                return (PI * radiusInCentimeters * radiusInCentimeters) / 10000;
            case 'i' : 
                return (PI * radiusInCentimeters * radiusInCentimeters) / 6.4516;
            default : 
                return -1;
        }
    }
    
    /**
     * Public method that calculates the circumference of the circle. <br>
     * It does not take any paramters and returns 
     * the value of the circle's circumference
     * @return calculated value of circle's circumference as Double
     */
    public double getCircumference()
    {
        return (2 * PI * radiusInCentimeters);
    }
    
    /**
     * Public, class level method that returns total number of Circle object created. <br>
     * It does not take any paramter.
     * @return returns total number of circle objects created as Integer
     */
    public static int getCount()
    {
        return counter;
    }
    
    /**
     * Public method showing details of Circle class (its private members) <br>
     * It does not take any parameters <br>
     * @return private member and their values as String
     */
    public String toString()
    {
        return String.format("Circle Radius: " + radiusInCentimeters);
    }
}
