import java.util.Scanner;
class rewrite
{
    public static void main ()
    {
        char code;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter B for Bank Manager");
        System.out.println("Enter C for Charted Accountant");
        System.out.println("Enter E for Engineer");
        System.out.println("Enter M for Minister");
        code = input.nextLine().charAt(0);
        switch (code)
        {
            case 'B':
            case 'b':
            System.out.println("Bank Manager");
            break;
            
            case 'C' :
            case 'c' :
            System.out.println("Charted Accountant");
            break;
            
            case 'E' :
            case 'e' :
            System.out.println("Engineer");
            break;
            
            case 'M' :
            case 'm' :
            System.out.println("Minister");
            break;
        }
    }
}
            