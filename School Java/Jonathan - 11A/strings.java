import java.util.Scanner;
class strings
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = input.nextLine();
        int x = name.length();String str="",str2;char ch,ch2;
        for(int i = 0; i<x;i++)
        {
            ch = name.charAt(i);
            if(i==0)
            {
                str += ch + ". ";
            }
            else if (ch == ' ')
            {
               int a = name.lastIndexOf(' ');
                if (i == a)
               {
                   str2 = name.substring(a,x);
                   str += str2;
               }
               ch2 = name.charAt(i+1);
               str += ch2 + ". ");
            }
        }
        System.out.println("Full name: " +name);
        System.out.println("Initials : "+str);
    }
}
