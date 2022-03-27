import java.util.Scanner;
public class functions
 {
     void input()
     {
         Scanner input = new Scanner(System.in);
         int a =input.nextInt();
         int b =input.nextInt();
         int c = a + b;
         System.out.println(c);
        }
     public static void main(String args[])
      {
          functions obj = new functions();
          obj.input();
        }
    }
