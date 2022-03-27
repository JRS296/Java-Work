//Jonathan Rufus Samuel
//11A - 11120 (Pakenham Walsh)
//program to check if it  is a prime number using recursion
import java.util.*; 
class prime 
{ 
    // Returns true if n is prime, else 
    // return false. 
    // i is current divisor to check. 
    static boolean isPrime(int n, int i) 
    { 
        // Base cases 
        if (n <= 2) 
            return (n == 2) ? true : false; 
        if (n % i == 0) 
            return false; 
        if (i * i > n) 
            return true; 
        // Check for next divisor 
        return isPrime(n, i + 1); 
    } 
    // main program to test above function  
    public static void main(String[] args)//main method begins
    { 
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); ; //inputs value from user
        if (isPrime(n, 2))  
            System.out.println(n+" is a prime number"); 
        else 
            System.out.println(n+" is not a prime number"); 
    } 
}
/*
Enter a number
7
7 is a prime number

Enter a number
56
56 is not a prime number

 */