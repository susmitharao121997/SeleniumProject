package Javaprograms;

import java.util.Arrays;

public class DeleteDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int count =0;
				int[] arr = {1,1,2,3,4,5,8,8,9};
				for(int i=0;i<arr.length;i++)
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i] == arr[j])
						{
							System.out.println("duplicate char is "+ arr[i]);
							count++;
						}
					}
				}
				System.out.println("Total duplicate characters are "+ count);     
			}

		}
