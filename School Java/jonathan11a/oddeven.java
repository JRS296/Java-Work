//Jonathan Rufus Samuel
//11A - 11120 (Pakenham Walsh)
// program to arrange an array from odd to even
import java.util.Scanner;
class oddeven
{
    public static void main()//main method begins
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int X[] = new int[10];
        for(int i=0 ; i<10 ; i++)
        {
            X[i] = input.nextInt();//inputs value from user
        }
        int small,place,temp;int x;
        for(int i=0 ; i<10-1; i++)
        {
            small = X[i];
            place = i;
            for(int j=i+1 ; j<10; j++)
            {
                 if (X[j] < small)
                 {
                     small =X[j];
                     place = j;
                    }
            }
            temp = X[i];
            X[i] = X[place];
            X[place] = temp;
        }
        System.out.println("Output");
        System.out.println("\nThe sorted array is :");
        for(int i=0 ; i<10; i++)
        {
            System.out.print(X[i]+" ");
        }
    }//main method ends
}
/*
Enter 10 numbers
2
6
4
8
0
5
14
11
7
9
The sorted array is:
14 8 6 4 2 0 5 7 9 11
 */