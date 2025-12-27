package Javaprograms;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k=1;
int n=3;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		int mul = n*k;
		System.out.print(mul);
		System.out.print("\t");
		k++;
	}
	System.out.println(" ");
}
	}

}
