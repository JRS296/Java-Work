//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 7(Program to check if a number is a Keith number or not)
import java.util.Scanner;
public class Keith//initialization of class
{
    public static void main(String[] args) //main method
    { 
        Scanner sc = new Scanner( System.in ); 
        System.out.print("Input a number: "); 
        int n = sc.nextInt(); //inputs a number from the user
        int n1 = n;
        String s = Integer.toString(n);
        int d=s.length();
        int arr[]=new int[n];//creation of array
        int i, sum; 
        for(i=d-1; i>=0; i--)//for loop to split number into its digits
        {
            arr[i]=n1 % 10;
            n1=n1/10;
        }
        i=d; sum=0;
        while(sum<n)
        {
            sum = 0;
            for(int j=1; j<=d; j++)
            {
                sum=sum+arr[i-j];
            }
            arr[i]=sum;//addition of array elements to sum
            i++;
        }
        if(sum==n)
            System.out.println("It is a Keith Number");
        else
            System.out.println("It is not a Keith Number");
    }//end of main method
}//end of class

/*
Input a number: 1104
It is a Keith Number

Input a number: 458
It is not a Keith Number

 */