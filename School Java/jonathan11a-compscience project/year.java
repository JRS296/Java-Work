//Name: Jonatham Rufus Samuel
// 11'A'

import java.util.Scanner;
class year
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of days");
        int d1 = input.nextInt();//inputs orginal number of days
        System.out.println("Enter the year");
        int yr = input.nextInt();//inputs the year
        System.out.println("Enter number of days after current date");
        int d2 = input.nextInt();//inputs extra days
        int feb = 0;
        if (yr % 100 == 0)//checks if year is a leap year
        {
            if(yr % 400 == 0)
            {
                System.out.println("It is a leap year");
                feb = 29;
            }
        }
        else if (yr % 4 == 0)
        {
            System.out.println("It is a leap year");
            feb = 29;//registers value for february as 29
        }
        else
        {
            System.out.println("It is not a leap year");
            feb = 28;//registers value for february as 28
        }
        String mth[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};//array for months
        int x = 0;int z =x+1;int sum = 31;int date=0;String month=" ";
        if(d1>337+feb)//checks value for year if number of days is greater than 337 + feb 
        {
               d1-=(337+feb);
               yr+=1;
               if (yr % 100 == 0)//checks for leap year
               {
                    if(yr % 400 == 0)
                    {
                         System.out.println("It is a leap year");
                         feb = 29;
                    }
               }
               else if (yr % 4 == 0)
               {
                         System.out.println("It is a leap year");
                         feb = 29;
               }
               else
               {
                        feb = 28;
               }
        }
        int ar[] = {31,feb,31,30,31,30,31,31,30,31,30,31};//array for days in a month
        if (d1>0 && d1 <= ar[x])//checks which month
        {
            date = d1;
            month = mth[x];
        }
        else if(d1>ar[x])
        {
            do
            {
                if(d1>sum && d1 < sum+ar[z])
                {
                    date = d1-sum;
                    month = mth[z];
                    break;
                }
                sum+=ar[z];z++;
            }
            while(d1>31);
            }
        else        
        {
            System.out.println("Invalid entry, re-enter year");
        }
        System.out.println("The date is : "+date+" "+month+" "+yr);//output
        sum = 0;x=0;z=0;z=x+1;
        int d3=d1+d2;
        if (d3>0 && d3 <= ar[x])//for date of days + d2
        {
            date = d3;
            month = mth[x];
        }
        else if(d1>ar[x])
        {
            do
            {
                if(d3>sum && d3 < sum+ar[z])
                {
                    date = d3-sum;
                    month = mth[z-1];
                    break;
                }
                sum+=ar[z];z++;
            }
            while(d3>31);
            }
        else if (d3>(337+feb))
        {
            date = d3-(337+feb);
            month = mth[0];
            yr+=1;
        }
        else        
        {
            System.out.println("Invalid entry, re-enter year");
        }
        System.out.println("The date after " +d2);System.out.println(+date+" "+month+" "+yr);// outputs value
    }
}

/*
Enter number of days
58
Enter the year
2018
Enter number of days after current date
34
It is not a leap year
The date is : 27 February 2018
The date after 34
3 April 2018

Enter number of days
114
Enter the year
2016
Enter number of days after current date
89
It is a leap year
The date is : 23 April 2016
The date after 89
21 July 2016

Enter number of days
380
Enter the year
2004
Enter number of days after current date
50
It is a leap year
The date is : 14 January 2005
Invalid entry, re-enter year
The date after 50
5 March 2005

 */
        