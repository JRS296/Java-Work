//Jonathan Rufus Samuel
//11A
import java.util.*;
class  primetriplet
{
    static int isprime(int n)
    {
        if (n==1)
        {
            return 0;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return 0;
        }
        return 1;
    }

    public static void main() throws Exception
    {
        int i,a,b,c,d;
        for(i=1,a=1;i<=10;a++)
        {
            b=a+2;
            c=a+4;
            d=a+6;
            if(isprime(a)==1 && isprime(b)==1 && isprime(d)==1)
            {
                System.out.println(a+"\t"+b+"\t"+d);
                i++;
            }
            else if (isprime(a)==1 && isprime(c)==1 && isprime(d)==1)
            {
                System.out.println(a+"\t"+c+"\t"+d);
                i++;
            }

        }
    }

}
/*
7	11	13
11	13	17
13	17	19
17	19	23
37	41	43
41	43	47
67	71	73
97	101	103
101	103	107

 */