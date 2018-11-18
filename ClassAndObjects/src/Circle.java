
/**
 * 
 * Defines a Circle object.
 * 
 * Default values for an object are:-
 * 1. Whole numbers (byte, short, int, long) will have 0
 * 2. Real or Floating point numbers (float, double) will have 0.0
 * 3. boolean variable will have false
 * 4. char variables will have null character '\0'
 * 5. Object variables such as String, Array will have 'null' 
 * 
 * @author sanrustrainingcentre
 * @since 1.0.0
 * @version 1
 *
 */
public class Circle 
{
	//radius is the state or instance variable of a circle object
	//by default r is assigned to 0.0
	double r;
	String name;
	int color;
	
	
	double area() 
	{		
		double area = (22.0 / 7) * r * r;
		
		return area;
	}
		
	
}




























