import java.util.Scanner;
class power
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        System.out.println("Enter power");
        int power = input.nextInt(); int no = 1 ;
        for (int a = 1 ; a <= power ; a++)
        {
            no = no * num;
        }
        System.out.println("Value :" + no);
    }
}
