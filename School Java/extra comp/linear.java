import java.util.Scanner;
class linear
{
     static int found,pos;
     public static void main()
     {
           Scanner in = new Scanner(System.in);
           int arr[] = {1,4,5,6,7,8,9,10,11,12,17,18,23,25,26,29,32,36,38,40};
           System.out.println("Enter a number to initialize Linear Search");
           int num = in.nextInt();
           for (int i = 0;i<20; i++)
           {
                if (arr[i] == num )
                {
                    found = 1;
                    pos = i;
                    break;
                }
            }
           
            if (found == 1)
           {
               System.out.println("Number found");
               System.out.println("Number : "+num);
               System.out.println("Position : "+pos);
            }
            else
            {
                System.out.println("Number not found");
            }
        }
    }