import java.util.Scanner;
public class Number_2
{
    Scanner input = new Scanner(System.in);
    int x;
    int sum = 0;
    int y;
    int prod = 1;
    int count = 0;
    public void input()
    {
        System.out.println("Enter number");
        x = input.nextInt();
    }
    public void calculate_sum()
    {
        while ( x != 0 )
        {
            y = x % 10;
            x = x / 10;
            sum = sum + y;
            calculate_prodeven_countodd();
        }
    }
    public void calculate_prodeven_countodd()
    {
        if ( y % 2 ==0 )
        {
            prod = prod * y ;
        }
        else 
        {
            count ++;
        }
    }
    public static void main (String args[])
    {
        Number_2 obj = new Number_2();
        obj.input();
        obj.calculate_sum();
        System.out.println("Sum of digits : " + obj.sum);
        System.out.println("Product of even numbers : " + obj.prod);
        System.out.println("Count of odd digits : " + obj.count);
    }
}
