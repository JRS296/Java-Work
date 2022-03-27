import java.util.Scanner;
import java.lang.String;
class compound
{
     double p , r , t , pamt , rate , time;
     double ci;
     compound(double p, double r , double t)
     {
         pamt = p;
         rate = r;
         time = t;
        }
     double findinterest()
     {
         
         return p;
        }
     void printdata()
     {
         System.out.println("Principal amount" + pamt);
         System.out.println("Rate of Interest" + rate);
         System.out.println("Time Period" + time);
         System.out.println("Compound Interest" + ci);
        }
     public static void main()
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter Principal amount");
         double a = input.nextInt();
         System.out.println("Enter Rate of interest");
         double b = input.nextInt();
         System.out.println("Enter Time period");
         double c = input.nextInt();
         compound obj = new compound();
         obj.compound(a,b,c);
         obj.findinterest();
         obj.printdata();
        }
    }
    