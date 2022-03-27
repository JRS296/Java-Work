import java.util.Scanner;
class pattern_
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
        pattern_ obj = new pattern_();
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
class calculate_
{
      calculate_()
      {
            double x = 0;
            double y = 0;
        }
      void square(double x)
      {
            double sqr_ar = x * x;
            double sqr_per = x + x + x + x;
            System.out.println("The area of square :"+ sqr_ar);
            System.out.println("The perimeter of square :"+ sqr_per);
        }
      void rectangle(double x,double y)
      {
            double sqr_ar = x * y;
            double sqr_per = 2 * ( x + y );
            System.out.println("The area of rectangle :"+ sqr_ar);
            System.out.println("The perimeter of rectangle :"+ sqr_per);
        }
      void circle(double x)
      {
            double sqr_ar = (22/7) * x * x;
            double sqr_per = 2 * (22/7) * x;
            System.out.println("The area of circle :"+ sqr_ar);
            System.out.println("The perimeter of circle :"+ sqr_per);
        }
      void triangle_per(double x, double y ,double z)
      {
            double sqr_per = x + y + z;
            System.out.println("The perimeter of triangle :"+ sqr_per);
        }  
      void triangle_area(double x, double y)
      {         
            double sqr_ar = (1/2) * (x * y);
            System.out.println("The area of triangle :"+ sqr_ar);
        }    
      public static void main()
      {
          Scanner in = new Scanner(System.in);
          calculate_ obj = new calculate_();
          System.out.println("Enter 1 for square");
          System.out.println("Enter 2 for rectangle");
          System.out.println("Enter 3 for circle");
          System.out.println("Enter 4 for triangle");
          double k;
          double j;
          int w = in.nextInt();
          switch (w)
          {
              case 1:
              System.out.println("Enter length of side");
              k = in.nextInt();
              obj.square(k);
              break;
              
              case 2:
              System.out.println("Enter length of rectangle");
              k = in.nextInt();
              System.out.println("Enter width of rectangle");
              j = in.nextInt();
              obj.rectangle(k,j);
              break;
              
              case 3:
              System.out.println("Enter radius of circle");
              k = in.nextInt();
              obj.circle(k);
              break;
              
              case 4:
              System.out.println("Enter 1 to find perimeter of triangle");
              System.out.println("Enter 2 to find area of triangle");
              int t = in.nextInt();
              switch (t)
              {
                  case 1:
                  System.out.println("Enter length of side1");
                  double side1 = in.nextInt();
                  System.out.println("Enter length of side2");
                  double side2 = in.nextInt();
                  System.out.println("Enter length of side3");
                  double side3 = in.nextInt();
                  obj.triangle_per(side1,side2,side3);
                  break; 
                
                  case 2:
                  System.out.println("Enter base of triangle");
                  k = in.nextInt();
                  System.out.println("Enter height of triangle");
                  j = in.nextInt();
                  obj.triangle_area(k,j);
                  break;
                  
                  default:
                  System.out.println("Data entered incorectly");
                  break;
              }
              
              default:
              System.out.println("Data entered incorectly");
              break;
            }
        }
    }
                            