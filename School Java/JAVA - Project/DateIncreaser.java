import java.util.Scanner;
public class DateIncreaser
{
    public static void main()
    {
        //SCANNER OBJ
        Scanner sc=new Scanner(System.in);
        
        //INPUT
        System.out.println("ENTER THE DAY NUMBER");
        int dayNumber=sc.nextInt();
        //CHECK
        if(dayNumber>366 || dayNumber<=1)
        {
            System.out.println("INVALID CHOICE");
            System.exit(1000);
        }

        System.out.println("ENTER THE YEAR");
        int year=sc.nextInt();
        boolean ye=false;
        System.out.println("ENTER N");
        int n=sc.nextInt();
        
        //GET MONTH
        if(n>=1&&n<=100)
        {
            String month[]={"JANUARY","FEBURARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
            int daysMonLeap[] ={31,29,31,30,31,30,31,31,30,31,30,31};
            int daysMon[] ={31,28,31,30,31,30,31,31,30,31,30,31};
            int mon=0;
            int days=0;
            int days1=0;
            if(year%4==0)
            {
                if(year%100==0)
                {
                    if(year%400==0)
                    {
                        ye=true;
                    }
                }
            }
            for(int i=0;i<=11;i++)
            {
                if(ye)
                {
                    days1+=daysMonLeap[i];
                    if(days1<dayNumber)
                    {
                        days+=daysMonLeap[i];
                        mon=i;
                    }
                }
                else
                {
                    days1+=daysMon[i];
                    if(days1<dayNumber)
                    {
                        days+=daysMon[i];
                        mon=i;
                    }  
                }
            }
            
            //GET DATE
            days1=dayNumber-days-1;
            mon++;
            
            //PRINT OLD DATE
            System.out.print("OLD: ");
            System.out.println(days1+" th "+ month[mon]+" "+year);
            
            //GET NEW DATE
            if(mon==11)
            {
                year++;
                mon=0;
                days1+=n;
                if(ye)
                {
                    if(days1>daysMonLeap[mon])
                    {
                        days1=days1-daysMonLeap[mon];
                    }
                }
                else
                {
                    if(days1>daysMon[mon])
                    {
                        days1=days1-daysMon[mon];
                    }
                } 
            }
            else
            {
                days1+=n;
                if(ye)
                {
                    if(days1>daysMonLeap[mon])
                    {
                        days1=days1-daysMonLeap[mon];
                        mon++;
                    }
                }
                else
                {
                    if(days1>daysMon[mon])
                    {
                        days1=days1-daysMon[mon];
                        mon++;
                    }
                } 
            }
            
            //PRINT NEW DATE
            System.out.print("NEW: ");
            System.out.println(days1+" th "+ month[mon]+" "+year);
        }
    }
}
/*
 * OUTPUT 1:
ENTER THE DAY NUMBER
233
ENTER THE YEAR
2008
ENTER N
17
OLD: 20 th AUGUST 2008
NEW: 6 th SEPTEMBER 2008

 *OUTPUT 2:
ENTER THE DAY NUMBER
360
ENTER THE YEAR
2008
ENTER N
17
OLD: 25 th DECEMBER 2008
NEW: 11 th JANUARY 2009 */
