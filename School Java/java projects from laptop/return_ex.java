import java.util.Scanner;
public class return_ex
{
 public static int show(int x, int y)
 {
     int z = x + y;
     return z;
    }
 public static void main (String args[])
 {
     System.out.println("Enter two value to be added");
     Scanner input = new Scanner (System.in);
     int a = input.nextInt(); int b = input.nextInt();
     return_ex obj = new return_ex();
     int c = obj.show(a, b);
     System.out.print (c);
     
    }
}