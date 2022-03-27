import java.util.*;
public class program_4
{
    public static void main()
    {
        int c,d, a = 0;
        Scanner in = new Scanner (System.in);
        System.out.println("input year");
        c = in.nextInt();
        System.out.println("Input month number (1st corresponding to January and 12th corresponding to december)");
        int b = in.nextInt();
        if (c%4==0 && b==2)
         a=29;    
        else if (b == 1) 
         a =31;
         else if (b == 2)
         a=28;
         else if (b == 3)
         a=31;
         else if (b == 4)
         a=30;
         else if (b == 5)
         a=31;
         else if (b == 6)
         a=30;
         else if (b == 7)
         a=31;
         else if (b == 8)
         a=31;
         else if (b == 9)
         a=30;
         else if (b == 10)
         a=31;
         else if (b == 11)
         a=30;
         else if (b == 12)
         a=31;
         else 
         System.out.println ("invalid input");
        System.out.println ("the number of days in the month of the year inputed is"+a);
        
    }
}
