import java.util.*;
public class program_12
{    
    public static void main()
    {
        Scanner ob = new Scanner(System . in);
        System.out.println("input a 4 digit no");
        long a = ob.nextInt ();
        if (a >999 && a<=9999)
        {   long b = (long)a/1000;
            double c = Math.floor(b);
            long d = (long)a%1000;
            long e = (long)d/100;
            double f = Math.floor(e);
            long g = (long)d%100;
            long h = (long)g/10;
            double i = Math.floor(h);
            long j = (long)g%10;
            long k = (long)j/1;
            System.out.println("the number reversd such that first no comes last and last comes first though middle stays the same");
            System.out.print(k);
            System.out.print(e);
            System.out.print(h);
            System.out.print(b);
        }
        else 
           System.out.println("invalid input");        
    }
}