import java.util.Scanner;
class pronic
{
    public static void main()
    {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a number");
         int num = input.nextInt();int y =0;
         int found =0;
         for (int i = 1; i<=num; i++)
         {
             int n = y * i;
             if (n == num)
             {
                 found = 1;
                 break;
                }
             y += 1;
            }
         if (found == 1)
         {
             System.out.println("Number is a pronic number");
            }
            else
            {
                System.out.println("Number is not a pronic number");
            }
        }
    }