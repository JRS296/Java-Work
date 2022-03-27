//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 1(Program to conduct Quiz)
import java.util.Scanner;
import java.io.*;
class Quiz//initialization of class
{
    public static void main(String args[])//main method
    throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("Enter number of participants: ");
        int n = Integer.parseInt(br.readLine());//Inputs number of participants from user
        int highest = 0;
        if(n < 2 || n > 10)//checks if input is in range
        {
            System.out.println("INPUT SIZE OUT OF RANGE.");
            return;
        }
        char q[][] = new char[n][5];//initialization of array to store participants answers
        char a[] = new char[5];//initialization of array to store answer key
        int score[] = new int[n];
        System.out.println("Key to the questions:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = br.readLine().charAt(0);//input of answer key
        }
        System.out.println("Answers by participants:");
        for(int i = 0; i < n; i++)//for loop to enter answers of participants
        {
            System.out.println("Participant " + (i + 1));
            for(int j = 0; j < 5; j++)
            {
                q[i][j] = br.readLine().charAt(0);
                if(q[i][j] == a[j])
                {
                    score[i]++;
                }
            }
            if(highest < score[i])
            {
                highest = score[i];
            }
        }
        for(int i = 0; i < n; i++)//for loop to display scores of participants
        {
            System.out.println("Participant " + (i + 1) + " = " + score[i]);
        }
        System.out.println("Highest score(s):");
        for(int i = 0; i < n; i++)
        {
            if(score[i] == highest)//for loop to display highest score amongst participants
            {
                System.out.println("Participant " + (i + 1));
            }
        }
    }//end of main method
}//end of class

/*
Enter number of participants: 4
Key to the questions:
A
B
D
C
D
Answers by participants:
Participant 1
C
B
C
C
D
Participant 2
A
B
B
D
D
Participant 3
C
B
C
A
A
Participant 4
A
B
C
D
A
Participant 1 = 3
Participant 2 = 3
Participant 3 = 1
Participant 4 = 2
Highest score(s):
Participant 1
Participant 2

 */