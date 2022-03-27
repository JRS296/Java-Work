import java.io.*;
class files2
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fi = new FileInputStream("Chicken.Txt");
        DataInputStream fin = new DataInputStream(fi);
        System.out.println("Displaying values");int n;
        for(int i = 0; i<10 ; i++)
        {
            n = fin.readInt();
            System.out.println(n);
        }
        fin.close();
    }
}