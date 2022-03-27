// main program for recursion using swtich case
// name: Kruthik Krishna, Jonathan Rufus Samuel, Sahil Narula
// class: 11 A
import java.util.*;
class main_prog_recursion
{
    int i=1;
    int ct=0;int v;
    int prime(int n) // method to find prime number
    {
        if(i<=n)
        {
            if(n%i==0)
            {
                ct++;
            }
            i++;
            return prime(n);
        }
        else
        {
            v=ct; // storing ct in v
            ct=0; // reintialising ct to 0
            i=1;  // changing i back to 1 
            return v;
        }
        
    }
    
    int temp=0;int rev=0;int r;
    int palin(int m) // method to check if a number is a palindrome number  
    {
        if(m>0)
        {
            int d=m%10;
            rev=rev*10+d;
            m=m/10;
            return palin(m);
        }
        else
        {
            r=rev; // storing value of rev in r
            rev=0; // reintialising  rev to 0;
            return r;
        }
    }
    
    int j=1;int fac=1;
    void factorial(int x) // method to find factorial of a number
    {
        if(j<=x)
        {
            fac=fac*j;
            j++;
            factorial(x);
        }
        else
        {
            System.out.println("the factorial is: "+fac);
            System.out.println();
            fac=1; // reinitialising fac to 1
            j=1; // reinitialising j to 1
        }         
    }
        
    String st;
    String str="";    
    void rev(int len) //method to reverse and check if string is string palindrome
    {
        int a=len-1;
        if(a>=0)
        {
            char ch=st.charAt(a);
            str=str+ch;            
            rev(len-1);
        }
        else
        {            
            System.out.println("the reverse is: "+str);
            if(str.compareTo(st)==0)
            System.out.println("it is a string palindrome");
            else
            System.out.println("it is not a string palindrome");
            System.out.println();
            str=""; // reintialising str to ""         
        }
    }
    
    public static void main()//main method begins
    {
        Scanner sc=new Scanner(System.in);
        main_prog_recursion ob=new main_prog_recursion();
        int k;
        do
        {
        System.out.println("1. TO CHECK IF NUMBER IS PRIME");
        System.out.println("2. TO CHECK IF NUMBER IS A PALINDROME NUMBER");
        System.out.println("3. TO FIND THE FACTORIAL OF A NUMBER");
        System.out.println("4. TO CHECK IF STRING IS PALINDROME");
        System.out.println();
        System.out.println("ENTER FROM 1-4: ");
        int a=sc.nextInt();      

        switch(a)
        {
            // for prime number 
            case 1:System.out.println("ENTER A NUMBER: "); 
            int y=sc.nextInt();//inputs value from user            
            int z=ob.prime(y);            
            if(z==2)
            System.out.println("number is a prime number ");
            else
            System.out.println("number not a prime number ");
            System.out.println();
            break;
            
            // for palindrome number
            case 2:System.out.println("ENTER A NUMBER: "); 
            int b=sc.nextInt();//inputs value from user
            int c=ob.palin(b);
            if(c==b)
            System.out.println("number is a palindrome");
            else
            System.out.println("number not a palindrome");
            System.out.println();
            break;
            
            // to find factorial
            case 3:System.out.println("ENTER A NUMBER: "); 
            int d=sc.nextInt();//inputs value from user
            ob.factorial(d);
            break;
            
            // to check string palindrome
            case 4:sc.nextLine();
            System.out.println("ENTER A STRING: ");
            ob.st=sc.nextLine(); //inputs value from user
            int l=ob.st.length();
            ob.rev(l);
            break;
            
            default: System.out.println("invalid input");
        }
        System.out.println();
        System.out.println("enter 1 to continue and 0 to end: ");
        k=sc.nextInt();
        System.out.println();
       }while(k!=0);
   }
}
/*
1. TO CHECK IF NUMBER IS PRIME
2. TO CHECK IF NUMBER IS A PALINDROME NUMBER
3. TO FIND THE FACTORIAL OF A NUMBER
4. TO CHECK IF STRING IS PALINDROME

ENTER FROM 1-4: 
1
ENTER A NUMBER: 
17
number is a prime number 


enter 1 to continue and 0 to end: 
1

1. TO CHECK IF NUMBER IS PRIME
2. TO CHECK IF NUMBER IS A PALINDROME NUMBER
3. TO FIND THE FACTORIAL OF A NUMBER
4. TO CHECK IF STRING IS PALINDROME

ENTER FROM 1-4: 
2
ENTER A NUMBER: 
151
number is a palindrome


enter 1 to continue and 0 to end: 
1

1. TO CHECK IF NUMBER IS PRIME
2. TO CHECK IF NUMBER IS A PALINDROME NUMBER
3. TO FIND THE FACTORIAL OF A NUMBER
4. TO CHECK IF STRING IS PALINDROME

ENTER FROM 1-4: 
3
ENTER A NUMBER: 
7
the factorial is: 5040


enter 1 to continue and 0 to end: 
1

1. TO CHECK IF NUMBER IS PRIME
2. TO CHECK IF NUMBER IS A PALINDROME NUMBER
3. TO FIND THE FACTORIAL OF A NUMBER
4. TO CHECK IF STRING IS PALINDROME

ENTER FROM 1-4: 
4
ENTER A STRING: 
madam
the reverse is: madam
it is a string palindrome


enter 1 to continue and 0 to end: 
1

1. TO CHECK IF NUMBER IS PRIME
2. TO CHECK IF NUMBER IS A PALINDROME NUMBER
3. TO FIND THE FACTORIAL OF A NUMBER
4. TO CHECK IF STRING IS PALINDROME

ENTER FROM 1-4: 
1
ENTER A NUMBER: 
15
number not a prime number 


enter 1 to continue and 0 to end: 
1

1. TO CHECK IF NUMBER IS PRIME
2. TO CHECK IF NUMBER IS A PALINDROME NUMBER
3. TO FIND THE FACTORIAL OF A NUMBER
4. TO CHECK IF STRING IS PALINDROME

ENTER FROM 1-4: 
2
ENTER A NUMBER: 
15
number not a palindrome


enter 1 to continue and 0 to end: 
1

1. TO CHECK IF NUMBER IS PRIME
2. TO CHECK IF NUMBER IS A PALINDROME NUMBER
3. TO FIND THE FACTORIAL OF A NUMBER
4. TO CHECK IF STRING IS PALINDROME

ENTER FROM 1-4: 
3
ENTER A NUMBER: 
4
the factorial is: 24


enter 1 to continue and 0 to end: 
1

1. TO CHECK IF NUMBER IS PRIME
2. TO CHECK IF NUMBER IS A PALINDROME NUMBER
3. TO FIND THE FACTORIAL OF A NUMBER
4. TO CHECK IF STRING IS PALINDROME

ENTER FROM 1-4: 
4
ENTER A STRING: 
kruthik
the reverse is: kihturk
it is not a string palindrome


enter 1 to continue and 0 to end: 
0
 */