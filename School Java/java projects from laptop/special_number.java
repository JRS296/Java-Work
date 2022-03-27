import java.util.Scanner;
class special_number
{
   int num;
   Scanner input = new Scanner(System.in); 
   int fact;int sum;
   int a; int x;
   public void input()
   {
       System.out.println("Enter number to check if it is a special number");
       num = input.nextInt();
    }
   void calculate()
   {
       do
       {
         x = num % 10;
         fact = 1;
           for (a=1; a <=x; a++)
           {
               fact = fact * a;
               sum = x + fact;
           num = num / 10;
         }
         
        }
        while (num > 0);
    }
   public static void main(String args[])
   {
       special_number obj = new special_number();
       obj.input();
       obj.calculate();
       if (sum == num)
       {
           System.out.println("It is a special number");
        }
        else
        {
            System.out.println("It is not a special number");
        }
    }
}