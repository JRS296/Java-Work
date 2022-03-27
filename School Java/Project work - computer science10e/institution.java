import java.util.Scanner;
class institution
{
    public static void main ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks obtained");
        int marks = input.nextInt();
        if ( marks >= 300 )
        {
            System.out.println("Stream offered is Science");
        }
        else if ( marks >= 200 && marks < 300 )
        {
            System.out.println("Stream offered is Commerce");
        }
        else if ( marks >= 75 && marks < 200)
        {
            System.out.println("Stream offered is Arts");
        }
        else
        {
            System.out.println("Admmision is not granted, you have to appear in a qualifying examination");
        }
    }
}
        