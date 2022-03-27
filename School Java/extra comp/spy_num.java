import java.util.Scanner;
class spy_num
{
    static int sum; static int y;
    static int pro;static int num ;
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = in.nextInt();
        while (x>=0)
        {
            y = x%10;
            pro = pro * y;
            num = num + y;
            x = x/10;
        }
        if (pro == sum )
        {
            System.out.println("It is a special number");
        }
        else
        {
            System.out.println("It is not a special number");
        }
    }
}