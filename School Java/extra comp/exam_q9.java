import java.util.Scanner;
import java.lang.*;
class exam_q9
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        int x = 1;
        System.out.println("Enter no of loops");
        int n = input.nextInt();
        for (int i = 1 ; i<=n ; i++)
        {
            double series = Math.pow(2,x);
            series -= 1;
            System.out.print(series+",");
            x++;
        }
    }
}