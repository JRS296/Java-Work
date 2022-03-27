//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 18(Program to generate fibonacci series)
import java.util.Scanner;
public class FibonacciSeries //initialization of class
{
   public static void main(String[] args) //main method
   {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n = s.nextInt();
       for (int i = 0; i <= n; i++) 
       {
           System.out.print(fibonacci(i) + " ");
       }
   }//end of main method
   public static int fibonacci(int n)
   {
       if (n == 0) 
       {
           return 0;
       } 
       else if (n == 1) 
       {
           return 1;
       } 
       else 
       {
           return fibonacci(n - 1) + fibonacci(n - 2);
       }
   }
}//end of class
/*
Enter the value of n: 5
0 1 1 2 3 5 

Enter the value of n: 18
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 

Enter the value of n: 34
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 
 */