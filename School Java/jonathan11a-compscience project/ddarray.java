import java.util.Scanner;
class ddarray
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[4][4];
        System.out.println("Enter elements of array");
        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<4;j++)
            {
                arr[i][j]= input.nextInt();
            }
            System.out.println();
        }
        System.out.println("The array before the change :");
        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<4;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The array with the change :");int x = 0;
        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<4;j++)
            {
                if(i==x&&j==x)
                {
                    System.out.print("0 ");
                }
                else 
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            x++;
            System.out.println();
            
        }
    }
}
        