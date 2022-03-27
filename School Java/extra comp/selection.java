import java.util.Scanner;
class selection
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
            small = X[i];
            place = i;
            for(j=i+1 ; j<10; j++)
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
        for(i=0 ; i<10; i++)
        {
            System.out.print(X[i]+" ");
        }
    }
}
