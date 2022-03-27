import java.util.Scanner;
public class maxmin
 {
     public void max1()
     {
         Scanner ma = new Scanner(System.in);
         System.out.println("Enter the first number");
         int a = ma.nextInt();
         System.out.println("Enter the second number");
         int b = ma.nextInt();
         int c = Math.max(a,b);
         System.out.println("The larger number is " +c);
        }
     public void max2()
     {
         Scanner mi = new Scanner(System.in);
         System.out.println("Enter the first number");
         int a = mi.nextInt();
         System.out.println("Enter the second number");
         int b = mi.nextInt();
         int c = Math.min(a,b);
         System.out.println("The smaller number is " +c);
        }
     public static void main(String args[])
        {
            maxmin obj = new maxmin();
            System.out.println("Enter 1 for finding maximum of two values");
            System.out.println("Enter 2 for finding minimum of two values");
            Scanner ex = new Scanner(System.in);
            int d = ex.nextInt();
            switch (d)
            {
                case 1 :
                obj.max1();
                break;
                
                case 2 :
                obj.max2();
                break;
            }
        }
    }
        