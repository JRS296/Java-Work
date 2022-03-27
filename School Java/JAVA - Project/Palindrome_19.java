import java.util.*;
class Palindrome_19
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        if(n < 10)
        {
            System.out.println("Invalid input, please try again");
            System.exit(0);
        }
        //Accepting the sumber and checking if contains more than 1 digit
        int temp, d, rev = 0;
        int sum = 0;
        for(int i = 1; i <= 15; i++)
        {
            temp = n;             
            while(temp > 0)
            {
                d = temp % 10;
                rev = (rev * 10) + d;
                temp = temp / 10;
            }
            sum = rev + n;
            if(rev == n)
            {
                System.out.println("Step = " + i);
                System.out.println("Number = " + n);
                System.out.println("Reverse = " + rev);
                System.out.println();
                System.out.println("Therefore the palindrome = " + rev + " in " + i + " steps");
                break;
            }
            else
            {
                System.out.println("Step : " + i);
                System.out.println("Number : " + n);
                System.out.println("Reverse : " + rev);
                System.out.println("Sum : " + sum);
                System.out.println();
                n = sum;
                sum = 0;
                rev = 0;
                //Resetting the values of the variables
            }
        }
    }
}
/*
 Enter a number
232
Step = 1
Number = 232
Reverse = 232

Therefore the palindrome = 232 in 1 steps
 */