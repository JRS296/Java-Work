import java.util.Scanner;
class fact_recursion
{
    int fact(int n)
    {
            if(n==0)
                return 1;
            else
                return (n*fact(n-1));
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial");
        int x = in.nextInt();
        fact_recursion obj = new fact_recursion();
        int y = obj.fact(x);
        System.out.println("Factorial = "+y);
    }
}
