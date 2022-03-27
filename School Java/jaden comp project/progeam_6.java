public class progeam_6
{            
    public static void main() 
    {          
        int rows = 5;  
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
              
            System.out.println();
        }
    }
}
 