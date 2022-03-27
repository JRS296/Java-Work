class DESIGNS
{
    public static void main()
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
    }