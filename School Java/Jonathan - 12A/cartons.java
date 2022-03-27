//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 2(Cartons Problem)
import java.util.Scanner;
class cartons//initialization of class
{
    public static void main()//main method
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of boxes (max: 1000)");
        int n = input.nextInt();//inputs number of boxes
        int num=0;int no =n;
        int n1=0,n2=0,n3=0,n4=0;
        n1 = n/48; n%=48;
        System.out.println("48 * "+n1+" = "+(n1*48));//condition for 48 carons
        n2 = n/24; n%=24;
        System.out.println("24 * "+n2+" = "+(n2*24));//condition for 24 carons
        n3 = n/12; n%=12;
        System.out.println("12 * "+n3+" = "+(n3*12));//condition for 12 carons
        n4 = n/6; n%=6;
        System.out.println("6 * "+n4+" = "+(n4*6));//condition for 6 carons
        n-=n4;
        if(n!=0)//checks condition for n NOT to be zero
        {
            num++;
        }
        num+=n1+n2+n3+n4;
        if(no<=1000&&no>=0)
        {
            System.out.println("Total number of cartons: "+num);//prints number of cartoons
        }
        else
        {
            System.out.println("Invalid Entry");
        }
    }//end of main method
}//end of class
/*
Enter number of boxes (max: 1000)
800
48 * 16 = 768
24 * 1 = 24
12 * 0 = 0
6 * 1 = 6
Total number of cartons: 19
Enter number of boxes (max: 1000)
435
48 * 9 = 432
24 * 0 = 0
12 * 0 = 0
6 * 0 = 0
Total number of cartons: 10
Enter number of boxes (max: 1000)
1018
48 * 21 = 1008
24 * 0 = 0
12 * 0 = 0
6 * 1 = 6
Invalid Entry
Enter number of boxes (max: 1000)
990
48 * 20 = 960
24 * 1 = 24
12 * 0 = 0
6 * 1 = 6
Total number of cartons: 23

 */