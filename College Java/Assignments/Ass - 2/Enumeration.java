import java.io.*;
import java.util.*;

public class Enumeration {
    public static void main(String args[]) throws IOException {
        // creating the FileInputStream objects for all the files
        FileInputStream fin = new FileInputStream("College Java/Assignments/Ass - 2/holi.txt");
        FileInputStream fin2 = new FileInputStream("College Java/Assignments/Ass - 2/holi1.txt");
        FileInputStream fin3 = new FileInputStream("College Java/Assignments/Ass - 2/holi2.txt");
        FileInputStream fin4 = new FileInputStream("College Java/Assignments/Ass - 2/holi3.txt");
        // creating Vector object to all the stream
        Vector v = new Vector();
        v.add(fin);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
        // creating enumeration object by calling the elements method
        java.util.Enumeration<? extends InputStream> e = v.elements();
        // passing the enumeration object in the constructor
        SequenceInputStream bin = new SequenceInputStream(e);
        int i = 0;
        while ((i = bin.read()) != -1) {
            System.out.print((char) i);
        }
        bin.close();
        fin.close();
        fin2.close();
    }
}