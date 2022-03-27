import java.util.Scanner;
import java.lang.*;
class salary
{
    String name;
    String address;
    String phone;
    String sub;
    double monthly;
    double tax = 5.0/100;
    double in_tax;
    Scanner in = new Scanner(System.in);
    public void input()
    { 
        System.out.println("Enter name");
        name = in.nextLine();
        System.out.println("Enter address");
        address = in.nextLine();
        System.out.println("Enter phone number");
        phone = in.nextLine();
        System.out.println("Enter specialized subject");
        sub = in.nextLine();
        System.out.println("Enter monthly salary");
        monthly = in.nextInt();
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phone);
        System.out.println("Specialized subject: " + sub);
        System.out.println("Monthly salary: " + monthly);
    }
    public void taxes()
    {
        in_tax = tax * monthly;
        monthly += in_tax;
        System.out.println("Income tax: " + in_tax);
        
    }
    public static void main (String args[])
    {
        salary obj = new salary();
        obj.input();
        if (obj.monthly > 175000)
        {
            obj.taxes();
        }
        obj.display();
    }
}
