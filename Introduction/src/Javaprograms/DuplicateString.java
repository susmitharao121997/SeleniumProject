package Javaprograms;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Automation";
		int count = 0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j])
				{
					System.out.println("duplicate char is "+ ch[i]);
					count++;
				}
			}
		}
		System.out.println("Total duplicate characters are "+ count);     
	}

}
