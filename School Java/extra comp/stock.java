import java.util.Scanner;
class stock
{
    static String pname;
    static int qty;
    static double price,total,discount,netPrice;
    stock(String n, int q, double p)
    {
          pname = n;
          qty = q;
          price = p;
        }
    void calculation()
    {
        
        total = price * qty;
        if (total<15000)
        {
            System.out.println("You are elligible for 25% discount");
            discount = 25/100.0;
            double netprice = total - (total*discount);
        }
        else
        {
            System.out.println("You are not elligible for discount");
            discount = 0;
            double netprice = total;
        }
    }
    void printAmount()
    {
         System.out.println("Item purchased :"+pname);
         System.out.println("Unit price :"+ price);
         System.out.println("Quantity :"+ qty);  
         System.out.println("Unit price :"+ price);
         System.out.println("Discount :"+ discount);
         System.out.println("Net Price :"+ netprice);
        }
    public void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product name :");
        String n = input.nextLine();
        System.out.println("Enter Quantity :");
        int q = input.nextLine();
        System.out.println("Enter Price :");
        double p = input.nextLine();
        stock obj = new stock(n,q,p);
        obj.calculate();
        obj.printAmount();
    }
}
        