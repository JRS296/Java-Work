import java.util.Scanner;
import java.lang.Math;
class menu
{
    double num;
    Scanner input = new Scanner(System.in);
    public void absolute()
    {
       System.out.println("Enter a number");
       num = input.nextDouble();
       double abs = Math.abs(num);
       System.out.println("Absolute value of number is " + abs);
    }
    public void round()
    {
       System.out.println("Enter a number");
       num = input.nextDouble();
       double rou = Math.round(num);
       System.out.println("Rounded value of number is " + rou);
    }
    public void power()
    {
       System.out.println("Enter a number");
       num = input.nextDouble();
       System.out.println("Enter power value");
       int x = input.nextInt();
       double po = Math.pow(num,x);
       System.out.println("Powered value of number is " + po);
    }
    public static void main()
    {
       int choice;
       menu obj = new menu();
         do 
       {
       System.out.println("Enter 1 for finding absolute number");
       System.out.println("Enter 2 for finding rounded value of a number");
       System.out.println("Enter 3 for finding power of a number");
       System.out.println("Enter 4 for quiting");
       choice = obj.input.nextInt();
       switch (choice)
       {
           case 1:
           obj.absolute();
           break;
           
           case 2:
           obj.round();
           break;
           
           case 3:
           obj.power();
           break;
           
           case 4:
           break;
           
           default:
           System.out.println("Invalid entry");
           break;
        }
      }
       while (choice != 4);
    }
}
