//Name: Jonatham Rufus Samuel
// 11'A'

import java.util.Scanner;
public class Smith
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);//Scanner class 
        Smith obj=new Smith();//Creation of object
        System.out.println("Enter the  Number");
        int n=sc.nextInt();//inputs number
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
        if(sum==sumOfDig)//checks if value is a Smith Number
        {
            System.out.println(n+" IS A SMITH NUMBER");
        }
        else
        {
            System.out.println(n+" IS NOT A SMITH NUMBER");   
        }
    }
    public boolean isPrime(int n)//checks if number is a prime
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
        return j;//returns boolean value, either true or false
    }
    public int getSumOfDig(int n)//gets sum of values
    {
        //get base
        int m=n;
        int base=0;
        while(n>0)//while loop to increase base value
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

Enter the  Number
800
800 IS NOT A SMITH NUMBER

Enter the  Number
666
666 IS A SMITH NUMBER

 */