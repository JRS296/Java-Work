import java.util.Scanner;
class array
{
      public static void main(String args[])
      {
            Scanner in = new Scanner(System.in);
            int ar[][] = new int[3][4];
            for (int r = 0; r<12 ; r++)
            {
                for (int c = 0; c<12; c++)
                {
                   System.out.println("Enter a value");
                   ar[r][c] = in.nextInt();
                }
            }
            for (int r = 0; r<12 ; r++)
            {
                for (int c = 0; c<12; c++)
                {
                   System.out.print(ar[r][c] + "   ");
                }
                System.out.println();
            }
        }
    }
            