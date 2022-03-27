// Jonathan Rufus Samuel
//11A - 11120 (Pakenham Walsh)
// program to count the sum of the diagonals in an array
import java.util.*;
class sum_diagonals
{
    public static void main()//main method begins
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of square array");
        int x=sc.nextInt();//inputs value from user
        int a[][]=new int[x][x];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                System.out.println("enter a number");
                a[i][j]=sc.nextInt();//inputs value from user
            }
        }
        System.out.println();
        System.out.println("the array is: ");//displaying
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
        }
        System.out.println();
        int s=0;int s1=0;//calculation part
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x;j++)
            {
            if(i==j)
                {
                    s=s+a[i][j];                
                }
            if(i+j==(x-1))
                {
                    s1=s1+a[i][j];
                }            
            }
        }
        System.out.println("sum of left diagonal: "+s);
        System.out.println("sum of right diagonal: "+s1);
    }
}
/*
enter the size of square array
4
enter a number
4
enter a number
42
enter a number
3
enter a number
4
enter a number
35
enter a number
67
enter a number
8
enter a number
55
enter a number
4
enter a number
87
enter a number
7
enter a number
66
enter a number
90
enter a number
45
enter a number
36
enter a number
84

the array is: 
4 42 3 4 
35 67 8 55 
4 87 7 66 
90 45 36 84 

sum of left diagonal: 162
sum of right diagonal: 189

 */