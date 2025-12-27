package Javaprograms;

public class SecondLargestInArray {
	public static void main(String[] args)
	{
		int[] arr = {8,10,16,16,7,7,8,9,10,15,15};
		int firstl = arr[0];
		int secondl = -1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>firstl)
			{
				secondl = firstl;
				firstl=arr[i];
			}
			else if(arr[i]>secondl && arr[i]!= firstl)
			{
				secondl = arr[i];
			}
		}
		System.out.println(secondl);
	}
}
