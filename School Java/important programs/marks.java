import java.io.*;
import java.util.Scanner;

class marks
{
    public static void main(String args[])throws IOException
    {
        FileOutputStream fo = new FileOutputStream("Mark.dat");
        DataOutputStream fout = new DataOutputStream(fo);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = input.nextInt();
        String name; double p,c,b;
        for(int i=1 ; i<=n ; i++)
        {
            System.out.println("Enter student's name");
            name = input.next();
            System.out.println("Enter student's marks in Physics");
            p = input.nextDouble();
            fout.writeDouble(p);
            System.out.println("Enter student's marks in Chemistry");
            c = input.nextDouble();
            fout.writeDouble(c);
            System.out.println("Enter student's marks in Biology");
            b = input.nextDouble();
            fout.writeDouble(b);
        }
        fout.close();
        FileInputStream fi = new FileInputStream("Chicken.Txt");
        DataInputStream fin = new DataInputStream(fi);
        System.out.println("List of records of each student");double n1,n2,n3;double per;
        for(int i = 0; i<n ; i++)
        {
            n1 = fin.readDouble();
            System.out.println(n1);
            n2 = fin.readDouble();
            System.out.println(n2);
            n3 = fin.readDouble();
            System.out.println(n3);
            System.out.println("Total marks: "+(n1+n2+n3));
            per = (n1+n2+n3)*100/3;
            System.out.println("Percentage: "+per);
        }
        fin.close();
    }
}