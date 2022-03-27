//Name: Jonatham Rufus Samuel
// 11'A'

import java.util.Scanner;
class year2
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);//Scanner class
        System.out.println("Enter a 7 digit number, Eg: 2442007");
        int num = input.nextInt();//inputs a value
        int copy = num;int sum_yr=0;int a,count = 1,count2 = 0;
        while(count2 < 4)//while loop for extracting value for year
        {
            a = copy%10;
            sum_yr+=(a*count);
            count*=10;
            count2 += 1;
            copy/=10;
        }
        System.out.println("The number of days: "+copy);
        System.out.println("The year :"+ sum_yr);
        int d1 = copy;//creates copy of d1
        int yr = sum_yr; //creates copy for year
        int feb = 0;
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
            feb = 29;//assigns value for feb as 29
        }
        else
        {
            System.out.println("It is not a leap year");
            feb = 28;//assigns value for feb as 28
        }
        String mth[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int x = 0;int z =x+1;int sum = 31;int date=0;String month=" ";
        if(d1>337+feb)
        {
            d1-=(337+feb);
            yr+=1; 
            if (yr % 100 == 0)
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
        int ar[] = {31,feb,31,30,31,30,31,31,30,31,30,31};
        if (d1>0 && d1 <= ar[x])
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
        System.out.println("The date is : "+date+" "+month+" "+yr);//outputs a value
    }
}

/*
Enter a 7 digit number, Eg: 2442007
1882006
The number of days: 188
The year :2006
It is not a leap year
The date is : 7 July 2006

Enter a 7 digit number, Eg: 2442007
3002000
The number of days: 300
The year :2000
It is a leap year
The date is : 26 October 2000

Enter a 7 digit number, Eg: 2442007
4302018
The number of days: 430
The year :2018
It is not a leap year
The date is : 6 March 2019

 */