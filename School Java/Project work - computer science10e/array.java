import java.util.Scanner;
class array
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        int cod[] = new int[10];
        int pric[] = new int[10];
        int qty[] = new int[10];
        int h,i ,j;
        for (j = 0 ; j < 10 ; j++)
        {
            System.out.println("Enter product code");
            cod[j] = input.nextInt();
            for (i = 0 ; i < 10 ; i++)
            {
                 System.out.println("Enter unit price");
                 pric[i] = input.nextInt();
                 for (h = 0 ; h < 10 ; h++)
                 {
                      System.out.println("Enter unit price");
                      qty[h] = input.nextInt();
                    }
                 int total = pric[i] * qty[h];
                 System.out.println("total price ="+ total);
                }
            }
        }
    }
                         