         
import java.util.*;
class MobiusFn
{
    int n;
     
    MobiusFn()
    {
        n = 0;
    }
     
    void input()
    {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter a number : ");
        n = sc.nextInt();
    }
     
    /*  The function primefac() either returns '0' if prime factors are repeated
     *  or returns the no.of prime factors */
    int primeFac()
    {
        int a=n, i=2, m=0, c=0, f=0;
             
        while(a > 1) // loop to generate prime factors
        {
            c = 0; // variable to store frequency of every prime factor
            while(a%i == 0) // if 'i' is a prime factor
            {
                c++; // counting frequency of 'i'
                f++; // counting no of prime factors
                a=a/i;
            }
            i++;
 
            if(c > 1) // returning '0' if prime factors are repeated
                return 0;
        }
        return f; // returning no. of prime factors
    }
     
    void display() // function to display value of mobius function
    {
        int mob,x;
        if(n == 1) // condition 1
            mob = 1;
        else
        {
            x = primeFac();
            if(x == 0) // condition 2
                mob = 0;
            else // condition 3
                mob = (int)Math.pow(-1,x);
        }
        System.out.println("Value of Mobius Function : "+mob);
    }
     
    public static void main(String args[])
    {
        MobiusFn ob = new MobiusFn();     
        ob.input();
        ob.display();     
    }
}
/*
 Enter a number : 67
Value of Mobius Function : -1
 */