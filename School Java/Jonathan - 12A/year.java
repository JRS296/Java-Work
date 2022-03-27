//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 12(Program to print day number in a year)
import java.util.Scanner;
class year//initialization of class
{
    public static void main()//main method
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date in dd/mm/yyyy format");
        int d1 = input.nextInt();//inputs day
        int m = input.nextInt();//inputs month
        int yr = input.nextInt();//inputs the year
        if((d1>0&&d1<32)&&(m>0&&m<13))
        {
            System.out.println("It is a Valid Date");
            int feb = 0;
            if (yr % 100 == 0)//checks if year is a leap year
            {
                if(yr % 400 == 0)
                {
                    feb = 29;
                }
            }
            else if (yr % 4 == 0)
            {
                feb = 29;//registers value for february as 29
            }
            else
            {
                feb = 28;//registers value for february as 28
            }
            int ar[] = {31,feb,31,30,31,30,31,31,30,31,30,31};//array for days in a month
            int mval = 0;
            if(d1<=ar[0]&&m==1)
            {
                System.out.println(d1);
            }
            else
            {
                for (int i=0; i<m-1; i++)
                {
                    mval += ar[i];//addition of months uptil m-1
                }
                System.out.println(mval+d1);
            }
        }
        else
        {
            System.out.println("It is an Invalid Date");
        }
    }//end of main method
}//end of class

/*
Enter date in dd/mm/yyyy format
05
01
2010
It is a Valid Date
5

Enter date in dd/mm/yyyy format
12
03
2002
It is a Valid Date
71

Enter date in dd/mm/yyyy format
03
04
2010
It is a Valid Date
93

Enter date in dd/mm/yyyy format
68
12
5454
It is an Invalid Date

 */