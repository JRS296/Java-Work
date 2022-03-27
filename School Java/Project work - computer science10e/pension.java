import java.util.Scanner;
class pension
{
    public static void main ()
    {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter M for male and F for female");
        char gen = input.nextLine().charAt(0);
        if ( gen == 'M')
        {
            System.out.println("Enter your age");
            age = input.nextInt();
            if ( age >= 65 && age <= 70 )
            {
                System.out.println("Pension available is Rs 50");
            }
            else if ( age > 70 )
            {
                System.out.println("Pension available is Rs 70");
            }
            else
            {
                System.out.println("Invalid entry or age below 65");
            }
        }
        else if ( gen == 'F' )
        {
            System.out.println("Enter your age");
            age = input.nextInt();
            if ( age >= 60 && age <= 65 )
            {
                System.out.println("Pension available is Rs 45");
            }
            else if ( age > 65 )
            {
                System.out.println("Pension available is Rs 70");
            }
            else
            {
                System.out.println("Invalid entry or age below 60");
            }
        }
        else 
        {
            System.out.println("Invalid entry");
        }
    }
}
        