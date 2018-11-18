
public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//array declaration
		int values[];
		//int temp[];
		
		//array initialization
		values = new int[5];
		
		//creating a boolean array
		boolean results[] = new boolean[3]; 
		char chars[] = new char[4];
		String strs[] = new String[4];
		
		int index = 20;
		if (index >= 0 
				&& index < values.length) {
			values[index] = 100;			
		}
		
		values[2] = 100;
		
		int tempValue = values[2];
		tempValue = tempValue + 1;
		
		System.out.println("tempValue = " + tempValue);
		
		//temp = values;
		//temp = null;
		
		//values = new int[10];
		
		//reading an element from an array
		System.out.println("values[0] = " + values[0]);
		System.out.println("values[1] = " + values[1]);
		System.out.println("values[2] = " + values[2]);
		System.out.println("values[3] = " + values[3]);
		System.out.println("values[4] = " + values[4]);
		
		System.out.println("results[0] = " + results[0]);
		System.out.println("results[1] = " + results[1]);
		System.out.println("results[2] = " + results[2]);
		
		
		System.out.println("chars[0] = " + chars[0]);
		System.out.println("chars[1] = " + chars[1]);
		System.out.println("chars[2] = " + chars[2]);
		System.out.println("chars[3] = " + chars[3]);
		
		
		System.out.println("strs[0] = " + strs[0]);
		System.out.println("strs[1] = " + strs[1]);
		System.out.println("strs[2] = " + strs[2]);
		System.out.println("strs[3] = " + strs[3]);
		
		
		//2nd way of creating an array
		int values1[] = {10, 20, 30};
		
		//3rd way of creating an array
		int values2[] = new int[] {40, 80};
		
		values = null;
		
		if (values != null) {
			System.out.println("Length of values[] array = " + values.length);
		}
		
		
		
		
		

	}

}


















