import java.util.Scanner;
public class mobile
{
    Scanner input = new Scanner(System.in);
    int num = 0;
    double amt;
    double no;
    public void input()
    {
        System.out.println("Welcome to Airtel Mobile Services");
        System.out.println("Mobile plans as follows: ");
        System.out.println("first 100 calls : 2 Rs per call");
        System.out.println("100 calls to 250 calls : 1.5 Rs per call");
        System.out.println("250 calls to 500 calls : 1 Rs per call");
        System.out.println("Above 500 calls : 0.5 Rs per call");
        System.out.println("Enter number of calls of tarif for payment");
        System.out.println();
        num = input.nextInt();
    }
    void calculate()
    {
        if ( num <= 80 )
        {
            no = 2.50;
            amt = (float)num * no;
        }
        else if ( num > 80 && num <= 160 )
        {
            no = 0.60;
            
            amt = (float)(num - 80)* no;
            amt += 200.00;
        }
        else if ( num > 160 && num <= 320)
        { 
            no = 0.50;
            amt = (float)(num - 160) * no;
            amt += 80 * 2.50 + 80 * 0.60;
        }
        else 
        {
            no = 0.40;
            amt = (float)(num - 320) * no;
            amt += 80 * 2.50 + 80 * 0.60 + 160 * 0.50;
        }
    }
    public static void main (String args[])
    {
        mobile obj = new mobile();
        obj.input();
        obj.calculate();
        System.out.println("Number of calls : " + obj.num);
        System.out.println("rate : " + obj.no);
        System.out.println("Amount to be paid : " + obj.amt);
    }
}
        