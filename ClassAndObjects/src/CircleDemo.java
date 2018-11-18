
public class CircleDemo {

	public static void main(String[] args) {
		
		//Object variable declaration
		Circle c1;
		
		//object initialization
		c1 = new Circle();
		
		c1.name = "Blue Circle";
		c1.r = 10;
		
		Circle c2 = new Circle();
		c2.r = 50;
		
		Circle c3 = c2;
		c3.r = 150;
				
		System.out.println("Radius of circle1 object = " + c1.r);
		System.out.println("Name of circle1 object = " + c1.name);
		System.out.println("Area of circle1 object = " + c1.area());
		
		System.out.println("Radius of circle2 object = " + c2.r);
		System.out.println("Area of circle2 object = " + c2.area());
		System.out.println("Radius of circle3 object = " + c3.r);

	}

}
