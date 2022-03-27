import java.util.Scanner;
import java.lang.String;
class name
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String nam = input.nextLine().charAt(0);
        System.out.println("Enter a char");
        char Ch = input.nextLine().charAt(0);
        
        
        if (ch >= 'A' && ch <= 'Z')
        {
            Ch = (char)(ch + 32);
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            Ch = (char)(ch - 32);
        }
        else
        {
            Ch = ch;
        }
        System.out.println("ORginal name " + nam);
        System.out.println("New Character: " + Ch);
    }
}
