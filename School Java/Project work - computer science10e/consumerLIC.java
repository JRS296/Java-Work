import java.util.Scanner;
class consumerLIC
{
    
    public static void main (String args[])
    {
        String name;
        String pno;
        double pramt;
        double salary;
        double premium;
        double gross;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter customer's name: ");
        name = in.nextLine();
        System.out.println("Enter policy number: ");
        pno = in.nextLine();
        System.out.println("Enter salary: ");
        salary = in.nextInt();
        pramt = 15.0/100 * salary;
        gross = salary - pramt;
        System.out.println("Customer's name: " + name);
        System.out.println("Policy number: " + pno);
        System.out.println("Premium amount: "+ pramt);
        System.out.println("Salary: "+ salary);
        System.out.println("Gross salary: " + gross);
    }
}
        