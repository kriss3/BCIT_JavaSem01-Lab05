
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
    public static final double DEFAULT_RADIUS = 0;
    
    private double radiusInCentimeters;
    
    public Circle()
    {
        this.radiusInCentimeters = DEFAULT_RADIUS;
        counter++;
    }
    
    public Circle(int newRadius)
    {
        this.radiusInCentimeters = (newRadius < 0 ? DEFAULT_RADIUS : newRadius);
        counter++;
    }
    
    public Circle(double newRadius)
    {
        this.radiusInCentimeters = (newRadius < 0 ? DEFAULT_RADIUS : newRadius);
    }
    
    //Properties
    public double getRadiusInCentimeters()
    {
        return this.radiusInCentimeters;
    }
    
    public void setRadiusInCentimeters(double value)
    {
        this.radiusInCentimeters = (value < 0 ? DEFAULT_RADIUS : value);
    }
    
    //Public methods
    public double getArea(char format)
    {
        return 0.0;
    }
    
    public double getCircumference()
    {
        return 0.0;
    }
    
    public static int getCount()
    {
        return counter;
    }

}
