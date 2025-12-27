package Javaprograms;

public class largestandsmallestelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {8,10,16,16,7,7,8,9,10,15,15};
			int largest = arr[0];
			int smallest = arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(arr[i] > largest)
				{
					largest=arr[i];
				}
				else if(arr[i] < smallest)
				{
					smallest = arr[i];
				}
			}
			System.out.println(largest);
			System.out.println(smallest);
	}
}