import java.util.Scanner;
public class SmithNumber
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        SmithNumber obj=new SmithNumber();
        System.out.println("Enter the  Number");
        int n=sc.nextInt();
        int m=n;
        int sumOfDig=obj.getSumOfDig(n);
        int sum=0;
        while(m!=1)
        {
            for(int i=2;i<=m;i++)
            {
                if(m%i==0 && (obj.isPrime(i)))
                {
                    if(i<10)
                    {
                        sum+=i;
                        m=m/i;
                        break;
                    }
                    else
                    {
                        int t=obj.getSumOfDig(i);
                        sum+=t;
                        m=m/i;
                        break;
                    }
                }
            }
        }
        
        //Check  
        if(sum==sumOfDig)
        {
            System.out.println(n+" IS A SMITH NUMBER");
        }
        else
        {
            System.out.println(n+" IS NOT A SMITH NUMBER");   
        }
    }

    public boolean isPrime(int n)
    {
        boolean j=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                j=false;
                break;
            }
        }
        return j;
    }

    public int getSumOfDig(int n)
    {
        //get base
        int m=n;
        int base=0;
        while(n>0)
        {
            n/=10;
            base++;
        }
        int sum=0;
        String a=""+m; 
        //get sum of digits
        for(int i=0;i<base;i++)
        {
            char ch=a.charAt(i);
            int b=(int)ch-48;
            sum+=b; 
        }
        return sum;
    }
}
/*
 Enter the  Number
420
420 IS NOT A SMITH NUMBER
 */