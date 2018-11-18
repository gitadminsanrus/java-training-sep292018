
public class SwitchDemo {

	public static void main(String[] args) {
		
		int x = 5;
		
		final int y = 12;
		
		switch(x)
		{
			case 9:
			case 11:
				System.out.println("case 9 or 11 matched.");
				break;
				
			case y:
				System.out.println("case 12 matched.");
				break;
				
			case 10:
				System.out.println("case 10 matched.");
				break;
				
			default:
				System.out.println("default case matched");
				break;
						
		}
		
		if (x == 9 || x == 11) 
		{
			System.out.println("case 9 or 11 matched.");
		}
		else if (x == 12)
		{
			System.out.println("case 12 matched.");
		}
		else if (x == 10)
		{
			System.out.println("case 10 matched.");
		}
		else
		{
			System.out.println("default case matched");
		}
		
		
		char ch = 'A';
		switch (ch)
		{
			case 'A':
			case 'B':
				break;
		}

	}

}











