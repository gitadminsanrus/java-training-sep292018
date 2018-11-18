
public class IfElseDemo {

	public static void main(String[] args) {
		
		
		int i = -1;
		
		if (i >= 0)
		{
			i++;
		}
		
		System.out.println("i = " + i);
		
		if (i == -1)
			System.out.println("i = " + i);
			i++;
			System.out.println("i = " + i);
		
		/*
		 * Multi-line commenting
		 * 
		 * x >= 0 and x < 100, print small
		 * x >= 100 and x < 1000, print medium
		 * x >= 1000 and x < 10000, print large
		 * x >= 10000, print infinite
		 * 
		 * else, for all other range, print invalid data
		 * 
		 * 
		 */
		
		int x = 1005;
		
		if (x >= 0 && x < 100)
		{
			System.out.println("small");
		}
		else if (x >= 100 && x < 1000)
		{
			System.out.println("medium");
		}
		else if (x >= 1000 && x < 10000)
		{
			System.out.println("large");
		}
		else if (x >= 10000)
		{
			
		}
		else
		{
			System.out.println("invalid data.");
		}
		
		
		if (x >= 10000) 
		{
			System.out.println("infinite");
			
			 int y = 20;
			 if (y > 0) 
			 {
				 int z = 30;
				 
				 if (z > 10 && x > 10) 
				 {
					 
				 }
			 }
			 else if (y > 10)
			 {
				 
			 }
			 else 
			 {
				 
			 }
			 
//			 System.out.println(z);
		} 
		else if (x >= 1000) 
		{
//			System.out.println(y);
			System.out.println("large");
		}
		else if (x >= 100)
		{
			System.out.println("medium");
		}
		else if (x >= 0)
		{
			System.out.println("small");
		}
		else
		{
			System.out.println("invalid data");
		}
		
		
		

	}

}














