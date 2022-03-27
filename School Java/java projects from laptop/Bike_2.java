import java.util.Scanner;
public class Bike_2
{
    Scanner input = new Scanner(System.in);
    int num;
    int v;
    int su;
    int sum;
    public void input()
    {
        System.out.println("Welcome to Yamaha bike rentals.");
        System.out.println("Enter number of days for rental");
        num = input.nextInt();
    }
    void calculate()
    {
        if ( num <= 5 )
        {
            v = 500;
            su = num * v;
        }
        else if ( num > 5 && num <= 10 )
        {
            v = 400;
            sum = v * (num - 5) ;
            su = 2500 + sum;
        }
        else 
        { 
            v = 200;
            sum = v * (num - 10);
            su = 4500 + sum;
        }
    }
    public static void main (String args[])
    {
        Bike_2 obj = new Bike_2();
        obj.input();
        obj.calculate();
        System.out.println("Number of days : " + obj.num);
        System.out.println("rate : " + obj.v);
        System.out.println("Amount to be paid : " + obj.su);
    }
}
        






