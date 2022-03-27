import java.util.Scanner;
class factorial
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        int fac = 1;
        for (int x = 1 ; x <= n ; x ++)
        {
            fac = fac * x;
        }
        System.out.println("The factorial of the number is " + fac);
    }
}