import java.util.Scanner;
class factorial2
{
     int f , num ,n ;
     factorial2()
     {
          f = 1;
        }
     factorial2(int n)
     {
         num = n;
        }
     int Getfactorial()
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter a number");
         num = input.nextInt();
         for (int x = 1 ; x <= num ; x ++)
        {
            f = f * x;
        }
        System.out.println("The factorial of the number is " + f);
        return f ;
     }
     public static void main ()
     {
        factorial2 obj = new factorial2();
        obj.Getfactorial();
     }
    }
    