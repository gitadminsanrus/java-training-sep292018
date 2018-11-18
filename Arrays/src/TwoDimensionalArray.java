
public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//array declaration
		int table[][];
		
		//array initialization
		//4 rows and 5 columns
		//new int[rows][columns]
		table = new int[4][5];
		
		int firstRowArray[] = table[0];
		int secondRowArray[] = table[1];
		
		//both the statements point to same location in 2D array
		table[0][0] = 100;
		firstRowArray[0] = 200;
		
		
		int x = table[0][0];
		
		//2nd way of creating a 2D array
		//Jagged array, which consists of uneven columns
		int table1[][] = 
			{
					{10, 20},
					{30, 40, 50},
					{60}
			};
		
		//3rd way of creating 2D array
		int table2[][] = new int[][] 
				{
					{10, 20, 30},
					{40, 50, 60, 70}, 
					{80, 90, 100}
				};
		
		System.out.println("Row count for table1 = " + table1.length);
		System.out.println("Column count for first row in table1 = " + table1[0].length);
		System.out.println("Column count for second row in table1 = " + table1[1].length);
		System.out.println("Column count for third row in table1 = " + table1[2].length);
		

	}

}


















