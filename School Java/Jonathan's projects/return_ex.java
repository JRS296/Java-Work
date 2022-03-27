import java.util.Scanner;
class return_ex
{
 public static int show()
 {
     int x = 6, y = 8, z; 
     z = x + y;
     return z;
    }
 public static void main (String args[])
 {
     return_ex obj = new return_ex();
     obj.show();
     Scanner x = new Scanner (System.in);
     int s = x.nextInt();
    }
}