import java.util.Scanner;
class sample
{
    Scanner input = new Scanner (System.in);
    double unprice;    
    double quantity;
    int pcode;
    double total;
    double net;
    double discount;
    void product()
    {
        System.out.println("Enter code of product :");
        pcode = input.nextInt();
        System.out.println("Enter price of unit article :");
        unprice = input.nextDouble();
        System.out.println("Enter quantity :");
        quantity = input.nextDouble();
        
        total = unprice * quantity;
        discount = 12.0/100 * total;
        net = total - discount;
        
        System.out.println("Total price :" + total);
        System.out.println("Discount = 12%");
        System.out.println("Final price" + net);
    }
    public static void main ()
    {
        sample obj = new sample();
        obj.product();
    }
}
        