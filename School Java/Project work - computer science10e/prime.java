import java.util.Scanner;
class prime
{
    public static void main()
    {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter a number");
          int x = input.nextInt();
          while (x > 0)
        {
            int digit = x % 10;
            x /= 10;
        }
        int y = x/x;
        int z = x/1;
        if (y == 1 && z == x)
        {
            System.out.println("The number is a prime number");
        }
        else
        {
            System.out.println("The number is not a prime number");
        }
    }
}
