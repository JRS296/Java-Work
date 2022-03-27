import java.util.Scanner;
class pattern
{
    void pattern1()
    {
        for (int i =1; i<= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.println(j+" ");
            }
            System.out.println();
        }
    }
    void pattern2()
    {
        for (int i =1; i<= 5; i++)
        {
            for(int j = 5; j >= i; j--)
            {
                System.out.println(j+" ");
            }
            System.out.println();
        }
    }
    void pattern3()
    {
         char st;
         for ( int x = 1 ; x <= 26 ; x++)
         {
             st = 'A';
             for ( int j = 1; j<= x ; j++)
             {
                 System.out.print(st +" ");
                 st += 1;
                }
                System.out.println();
            }
    }
    void pattern6()
    {
         Scanner input = new Scanner(System.in);
         String str;
         int i,j,len;
         System.out.print("Enter a string of your choice");
         str = input.nextLine();
         len = str.length();
         System.out.println("Output: ");
         for ( i = 0; i < len; i++)
         {
             for ( j = 0; j <= i ; j++ )
             {
                  char ch = str.charAt(j);
                  System.out.print(ch + " ");
                }
                System.out.println();
            }
        }
    void pattern5()
    {
        for (int x = 5; x>=1 ; x--)
        {
            for(int y = 1; y<=x ; y++)
            {
                System.out.println(y + " ");
            }
            for (int y = 1; y<= 5-x ;y++)
            {
                System.out.println(y +" ");
            }
            System.out.println();
        }
    }
    void pattern4()
    {
        int space = 29;
        for(int j = 0; j<=5 ; j++)
        {
            for(int k =1; k<= space; k++)
            {
                System.out.println(" ");
            }
            for( int y = j; y>=0 ; y--)
            {
                System.out.print(y);
            }
            for( int y = j; y<=j ; y++)
            {
                if(j==0)
                break;
                System.out.print(y);
            }
            System.out.println();
            space--;
        }
    }
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        pattern obj = new pattern();
        System.out.println("Enter numbers 1-6 for different patterns");
        int n = input.nextInt();
        switch(n)
        {
            case 1: obj.pattern1(); break;
            case 2: obj.pattern2(); break;
            case 3: obj.pattern3(); break;
            case 4: obj.pattern4(); break;
            case 5: obj.pattern5(); break;
            case 6: obj.pattern6(); break;
        }
    }
}
            