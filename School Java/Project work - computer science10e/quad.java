import java.util.Scanner;
public class quad
 {
     double a ; double b ; double c ; 
     public void input()
     {
         Scanner eqn1 = new Scanner(System.in);
         System.out.println("Enter coefficient a");
         a = eqn1.nextDouble();
         System.out.println("Enter coefficient b");
         b = eqn1.nextDouble();
         System.out.println("Enter coefficient c");
         c = eqn1.nextDouble();
        }
     public void calculate()
     {
         double det = b*b - 4 * a * c;
         if (det == 0)
         {
             double x = -b /(2*a);
             System.out.println("The equation has 2 equal and real roots ");
             System.out.println("The roots are: "+ x +","+x);
            }
         else if (det > 0)
         {
             double x1 = (-b + Math.sqrt(det))/(2*a);
             double x2 = (-b - Math.sqrt(det))/(2*a);
             System.out.println("The equation has 2 distinct and real roots ");
             System.out.println("The roots are: "+ x1 +","+x2);
            }
         else 
         {
             double imaginary = Math.sqrt(-det)/(2*a);
             double realx = -b/(2*a);
             System.out.println("The equation has 2 imaginary roots ");
             System.out.println("The first root is: "+ realx +"+"+imaginary+"i");
             System.out.println("The second root is: "+ realx +"-"+imaginary+"i");
            }
        }
        public static void main ()
     {
         Scanner the = new Scanner(System.in);
         quad obj = new quad();
         obj.input();
         obj.calculate();
        }
    }
        
