import java.util.Scanner;
class fib_series
{
    int fib (int n)
    {
        if (n == 1)
        return 0;
        else if (n == 2)
        return 1;
        else if (n>2)
        return (fib(n-1)+fib(n-2));
        else
        return -1;
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find fibonacci series uptil that term");
        int x = in.nextInt();int y = 0;
        fib_series obj = new fib_series();
        for (int i=1;i<=x;i++)
        {
            y = obj.fib(i);
            System.out.print(y+",");
        }
    }
}
