import java.util.Scanner;
class SI
{
    
    String n;
    long a;
    double p;
    double r;
    int t;
    void simple(String name , long acn , double principal , double rate , int time)
    {
        
        n = name;
        a = acn;
        p = principal;
        r = rate;
        t = time;
        
        double si = (p*r*t)/100;
        System.out.println("Name :" + n);
        System.out.println("Account number :" + a);
        System.out.println("Principal amount :" + p);
        System.out.println("Rate :" + r);
        System.out.println("Time :" + t);
        System.out.println("Simple Interest :" + si);
    }
    public void main()
    {
        Scanner input = new Scanner(System.in);
        SI obj = new SI();
        System.out.println("Enter name ");
        String na = input.nextLine();
        System.out.println("Enter Account number ");
        long ac = input.nextLong();
        System.out.println("Enter principal amount ");
        double pr = input.nextDouble();
        System.out.println("Enter rate ");
        double ra = input.nextDouble();
        System.out.println("Enter time ");
        int ti = input.nextInt();
        SI.simple(na,ac,pr,ra,ti);
    }
}
        