
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum=5;
		String webSite = "susmitha academy";
		char letter = 'r';
		double dec = 5.99;	
		boolean myCard = true;
		System.out.println(myNum + " " + "is number");
		System.out.println(webSite);
		
		//ARRAYS-
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		
		int[] arr1 = {1,2,3,4,5,6,7};
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}		
		System.out.println();
		
		String[] name = {"susmitha","Rao","Rishi"};
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}	
		for(String s : name)
		{
			System.out.println(s);
		}
	}

}
