import java.util.Scanner;
class bubble
{
    public static void main()//main method begins
    {
        Scanner input = new Scanner(System.in);//Scanner clas is invoked
        System.out.println("Input values for unsorted array (10 values)");
        int X[] = new int[10];//initialization of array
        for (int a=0; a<10; a++)
        {
             X[a] = input.nextInt();//inputs value from user
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
                     temp = X[k];//swapping of values
                     X[k] = X[k+1];
                     X[k+1] = temp;
                    }
            }
        }
        System.out.println("Output");
        System.out.println("\nThe sorted array is :");
        for(j=0 ; j<10; j++)
        {
            System.out.print(X[j]+" ");//sorted array is displayed
        }
    }//main method ends
}