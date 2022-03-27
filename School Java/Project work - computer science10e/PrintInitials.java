import java.io.*;
import java.util.Scanner;
class PrintInitials
{
     public static void main(String arsgs[])throws IOException
     { 
          int x,L ,pos = 0; char ch;
          Scanner input = new Scanner(System.in);
          String name;
          System.out.println("Enter a name");
          name = input.nextLine();
          L = name.length();
          for (x = L - 1 ; x >= 0 ; x--)
          {
              ch = name.charAt(x);
              if ( ch == ' ')
              {
                  pos = x;
                  break;
                }
            }
          System.out.print("The Initials are: ");
          System.out.print(name.charAt(0) + " ");
          for (x = 1; x < pos ; x++)
          {
              ch = name.charAt(x);
              if ( ch == ' ')
              {
                  System.out.print(name.charAt(x + 1) + " ");
                }
            }
          for (x = pos + 1; x < L ; x++)
          {  
              System.out.print(name.charAt(x) );
            }
        }
    }