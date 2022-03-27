import java.util.Scanner;
class pattern
{
    public void pattern_1()
    {
        for (int a =1 ; a <= 5 ; a++ )
        {
            char c = 'A';
            for ( int b = 1 ; b <= a ; b++)
            {
                System.out.print(c);c++;
            }
            System.out.println();
        }
    }
    public void pattern_2()
    {
        
        for (int a = 5 ; a >= 1 ; a-- )
        { 
            for ( int b = 1 ; b <= a ; b++)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        
     }
    public static void main ()
    {
        Scanner input = new Scanner(System.in);
        pattern obj = new pattern();
        System.out.println("Enter 1 for pattern 1 and 2 for pattern 2");
        int x = input.nextInt();
        switch (x)
        {
            case 1 :
            obj.pattern_1();
            break;
            
            case 2 :
            obj.pattern_2();
            break;
            
            default :
            System.out.println("Invalid entry");
            break;
        }
    }
}
