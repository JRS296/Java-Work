import java.util.Scanner;
import java.lang.*;
class series1
{
    void main()
    {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter no of loops");
         int n = input.nextInt();
         int s = 0;int x = 1;
         for (int i = 1; i<= n; i++)
         {
             s = s + (int)Math.pow(x,2);x++;
            }
         System.out.println("The sum" + s);
        }
    }