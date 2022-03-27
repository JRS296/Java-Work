import java.util.Scanner;
import geometry.*;
class calculator
{
    public static void main()
    {
        System.out.println("Enter 1 to calculate area of circle");
        System.out.println("Enter 2 to calculate area of square");
        System.out.println("Enter 3 to calculate area of rectangle");
        area obj = new area();
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        switch(x)
        {
            case 1:
            obj.area_circle();
            break;
            
            case 2:
            obj.area_square();
            break;
            
            case 3:
            obj.area_rectangle();
            break;
        }
    }
}
