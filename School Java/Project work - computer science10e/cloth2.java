import java.util.Scanner;
public class cloth2
{
    Scanner input = new Scanner(System.in);
    double num;
    double cost;
    double discount;
    public void input()
    {
        System.out.println("Welcome to the Cloth company.");
        System.out.println("Enter total cost for discount rate and amount");
        num = input.nextInt();
    }
     void calculate()
    {
        if ( num < 2000.00 )
        {
            discount = 5.0/100;
        }
        else if ( num >= 2001.00 && num <= 5000.00 )
        {
            discount = 25.0/100;
        }
        else if ( num >= 5001.00 && num <= 10000.00)
        {
            discount = 35.0/100;
        }
        else if ( num > 10000.00 )
        { 
            discount = 50.0/100;
        }
        cost = num - (discount*num);
    }
    public static void main (String args[])
    {
        cloth2 obj = new cloth2();
        obj.input();
        obj.calculate();
        System.out.println("Total cost: " + obj.num);
        System.out.println("Discount%: " + obj.discount*100 +"%");
        System.out.println("Final Amount: " + obj.cost);
        System.out.println("Thank you");   

    }
}

    