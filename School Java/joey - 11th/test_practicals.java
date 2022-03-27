//Name: Jonatham Rufus Samuel
// 11'A'
//Practicals mock test
import java.util.Scanner;
class test_practicals
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);//Scanner class
        int M,N;
        System.out.println("Enter a value between 100 and 10000");
        M = input.nextInt();//inputs a value between 100 and 10000
        System.out.println("Enter a value between 0 and 100");
        N = input.nextInt();//inputs a value between 0 and 100
        if((M>100&&M<10000)&&(N>0&&N<100))//checks if value is correct
        {
            int x,y,sum = 0,count = 0,x2;
            for (x=M;x<=10000;x++)
            {
                x2 = x;
                while(x2>0)//extracts digit
                {
                    y = x2%10;
                    sum += y;
                    x2 = x2/10;
                    count++;
                }
                if(sum == N)
                {
                    System.out.println("The number is : "+ x );
                    System.out.println("Number of digits : "+count);
                    break;
                }
                else
                {
                    sum = 0;count = 0;
                }
            }
        }
        else
        {
            System.out.println("Invalid entry");
        }
    }
}

/*
Enter a value between 100 and 10000
105
Enter a value between 0 and 100
11
The number is : 119
Number of digits : 3

Enter a value between 100 and 10000
112
Enter a value between 0 and 100
24
The number is : 699
Number of digits : 3

Enter a value between 100 and 10000
150
Enter a value between 0 and 100
15
The number is : 159
Number of digits : 3

 */