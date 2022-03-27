import java.util.Scanner;
import java.lang.*;
class character
{
     int a; String h; char ch;
     Scanner input = new Scanner(System.in);
      public void input_data()
     {
         System.out.println("Enter a character");
         h = input.nextLine();
        }
     public void calculate()
     {
         if( ch >= 'A' && ch>='Z')
         {
             System.out.println("It is a capital letter");
            }
         else if( ch>='a' && ch<='z')
         {
             System.out.println("It is a small letter");
            }
            else
            {
                System.out.println("Invalid entry");
            }
        }
     public static void main(String args[])
     {
         character obj = new character();
         obj.input_data();
         obj.calculate();
        }
    }
