import java.lang.*;
import java.util.Scanner;
class series3
{
    static double d;static int k = 1;static int sum; 
    public static void main()
     {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter 1 for 1st series");
         System.out.println("Enter 2 for 2nd series");
         int n = in.nextInt();
         switch (n)
         {
             case 1:
             
             for (int i = 0; i <=19 ; i++)
             {
                  d = Math.pow(2,k);
                  sum += d;
                  k = (k+1)*-1;
                }
             System.out.println("Sum is : "+ sum);
             break;
             
             case 2:
             System.out.println("Enter no of loops");
             int nu = in.nextInt();long num = 1;int mul = 10;
             for (int j = 0; j <= nu; j++)
             {
                 System.out.print(num +" ");
                 num = (num*mul)+1;
                }
             break;
                
             default:
             System.out.println("Incorrect option, try again");
             break;
            }
        }
    }
             
            
