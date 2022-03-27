import java.util.Scanner;
class q4
{
    Scanner input = new Scanner(System.in);
    void maxmin()
    {
        int num , max , min ;
        System.out.println("Enter number (negative number indicates end of input):");
        num = input.nextInt();
        max = num;
        min = num;
        while (num > 0)
        {
            if (num > max)
            {
                max = num;
            }
            else if (num < min)
            {
                min = num;
            }
            System.out.println("Enter number");
            num = input.nextInt();
        }
        System.out.println("Output :");
        System.out.println("The greatest number :" + max);
        System.out.println("The smallest number :" + min);
    }
    void exit()
    {
          
    }
    public static void main()
    {
        q4 obj = new q4();
        System.out.println("Enter a number (alphabet to terminate program):");
        //        char x = input.nextChar();
        char x = obj.input.next().charAt(0);
        //        if ( x = 'A' || x = 'Z')
        if ( x == 'A' || x == 'Z')
        {
            obj.exit();
        }
        else
        {
            obj.maxmin();
        }
    }
}
