
public class SearchDemo {

	public static void main(String[] args) {
		
		int[] values = {3, -1, 9, 4, 6, 2};
		SearchNumber searchNumber = new SearchNumber();
		
		int indexOf9 = searchNumber.getLocation(values, 9);
		int indexOfNegative1 = searchNumber.getLocation(values, -1);
		
		System.out.println("Index of number 9 is " + indexOf9);
		System.out.println("Index of number -1 is " + indexOfNegative1);

	}

}
