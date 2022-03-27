//Jonathan Rufus Samuel
//11A
import java.util.Scanner;
class bubble
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input values for unsorted array (10 values)");
        int X[] = new int[10];
        for (int a=0; a<10; a++)
        {
             X[a] = input.nextInt();
        }
        int k,j,temp;
        System.out.println("Output");
        System.out.println("\nThe unsorted sorted array is :");
        for(j=0 ; j<10; j++)
        {
             System.out.print(X[j]+" ");
        }
        System.out.println();
        //Bubble Sort begins here
         for(j=0 ; j<10-1; j++)
        {
            for(k=0 ; k<10-j-1; k++)
            {
                 if (X[k] > X[k+1])
                 {
                     temp = X[k];
                     X[k] = X[k+1];
                     X[k+1] = temp;
                    }
            }
        }
        System.out.println("Output");
        System.out.println("\nThe sorted array is :");
        for(j=0 ; j<10; j++)
        {
            System.out.print(X[j]+" ");
        }
    }
}
/*
 Input values for unsorted array (10 values)
56
34
12
78
45
22
07
34
23
88
Output

The unsorted sorted array is :
56 34 12 78 45 22 7 34 23 88 
Output

The sorted array is :
7 12 22 23 34 34 45 56 78 88 
 */
