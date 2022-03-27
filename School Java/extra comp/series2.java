import java.util.Scanner;
import java.lang.*;
class series2
{
    public static void main()
    {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter no of loops");
         int n = input.nextInt();
         double s = 0;int x = 1;int fact = 1;
         for (int i = 0; i < n; i++)
         {
             for (int f = 1; f<=i+1 ; f++)
             {
                 fact = fact*f;
                }
             double k = Math.pow(x,i);
             sum = sum + k/fact;
            }
         System.out.println("The sum" + s);
        }
    }