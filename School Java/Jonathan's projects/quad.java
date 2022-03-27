import java.util.Scanner;
public class quad
 {
     public void eqn1()
     {
         Scanner eqn1 = new Scanner(System.in);
         System.out.println("Enter Variable a");
         double a = eqn1.nextInt();
          Scanner bx = new Scanner(System.in);
         System.out.println("Enter Variable b");
         double b = eqn1.nextInt();
         Scanner cx = new Scanner(System.in);
         System.out.println("Enter Variable c");
         double c = eqn1.nextInt();
         double x1 = -b + Math.sqrt( b*b - 4 * a * c )/2*a;
         System.out.println(x1);

         double x2 = -b - Math.sqrt( b*b - 4 * a * c )/2*a;
         System.out.println(x2);
        }
     public static void main ()
     {
         Scanner the = new Scanner(System.in);
         quad obj = new quad();
         obj.eqn1();
        }
    }
        