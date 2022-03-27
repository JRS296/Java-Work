//Jonathan Rufus Samuel
//11A

import java.util.Scanner;
public class encode 
{
   public static void main() 
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter encoded code to be decoded");
      String num = input.nextLine();
      String X[] = num.split("");
      for (int i = 0; i < X.length; i++) {
         System.out.print(X[i]+" ");
      }
      int x = num.length();int y;String st=" ";
      int arr[] = new int[x];
      for(int i=0 ; i<x ; i++)
      {
          arr[i] = Integer.parseInt(X[i]);
        }
      for(int i=0 ; i<x ; i++)
      {
          if(i==0)
          {
              y = (arr[i]*100)+(arr[i+1]*10)+(arr[i]);
              st += (char)y;
              y=0;
            }
          else if(arr[i]==32)
          {
              y = (arr[i+1]*100)+(arr[i+2]*10)+(arr[i+3]);
              st += (char)y;
              y=0;
            }
          else
          {
              y = (arr[i]*10)+(arr[i+1]);
              st += (char)y;
              y=0;
            }
        }
      System.out.println("The decoded sentence is:");
      System.out.println(st);
   }
}
/*
Enter encoded code to be decoded
10665771011153266797868
1 0 6 6 5 7 7 1 0 1 1 1 5 3 2 6 6 7 9 7 8 6 8
The decoded sentence is:
James Bond

Enter encoded code to be decoded
78487367421013232321006589
7 8 4 8 7 3 6 7 4 2 1 0 1 3 2 3 2 3 2 1 0 0 6 5 8 9
The decoded sentence is:
Nice Day
 */