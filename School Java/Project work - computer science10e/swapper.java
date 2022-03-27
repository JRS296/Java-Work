import java.util.Scanner;
class swapper
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        int x = num1;
        num1 = num2;
        num2 = x;
        System.out.println("The swapped numbers are " + num1 + " and " + num2);
    }
}
//Program by Jonathan Rufus Samuel, 10-E, Bishop Cotton Boys' School
//input: 34 and 23
//output: 23 and 34