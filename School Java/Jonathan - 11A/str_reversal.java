//Jonathan Rufus Samuel
//11A

import java.util.Scanner;
public class str_reversal 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a string");
	    Scanner input = new Scanner(System.in);
	    String myStr = input.nextLine();
		//create Method and pass and input parameter string 
		String reversed = reverseString(myStr);
		System.out.println("The reversed string is: " + reversed);
	}
	//Method take string parameter and check string is empty or not
	public static String reverseString(String myStr)
	{
		if (myStr.isEmpty())
		{
		 System.out.println("String in now Empty");	
		 return myStr;
		}
		//Calling Function Recursively
		System.out.println("String to be passed in Recursive Function: "+myStr.substring(1));
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	}
}
/*
Enter a string
Chicken
String to be passed in Recursive Function: hicken
String to be passed in Recursive Function: icken
String to be passed in Recursive Function: cken
String to be passed in Recursive Function: ken
String to be passed in Recursive Function: en
String to be passed in Recursive Function: n
String to be passed in Recursive Function: 
String in now Empty
The reversed string is: nekcihC

 */