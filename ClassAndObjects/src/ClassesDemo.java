
public class ClassesDemo 
{
	
	void method1() 
	{
		System.out.println("Hello");
		
		return;//return statement is optional
	}
	
	
	void method3(int x)
	{
		x = x + 1;
	}
	
	
	int sum(int x, int y)
	{
		x = x - 1;
		return x + y;
	}
	
	Box getBox(double w, double l, double h) 
	{
		Box box1 = new Box();
		
		box1.w = w;
		box1.h = h;
		box1.l = l;
		
		return box1;
	}
	
	
	Circle getCircle(double r) 
	{
//		if (r > 0) 
//		{
//			Circle c = new Circle();
//			c.r = r;
//			return c;
//		}
//		
//		return null;
		
		Circle c = null;
		
		if (r > 0)
		{
			c = new Circle();
			c.r = r;
		}
		
		return c;
		
	}
	

}





















