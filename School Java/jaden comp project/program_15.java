import java.util.*;
public class program_15
{
    public static void main()
    {
       int n1,n2;
   	   int hcf,lcm,remainder,numerator,denominator;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two Numbers");
       n1=sc.nextInt();
       n2=sc.nextInt();
        if (n1>n2)
       { 
          numerator=n1;
          denominator=n2;
       }
        else
       {
          numerator=n2;
          denominator=n1;
       }
       remainder=numerator%denominator;
       while(remainder!=0)
       {
  	      numerator=denominator;
          denominator=remainder;
          remainder=numerator%denominator;
       }
       lcm = denominator;
       hcf = n1*n2/lcm;
       System.out.println("lcm of "+n1+" and "+n2+" = "+lcm);
       System.out.println("hcf of "+n1+" and "+n2+" = "+hcf);
    }
}