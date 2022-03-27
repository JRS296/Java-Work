import java.util.Scanner;
class compfees2
{
     public static void main ()
    {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter Your name");
        name = input.nextLine();
        double marks;
        System.out.println("Enter Your Marks");
        marks = input.nextDouble();
        double fees;
        System.out.println("Enter Your annual fees");
        fees = input.nextDouble();
        double scol;
        double netfees;
        double scolamt;
        if ( marks >= 90 )
        {
            scol = 35.0/100;
        }
        else if ( marks >= 70 && marks < 90 )
        {
            scol = 20.0/100;
        }
        else 
        {
            System.out.println("No Scholarship offered");
            scol = 0;
        }
        scolamt = scol * fees;
        netfees = fees - scolamt;
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Fees : " + fees);
        System.out.println("Scolarship amount : " + scolamt);
        System.out.println("Net fees : " + netfees);
    }
}
        