import java.util.Scanner;
import java.lang.*;
class special_num
{
    public void main()
    {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a number");
         int x = in.nextInt();int fact=1;int y; int num = x,sum;
         while(x>0)
         {
            y=x%10;
             for (int f=1; f<=y; f++)
            {
                fact=fact*f;
            }
            sum = sum + fact;
            x=x/10;
        }
        
        if (sum == num)
        {
            System.out.println("It is a Special Number");
        }
        else
        {
            System.out.println("It is not a Special Number");
        }
    }
}