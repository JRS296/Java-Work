import java.io.*;

public class SeqInpStream {
    //Using SequenceInputStream
    public static void main(String args[])throws Exception{    
        FileInputStream input1=new FileInputStream("College Java/Assignments/Ass - 2/holi.txt");    
        FileInputStream input2=new FileInputStream("College Java/Assignments/Ass - 2/holi2.txt");    
        SequenceInputStream inst=new SequenceInputStream(input1, input2);    
        int j;    
        while((j=inst.read())!=-1){    
         System.out.print((char)j);    
        }    
        inst.close();    
        input1.close();    
        input2.close();    
       }    
}

  
