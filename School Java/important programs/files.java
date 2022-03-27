import java.io.*;
import java.util.Scanner;
class files
{
    public static void main(String args[])throws IOException
    {
        FileOutputStream fo = new FileOutputStream("Chicken.Txt");
        DataOutputStream fout = new DataOutputStream(fo);
        Scanner input = new Scanner(System.in);int n;
        for(int i=0 ; i<10; i++)
        {
            n = input.nextInt();
            fout.writeInt(n);
        }
        fout.close();
        }
    }

