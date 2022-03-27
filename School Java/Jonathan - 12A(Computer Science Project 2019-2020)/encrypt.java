//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 11(Program to encrypt a sentence)
import java.io.*;
class encrypt//initialization of class
{
    public static void main(String args[])//main method
    throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int nos;
        System.out.print("Enter number of sentences: ");
        nos=Integer.parseInt(br.readLine());//inputs number of sentences
        if(nos<1 || nos>=10)//checks if input is a valid entry
            System.out.println("\nInvalid Entry");
        else
        {
            int i,j,p,l;
            String s[]=new String[nos];
            System.out.print("\nEnter "+nos+" sentences : ");
            for(i=0;i< nos;i++)
            {
                s[i]=(br.readLine()).toUpperCase();
            }
            for(i=0;i< nos;i++)
            {
                String t;
                s[i]=" "+s[i];// add a blank space before each sentence 
                l=s[i].length();
                if(i%2==0)
                {
                    t="";
                    for(j=0;j< l;j++)
                    {
                        // store the ASCII code of the character
                        int ch=s[i].charAt(j);
                        if(ch!=32 && ch!='.'){
                            ch=ch+2;//shift the letter two spaces
                            if(ch>90)//to maintain cyclic order
                                ch=ch-26;// subtract 26
                        }
                        //convert to character and add to a temporary string
                        t=t+(char)ch;
                    }
                    s[i]=t.trim();// remove leading or trailing spaces
                }
                else
                {
                    t="";
                    p=l-1;
                    for(j=l-1;j>=0;j--)
                    { 
                        //reverse loop to start extraction of words 
                        //from last to first
                        char ch=s[i].charAt(j);
                        if(ch==' ')
                        {
                            t=t+s[i].substring(j+1,p)+" "; 
                            // add the extracted word and a space
                            p=j;
                        }
                    }
                    t=t+"."; 
                    s[i]=t;
                }
            }
            System.out.println("\nOUTPUT:");
            for(i=0;i< nos;i++)
            {
                System.out.print(s[i]);//output
            }
        }
    }//end of main method
}//end of class

/*
Enter number of sentences: 2

Enter 2 sentences : Grass is greener on the other side.
Chicken tastes good.

OUTPUT:
ITCUU KU ITGGPGT QP VJG QVJGT UKFG.GOOD TASTES CHICKEN .


Enter number of sentences: 3

Enter 3 sentences : Too much food makes you fat.
Today's politics bewilders me.
Hello from the other side.

OUTPUT:
VQQ OWEJ HQQF OCMGU AQW HCV.ME BEWILDERS POLITICS TODAY'S .JGNNQ HTQO VJG QVJGT UKFG.
 */