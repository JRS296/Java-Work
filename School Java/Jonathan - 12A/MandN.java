//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 10(M AND N Problem)
import java.util.*;
cla MandN//initialization of class
{
    int sumDig(long n) // Function to find sum of digits of a number
    {
        int sum = 0, d;
        while(n>0)
        {
            d = (int)(n%10);
            sum = sum + d;
            n = n/10;
        }
        return sum;//returns sum of digits
    }
    int countDig(long n) // Function to count the number of digits in a number
    {
        String s = Long.toString(n);
        int len = s.length();
        return len; //returns number of digits in number
    }
    public static void main()throws Exception//main method
    {
        MandN ob = new MandN();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of 'm' from 100 to 10000 : ");
        int m = sc.nextInt();//inputs value for m
        System.out.print("Enter a value of n from 1 to 99 : ");
        int n = sc.nextInt();//inputs value for n

        if(m<100 || m>10000 || n<1 || n>99)//checks if condition is satisfied
        {
            System.out.println("Invalid Input");
        }
        else
        {
            int i = m; // Required number can be out of range of 'int'
            /* The required number must be greater than 'm',
            so loop will go on as long as that number is not obtained.*/
            while(ob.sumDig(i)!=n)
            {
                i=i+1;
            }
            System.out.println("The required number = "+i);
            System.out.println("Total number of digits = "+ob.countDig(i));//prints output 
        }
    }//end of main method
}//end of class
