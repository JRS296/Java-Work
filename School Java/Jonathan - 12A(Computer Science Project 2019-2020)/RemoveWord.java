//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 9(Program to remove word from a sentence)
import java.util.*;
class RemoveWord//initialization of class
{           
    public static void main (String args[])//main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s = sc.nextLine();
        s = s.toUpperCase();
        int l = s.length();
        char last = s.charAt(l-1); // Extracting the last character
        if(last != '.' && last != '?' && last != '!')
        {// Checking whether the sentence ends with '.' or '?' or not 
            System.out.println("Invalid Input. End a sentence with either '.', '?' or '!' only");
        }
        else
        {
            StringTokenizer str = new StringTokenizer(s," .?!");
            int c = str.countTokens();
            String w="",ans = "";
            System.out.print("Enter the word to delete : ");
            String del = sc.next();
            System.out.print("Enter the word position is the sentence : ");
            int x = sc.nextInt();
            if(x<1 || x>c) // Checking whether integer inputted is acceptable or not
            {
                System.out.println("Sorry! The word position entered is out of range");
            }
            else
            {      
                for(int i=1; i<=c; i++)
                {
                    w = str.nextToken();
                    /* Skipping if the word to delete and the position matches */
                    if(w.equals(del)==true && i == x)
                    {
                        continue;
                    }
                    ans = ans + w + " ";
                }
                System.out.print("Output : "+ans.trim()+last);
            }
        }
    }//end of main method
}//end of class
/*
Enter a sentence : Roses are red, violets are blue.
Enter the word to delete : are
Enter the word position is the sentence : 2
Output : ROSES RED, VIOLETS ARE BLUE.

Enter a sentence : What is life, full of care?
Enter the word to delete : full
Enter the word position is the sentence : 4
Output : WHAT IS LIFE, OF CARE?
 */