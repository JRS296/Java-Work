import java.util.Scanner;
class q7_2016
{
    static int num=1;
    static double sum=0;
    void SumSeries(int n, double x)
    {
        for(int i =1; i<=n; i++)
        {
            sum += x/num;
            num = (num+1)*-1;
        }
        System.out.println("Sum of the series : "+sum);
    }
    static int z = 1;
    static long fact = 1;
    static long sum_ =0;
    void SumSeries()
    {
        for (int j = 1; j <= z ; j++)
        {
            fact = fact*j;
            z++;
            if (z==21)
               break;
            sum_ += fact;   
            }
        System.out.println("Sum of the series : "+sum_);
        }
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        q7_2016 obj = new q7_2016();
        System.out.println("Enter 1 for 1st series");
        System.out.println("Enter 2 for 2nd series");
        int a = input.nextInt();
        switch (a)
         {
             case 1:
             System.out.println("Enter no of loops");
             int o = input.nextInt();
             System.out.println("Enter number");
             double p = input.nextDouble();
             obj.SumSeries(o,p);
             break;
             
             case 2:
             obj.SumSeries();
             break;
                
             default:
             System.out.println("Incorrect option, try again");
             break;
            }
    }
    }
    