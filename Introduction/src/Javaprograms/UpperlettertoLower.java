package Javaprograms;

import java.util.Scanner;

public class UpperlettertoLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upper letter Characters");
		String input = sc.nextLine();
		for(int i=0;i<input.length();i++)
		{
			Character ch = input.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				Character c =  (char) (ch-32);
				System.out.print(c);
			}
			else if(ch >= 'A' && ch <= 'Z')
			{
				Character c =  (char) (ch+32);
				System.out.print(c);
			}
			else
			{
				System.out.print(ch);
			}
		}
		
	}

}
