import java.util.Scanner;
import java.lang.*;
class quads_2
{
    void calculate(double a,double b, double c)
    {
        double x1,x2;
        double D = (b*b) - (4*a*c);
        if (D>0)
        {    
            System.out.println("Roots are real and unequal");
            x1 = -b +Math.sqrt(D)/(2*a);
            x2 = -b -Math.sqrt(D)/(2*a);
            System.out.println("The roots are :");
            System.out.println(x1);
            System.out.println(x2);
        }
        else if (D<0)
        {    
            System.out.println("Roots are imaginary and are unequal");
            x1 = -b +Math.sqrt(D)/(2*a);
            x2 = -b -Math.sqrt(D)/(2*a);
            System.out.println("The roots are :");
            System.out.println(x1);
            System.out.println(x2);
        }
        else 
        {
            System.out.println("Roots are real and equal");
            x1 = -b +Math.sqrt(D)/(2*a);
            x2 = -b -Math.sqrt(D)/(2*a);
            System.out.println("The roots are :");
            System.out.println(x1);
            System.out.println(x2);
        }
        
    }
    public static void main()
    {
        quads_2 obj = new quads_2();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for a,b and c");
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        obj.calculate(A,B,C);
    }
}