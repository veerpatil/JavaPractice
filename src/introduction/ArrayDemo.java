package introduction;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []myIntArray;
		myIntArray = new int[10];
		
		myIntArray[0]=100;
		myIntArray[1]=90;
		
		System.out.println("0 Index: "+ myIntArray[0]);
		System.out.println("1 Index: "+ myIntArray[1]);
		System.out.println("2 Index: "+ myIntArray[2]);
		
		
		String[] myStringArray = {"BMW", "Audi", "Honda"};
		
		System.out.println("0 Index: "+ myStringArray[0]);
		System.out.println("1 Index: "+ myStringArray[1]);
		System.out.println("2 Index: "+ myStringArray[2]);
		
		int len1= myIntArray.length;
		int len2=myStringArray.length;
		
		Arrays.sort(myStringArray);
		
		System.out.println("After Sort");
		
		for(int i=0;i <len2;i++)
		{
			System.out.println(myStringArray[i]);
		}
		
	}

}
