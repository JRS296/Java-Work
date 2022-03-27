//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 13(Program to find nth ugly number)  
import java.util.Scanner;
class ugly//initialization of class
{ 
    //This function divides a by greatest divisible power of b
    static int maxDivide(int a, int b) 
    { 
        while(a % b == 0) 
        {
            a = a/b;
        }
        return a; 
    } 
    // Function to check if a number is ugly or not 
    static int isUgly(int no) 
    { 
        no = maxDivide(no, 2); 
        no = maxDivide(no, 3); 
        no = maxDivide(no, 5); 
        return (no == 1)? 1 : 0; 
    } 
    /* Function to get the nth ugly  
    number*/
    static int getNthUglyNo(int n) 
    { 
        int i = 1;  
        // ugly number count  
        int count = 1;  
        // check for all integers  
        // until count becomes n  
        while(n > count) 
        { 
            i++; 
            if(isUgly(i) == 1) 
                count++; 
        } 
        return i; 
        }
    public static void main(String args[]) //main method to test above functions 
    { 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter term number to find its ugly number"); 
        int n = in.nextInt();
        int no = getNthUglyNo(n); 
        System.out.println(n+"th ugly number "+ no); 
    } //end of main method
} //end of class
/*
Enter term number to find its ugly number
5
5th ugly number 5

Enter term number to find its ugly number
131
131th ugly number 3645

Enter term number to find its ugly number
58
58th ugly number 360
 */