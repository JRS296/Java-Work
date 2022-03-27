
//Jonathan Rufus Samuel
//11A
// Recursive java program to  
// find sum of digits of a number
import java.io.*; 
import java.util.*; 
class sum
{ 
    // Function to check sum  
    // of digit using recursion 
    static int sum(int n) 
    {  
        if (n == 0) 
            return 0; 
        return (n % 10 + sum(n / 10)); 
    } 
    // Driven Program to check above 
    public static void main(String args[]) 
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int result = sum(num); 
        System.out.println("Sum of digits in " + num + " is " + result); 
    } 
} 
/*
Enter a number
845
Sum of digits in 845 is 17

Enter a number
1432
Sum of digits in 1432 is 10

 */