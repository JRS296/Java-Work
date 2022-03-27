import java.util.Scanner;
import java.lang.Math;
class bank
{
    public static void main ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposited amount");
        double p = input.nextInt();
        System.out.println("Enter number of years");
        double n = input.nextInt();
        double r;
        if ( n < 1.00 )
        {
         r = 9.00;
        }
        else if ( n >= 1.00 && n < 2.00 )
        {
         r = 10.00;
        }
        else if ( n >= 2.00 && n < 3.00 )
        {
         r = 11.00;
        }
        else if ( n >= 3.00  )
        {
         r = 12.00;
        }
        else 
        {
            r = 0;
            System.out.println("Invalid entry");
        }
        double amt;
        amt = p * Math.pow(1 + r / 100 , n);
        System.out.println("Amount: " + amt);
    }
}
        