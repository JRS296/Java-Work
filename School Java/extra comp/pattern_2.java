import java.io.*;
import java.util.Scanner;
class pattern_2
{
     public static void main()
     {
         Scanner input = new Scanner(System.in);
         String str;
         int i,j,len;
         System.out.print("Enter a string of your choice");
         str = input.nextLine();
         len = str.length();
         System.out.println("Output: ");
         for ( i = 0; i < len; i++)
         {
             for ( j = 0; j <= i ; j++ )
             {
                  char ch = str.charAt(j);
                  System.out.print(ch + " ");
                }
                System.out.println();
            }
        }
    }