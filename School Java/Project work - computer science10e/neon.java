import java.util.Scanner;
class neon
{
    void main()
     {
        neon obj = new neon();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to find Neon number");
        int num = input.nextInt();
        int sum , square , digit ;
        square = num*num;
        sum = 0;
        for (int n = square ; n > 0 ; n = n / 10)
        {
             digit = n % 10;
             sum = sum + digit;
         }
        System.out.println("Output :");
        if (sum == num)
        {
            System.out.println(num + " is a neon number");
         }
        else
        {
            System.out.println(num + " is not a neon number");
         }
    }
}  