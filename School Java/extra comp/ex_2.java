import java.util.Scanner;
class ex_2
{
    int result(int a , int b, int op)
    {
        int sum = a+b;
        int sub = a-b;
        if (op == 1)
            return sum;
        else
            return sub;
    }
    public static void main ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int m_1 = input.nextInt();
        System.out.println("Enter second number");
        int m_2 = input.nextInt();
        System.out.println("Enter 1 for addition and 2 for subtraction");
        int opt = input.nextInt();
        ex_2 obj = new ex_2();
        int x = obj.result(m_1,m_2,opt);
        System.out.println("Answer: "+x );
    }
}
        
