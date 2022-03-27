//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 19(Program to find the frequency of a digit in a number )
import java.util.Scanner;
class DigiNumber//initialization of class
{ 
    long num;
    DigiNumber()//default constructor
    {
        num = 0;
    }
    DigiNumber(long n)//parameterized constructor
    {
        num = n;
    }
    void digitfrequency(long n,int d) // function to find frequency of digit in a number 
    {  
        int c = 0; 
        while (n > 0)  
        { 
            if (n % 10 == d) 
                c++; 
            n = n / 10; 
        } 
        System.out.println("Frequency of number "+d+" is: "+c);
    } 
    long sum = 0;
    long sumDigits(long N)//recursive function to find sum of digits
    {
        sum = N %10;
        if(N == 0)
        {
            return 0;
        }
        else
        {
            return sum + sumDigits(N / 10);
        }
    }
    void printsum(long ans)//method to display sum of digits
    {
        System.out.println("Sum of digits: "+ans);
    }
    public static void main(String args[]) //main method
    { 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        long A = in.nextLong();
        System.out.println("Enter a digit from the number");
        int d = in.nextInt();
        DigiNumber obj = new DigiNumber();
        obj.digitfrequency(A,d);
        long a = obj.sumDigits(A);
        obj.printsum(a);
    } //end of main method
} //end of class

/*
Enter a number
12349274932
Enter a digit from the number
2
Frequency of number 2 is: 3
Sum of digits: 46

Enter a number
4658739856437
Enter a digit from the number
7
Frequency of number 7 is: 2
Sum of digits: 75

Enter a number
349283649
Enter a digit from the number
0
Frequency of number 0 is: 0
Sum of digits: 48
 */