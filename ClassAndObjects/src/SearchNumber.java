
public class SearchNumber 
{

	int getLocation(int[] arr, int num)
	{
		
		for (int index = 0; index < arr.length; index++)
		{
			if (arr[index] == num)
			{
				return (index + 1);
			}
		}
		
		return -1;
	}
	
}
