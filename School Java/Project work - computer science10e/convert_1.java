import java.util.Scanner;
import java.lang.String;
class convert_1
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = input.nextLine().charAt(0);
        char Ch ;
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
        System.out.println("Orginal Character: " + ch);
        System.out.println("New Character: " + Ch);
    }
}
