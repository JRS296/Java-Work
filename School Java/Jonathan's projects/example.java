import java.util.Scanner;
public class example
{
     public void input()
     {
         Scanner input = new Scanner(System.in);
         System.out.print(" Eter 2 numbers ");
         int a = input.nextInt();
         int b = input.nextInt();
         int c = a + b;
         System.out.println(" The sum of the numbers are " +c);
        }
        public void input2()
     {
         Scanner input = new Scanner(System.in);
         System.out.print(" Eter 2 numbers ");
         int a = input.nextInt();
         double b = input.nextDouble();
         double c = a - b;
         System.out.println(" The difference of the numbers are " +c);
        }
        public void input3()
     {
         Scanner input = new Scanner(System.in);
         System.out.print(" Eter 2 numbers ");
         int a = input.nextInt();
         int b = input.nextInt();
         int c = a * b;
         System.out.println(" The product of the numbers are " +c);
        }
        public void input4()
     {
         Scanner input = new Scanner(System.in);
         System.out.print(" Eter 2 numbers ");
         int a = input.nextInt();
         int b = input.nextInt();
         int c = a / b;
         System.out.println(" The division of the numbers are " +c);
        }
     public static void main(String args[])
        {
            example obj = new example();
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            Scanner ko = new Scanner(System.in);
            int t = ko.nextInt() ;
            switch ( t )
            {
                case 1 :
                obj.input();
                break;
                case 2 :
                obj.input2();
                break;
                case 3 :
                obj.input3();
                break;
                case 4 :
                obj.input4();
                break;
                default :
                System.out.println("Invalid choice");
        }
     }
}
