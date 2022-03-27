import java.util.*;
public class program_9
{
    public static void main()
    {
        System.out.println("surface area of a sphere");
        System.out.println("input radius");
        Scanner ob = new Scanner(System.in);
        double a = ob.nextDouble();// radius
        double b = Math.pow (a,2)*22/7*4;// surface area of sphere
        System.out.println("surface area = "+b);
        System.out.println("surface area of a cylinder");
        System.out.println("input heigtht");double c = ob.nextDouble();// height
        System.out.println("input radius");double d = ob.nextDouble();// radius
        double e=2*22/7d*(d*c);//surface area of cylinder
        System.out.println("surface area = "+e);
        System.out.println("surface area of a cube");
        System.out.println("input side");
        double f = ob.nextDouble();// side
        double g = Math.pow(f,6);
        System.out.println("surface area = "+g);
    }
}