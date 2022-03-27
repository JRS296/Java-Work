import java.util.Scanner;
class sahil_doubt
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your customer ID");
        int ID = in.nextInt();
        System.out.println("Enter customer name");
        String name = in.next();
        System.out.println("Enter no of units consumed");
        double units = in.nextDouble();
        
        System.out.println(ID);
        System.out.println(name);
        System.out.println(units);
    }
}