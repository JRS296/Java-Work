import java.util.Scanner;
class marks
{
    Scanner input = new Scanner(System.in);
    
    void intro()
    {
        System.out.println("Enter the following marks as directed");
    }
    double english()
    {
        System.out.println("Enter marks for English 1");
        double e1 = input.nextDouble();
        System.out.println("Enter marks for English 2");
        double e2 = input.nextDouble();
        double e = (e1 + e2)/2;
        return e;
    }
    double maths()
    {
        System.out.println("Enter marks for Mathematics");
        double m = input.nextDouble();
        return m;
    }
    double socials()
    {
        System.out.println("Enter marks for History");
        double h = input.nextDouble();
        System.out.println("Enter marks for Geography");
        double g = input.nextDouble();
        double s = (g + h)/2;
        return s;
    }
    double sixth_sub()
    {
        System.out.println("Enter marks for Computer Applications");
        double c = input.nextDouble();
        return c;
    }
     double science()
    {
        System.out.println("Enter marks for Physics");
        double p = input.nextDouble();
        System.out.println("Enter marks for Chemistry");
        double c = input.nextDouble();
        System.out.println("Enter marks for Biology");
        double b = input.nextDouble();
        double sci = (p + c + b)/3;
        return sci;
    }
    void main()
    {
        marks obj = new marks();
        obj.intro();
        double Eng = obj.english();
        double Mat = obj.maths();
        double Soc = obj.socials();
        double Comp = obj.sixth_sub();
        double Sci = obj.science();
        double tot = Eng + Mat + Soc + Comp + Sci;
        double percent = tot/5;
        System.out.println("Total out of 500 :"+ tot);
        System.out.println("Percentage :"+ percent);
    }
    
}