import java.io.*;

public class FileInputStream_Demo {
    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("dummy.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.println((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class Intellipaat {
    public static void main(String args[]) {
        try{
            FileOutputstream fo = new FileOutputStream("dummy.txt");
            String i= "Hello World";
            byte b[]=i.getBytes(); //converting string into byte array
            fo.write(i);
            fo.close();
    }
    catch(Exception e){ 
    System.out.println(e);}
    }
}
