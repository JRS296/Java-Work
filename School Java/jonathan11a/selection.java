//Jonathan Rufus Samuel
//11A - 11120 (Pakenham Walsh)
// program to arrange an array using selection sort method
import java.util.Scanner;
class selection
{
    public static void main()//main method begins
    {
        Scanner input = new Scanner(System.in);//Scanner class is invoked
        System.out.println("Input values for unsorted array (10 values)");
        int X[] = new int[10];
        for (int a=0; a<10; a++)
        {
             X[a] = input.nextInt();//inputs value from user
        }
        int i,j,place,small,temp;
        System.out.println("Output");
        System.out.println("\nThe unsorted sorted array is :");
        for(i=0 ; i<10; i++)
        {
             System.out.print(X[i]+" ");
        }
        //Selection Sort begins here
        for(i=0 ; i<10-1; i++)
        {
            small = X[i];//initial value for smallest
            place = i;
            for(j=i+1 ; j<10; j++)
            {
                 if (X[j] < small)
                 {
                     small =X[j];
                     place = j;
                    }
            }
            temp = X[i];//swapping values
            X[i] = X[place];
            X[place] = temp;
        }
        System.out.println("Output");
        System.out.println("\nThe sorted array is :");
        for(i=0 ; i<10; i++)
        {
            System.out.print(X[i]+" ");//sorted array
        }
    }//main method ends
}
/*
 Input values for unsorted array (10 values)
12
23
43
54
76
84
60
29
40
34
Output

The unsorted sorted array is :
12 23 43 54 76 84 60 29 40 34 Output

The sorted array is :
12 23 29 34 40 43 54 60 76 84 
 */