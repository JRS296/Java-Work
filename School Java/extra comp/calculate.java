import java.util.Scanner;
class calculate
{
      double X,Y;
      calculate(double X, double Y)
      {
            double x = X;
            double y = Y;
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
          calculate obj = new calculate(0,0);
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
                  