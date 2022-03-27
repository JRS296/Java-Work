import java.io.*;
import java.util.Scanner;
class q4
{
     public static void main()
     {
           Scanner input = new Scanner(System.in);
           String nam;
           int nd=0,sl=0,cl=0;
           System.out.println("Input a string: ");
           nam = input.nextLine();
           for (int i = 0; i < nam.length() ; i++)
           {
               char c = nam.charAt(i);
               if(c>='0' && c<='9')
               nd++;
               if(c>='A' && c<='Z')
               cl++;
               if(c>='a' && c<='z')
               sl++;
            }
           System.out.println("Output: "); 
           System.out.println("No of upper case characters: "+ cl); 
           System.out.println("No of lower case characters: "+ sl); 
           System.out.println("No of digits: "+ nd); 
        }
    }
               