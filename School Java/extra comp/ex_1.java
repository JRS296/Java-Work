import java.util.Scanner;
class ex_1
{
    void result(int roll , double m1 , double m2 , double m3)
    {
        double tot , per;
        tot = m1 + m2 + m3;
        per = tot/3;
        System.out.println("Marks in first subject : "+ m1);
        System.out.println("Marks in second subject : "+ m2);
        System.out.println("Marks in third subject : "+ m3);
        System.out.println("Total Marks : "+ tot);
        System.out.println("Percentage : "+ per +"%");
    }
    public static void main ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks in first subject");
        double m_1 = input.nextDouble();
        System.out.println("Enter marks in second subject");
        double m_2 = input.nextDouble();
        System.out.println("Enter marks in third subject");
        double m_3 = input.nextDouble();
        System.out.println("Enter roll number");
        int ro = input.nextInt();
        ex_1 obj = new ex_1();
        obj.result(ro,m_1,m_2,m_3);
    }
}
        