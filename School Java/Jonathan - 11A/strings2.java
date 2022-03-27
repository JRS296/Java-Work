import java.util.Scanner;
class strings2
{
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = input.nextLine();
        int x = st.length();String st2,st_f;char ch ;
        for (int i = 0; i<x; i++)
        {
            ch = st.charAt(i);
            if (ch>='A' && ch<='Z')
            {
                int y = st.indexOf(' ');
                st2=st.substring(0,y);
                st_f += st2+" ";
                st = st.substring(y,x);
            }
            
            if(ch==' ')
            {
                System.out.println
            }