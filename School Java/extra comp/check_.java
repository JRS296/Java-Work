import java.util.Scanner;
class check_
{
    public static void check(String str, char ch)
    {
        int l = str.length();char ch2 ;int count = 0;
        for (int a = 0; a < l; a++)
        {
            ch2 = str.charAt(a);
            if (ch2 == ch)
            {
                count++;
            }
        }
        System.out.println("Number of "+ch+" present : "+count);
    }
    public static void check(String str)
    {
        int l = str.length();char ch ;
        for (int a = 0; a < l; a++)
        {
            String st2 = str.toLowerCase();
            for (int b = 0; b < l; a=b++)
            {
                 char ch2 = str.charAt(b);
                 if ((ch2 == 'a')||(ch2 == 'e')||(ch2=='i')||(ch2=='o')||(ch2=='u'))
                 {
                     System.out.println(ch2);
                 }
            }
        }
    }
    public static void main()
    {
        obj check_ = new obj();
        System.out.println("Enter a String");
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        System.out.println("Enter a character");
        char cha = in.nextChar();
        if (cha == 32)
        {
            obj.check(st);
        }
        else 
        {
            obj.check(st,cha);
        }
    }
}
        