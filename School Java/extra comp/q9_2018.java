import java.util.Scanner;
import java.lang.*;
import java.io.*;
class q9_2018
{
    public static void main ()
    {
         Scanner in = new Scanner (System.in);
         String ar[] = new String[10];
         for (int i =0; i<10 ;i++)
         {
             System.out.println("Enter a name");
             ar[i] = in.nextLine();
            }
          for(int j=0 ; j<10-1; j++)
          {
            for(int k=0 ; k<10-j-1; k++)
            {
                int h = ar[k].compareto(ar[k+1]); 
                if (k<0|| ar[k].startsWith(ar[k+1]))
                 {
                     String p = ar[k];
                     ar[k] = ar[k+1];
                     ar[k+1] = p;
                    }
            }
         }   
         System.out.println("Sorted array:");
         for (int l =0; l<10 ;i++)
         {
             System.out.println(ar[l]);
            }
        }
    }
