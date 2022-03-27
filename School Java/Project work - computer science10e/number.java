import java.util.Scanner;
class number
{
    
    void question3(int num)
    {
        System.out.println("Enter 1 to find Armstrong number and 2 to find sum of 1st and last digits of a number");
        Scanner input = new Scanner(System.in);
        int z = input.nextInt();
        switch (z)
        {
        case 1 :
        int cube , sum = 0;
        int temp = num;
        while (temp > 0)
        {
            int digit = temp%10;
            cube = digit * digit * digit;
            sum = sum + cube;
            temp /= 10;
        }
        System.out.println("Output :");
        if (sum == num)
        {
            System.out.println(num + " is an Armstrong number");
        }
        else
        {
            System.out.println(num + " is not an armstrong number");
        }
        break;
        
        case 2 :
        System.out.println("Finding the sum of first and last digits of " + num);int x = 0;
        sum = num%10;
        for (int n = num ; n> 0 ; n=n/10)
        {
             x = n ;
        }
        sum = sum + x;
        System.out.println("The sum of the first and last digits of " + num + " is "+sum);
        break;
      }
    }
    
    void question6(int num)
     {
        int sum , square , digit ;
        if (num >= 0)
        {
             square = num*num;
          
             sum = 0;
             for (int n = square ; n > 0 ; n = n / 10)
             {
                digit = n % 10;
                sum = sum + digit;
             }
             System.out.println("Output :");
             if (sum == num)
             {
                System.out.println(num + " is a neon number");
             }
             else
             {
                System.out.println(num + " is not a neon number");
             }
            
             }
        
        
            else 
           {
               System.out.println("Negative number inputed , program terminated");
               return;
           }
         }    
    public static void main ()
       {
           number obj = new number();
           Scanner input = new Scanner(System.in);
           System.out.println("Enter 1 to find Armstrong number");
           System.out.println("Enter 2 to find Neon number");
           int x = input.nextInt(); 
           System.out.println("Enter number");
           int num = input.nextInt();
            switch (x)
            {
              case 1 :
              obj.question3(num);
              break;
            
              case 2 :
              obj.question6(num);
              break;
            
              default :
              System.out.println("Invalid entry");
              break;
           }
       }
    }