//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 4(Program to sort paragraphs of sentences)
import java.util.*;
public class sortpara//initialization of class
{
    int countWords(String s)//Function to count no. of words in every sentence
    {
        StringTokenizer str = new StringTokenizer(s," .,?!");
        int c = str.countTokens();
        return c;
    }//end of method countWords()
    // Function to sort the sentences in ascending order of their no. of words
    void sort(String w[], int p[]) //method to sort sentences
    {
        int n = w.length, t1 = 0;
        String t2 = "";
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)     
            {               
                if(p[i]>p[j]) // for descending use p[i]<p[j]
                {
                    t1 = p[i];
                    p[i] = p[j];
                    p[j] = t1;
                    t2 = w[i];
                    w[i] = w[j];
                    w[j] = t2;
                }
            }
        }
        printResult(w,p);    
    }//end of method sort()
    void printResult(String w[], int p[]) //method to print end result
    {
        int n = w.length;
        for(int i=0; i<n; i++)   
        {           
            System.out.println(w[i]+"\t=\t"+p[i]);    
        }     
    }//end of method printResult()
    public static void main(String args[]) //main method 
    {        
        sortpara obj = new sortpara();//creation of object
        Scanner sc = new Scanner(System.in);//initialization of Scanner class    
        System.out.print("Enter paragraph : "); 
        String pg = sc.nextLine();//inputs paragraph to be sorted  
        StringTokenizer str = new StringTokenizer(pg,".?!");         
        int count = str.countTokens();
        //Counting no. of sentences in the paragraph         
        //if(count > 10)System.out.println("Amum of 10 sentences are allowed in the paragraph");
        String sent[] = new String[count];
        int p[] = new int[count]; 
        for(int i=0; i<count; i++)
        {
            sent[i] = str.nextToken().trim(); 
            p[i] = obj.countWords(sent[i]); 
        }
        obj.sort(sent,p);
    }//end of main method
}//end of class

/*
Enter paragraph : Hello! How are you? I'm doing fine,thank you.
Hello	=	1
How are you	=	3
I'm doing fine,thank you	=	5

Enter paragraph : When life gives you lemons, you make lemonade. Don't let life bog you down.
Don't let life bog you down	=	6
When life gives you lemons, you make lemonade	=	8

 */
