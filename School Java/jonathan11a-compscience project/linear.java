//Jonathan Rufus Samuel
//11A - 11120 (Pakenham Walsh)
// program to find number in array using linear search
import java.util.Scanner;
class linear
{
    public static void main()//main method begins
    {
        Scanner input = new Scanner(System.in);
        int arr[] = {25,5,10,32,1,7,9,6,11,17};
        System.out.println("The Array:");
        for (int i = 0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("enter a number to be searched");
        int x = input.nextInt();//inputs value from user
        for (int i = 0;i<10;i++)
        {
            if(arr[i]==x)
            {
                System.out.println("found");
                System.out.println("pos = "+i);
            }
        }
    }//main method ends
}
/*
 The Array:
25 5 10 32 1 7 9 6 11 17 
enter a number to be searched
7
found
pos = 5


 */   