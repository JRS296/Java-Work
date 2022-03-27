import java.util.Scanner;
class pay
{
    Scanner in = new Scanner(System.in);
    String employee;
    double basic;
    double dear_allowance, house_allowance, prov_fund, netpay, grosspay;
     void input()
    {
        System.out.println("Enter name of employee");
        employee = in.nextLine();
        System.out.println("Enter basic pay");
        basic = in.nextDouble();
    }
    void calculate()
    {
        dear_allowance = 25.0/100 * basic;
        house_allowance = 15.0/100 * basic;
        prov_fund = 8.33/100 * basic;
        netpay = basic + dear_allowance + house_allowance;
        grosspay = netpay - prov_fund;
        System.out.println("Name: " + employee);
        System.out.println("Basic pay: " + basic);
        System.out.println("Net pay: " + netpay);
        System.out.println("Gross pay: " + grosspay);
    }
    public static void main()
    {
        pay obj = new pay();
        obj.input();
        obj.calculate();
    }
}
 