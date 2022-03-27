import java.util.Scanner;
class main_program
{
    Scanner input = new Scanner(System.in);
    void neon_num()
    {
        System.out.println("Enter number to find Neon number");
        int num = input.nextInt();
        int sum = 0, square , digit ;
        square = num*num;
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
        System.out.println("Enter C (or c) to continue using program");
        String st = input.nextLine();
    }
    void special_num()
    {
        System.out.println("Input number to check if it is special or not");
        int num = input.nextInt();
        int sum = 0, fact ; int N = num;
        while (N != 0)
        {
            int digit = N%10;
            fact = 1;
            for (int y = 1; y <= digit ; y++)
            {
                fact *= y;
            }
            sum += fact;
            N = N/10;
        }
        System.out.println("Output :");
        if (sum == num)
        {
            System.out.println(num + " is a special number");
         }
        else
        {
            System.out.println(num + " is not a special number");
         }
    }
    void automorphic_num()
    {
        System.out.println("Input number to check if it is automorphic or not");
        int num = input.nextInt();
        int sum = 0, count = 0,square ; int N = num; int right = 0;
        while (N > 0)
        {
            N = N/10;
            count ++;
        }
        square = num * num;
        double p = Math.pow(10,count);
        right = square % (int)p;
        System.out.println("Output :");
        if ( right == num)
        {
            System.out.println(num + " is a automorphic number");
         }
        else
        {
            System.out.println(num + " is not a automorphic number");
         }
    }
    void armstrong_num()
    {
        System.out.println("Input number to check if it is an armstrong number or not");
        int num = input.nextInt();
        int sum = 0, cube ; int temp = num;
        while (temp > 0)
        {
            int digit = temp%10;
            cube = digit*digit*digit;
            sum += cube;
            temp /= 10;
        }
        System.out.println("Output :");
        if (sum == num)
        {
            System.out.println(num + " is an armstrong number");
         }
        else
        {
            System.out.println(num + " is not an armstrong number");
         }
    }
    void palindrome_num()
    {
        System.out.println("Input number to check if it is a palindrome number or not");
        int n = input.nextInt();
        int rev ; rev = 0; int temp = n;
        while (temp > 0)
        {
            int d = temp%10;
            int m = d*10;
            int digit = temp-m;
            rev = rev*10 + digit;
            temp = d;
        }
        System.out.println("Output :");
        if (rev == n)
        {
            System.out.println(n + " is a palindrome number");
         }
        else
        {
            System.out.println(n + " is not a palindrome number");
         }
    }
    public void factorial()
    {
        System.out.println("Enter a number");
        int n = input.nextInt();
        int fac = 1;
        for (int x = 1 ; x <= n ; x ++)
        {
            fac = fac * x;
        }
        System.out.println("The factorial of the number is " + fac);
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the main program");
        System.out.println("Enter 1 to find neon number");
        System.out.println("Enter 2 to find special number");
        System.out.println("Enter 3 to find automorphic number");
        System.out.println("Enter 4 to find armstrong number");
        System.out.println("Enter 5 to find palindrome number");
        System.out.println("Enter 6 to find factorial");
        int selection = in.nextInt();
        main_program obj = new main_program();
        switch (selection)
        {
            case 1:
            obj.neon_num(); 
            break;
            
            case 2:
            obj.special_num();
            break;
            
            case 3:
            obj.automorphic_num();
            break;
            
            case 4:
            obj.armstrong_num();
            break;
            
            case 5:
            obj.palindrome_num();
            break;
            
            case 6:
            obj.factorial();
            break;
        }
    }
}  

