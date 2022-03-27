//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 21(Program to store names and ranks of students using super class)
import java.util.*;
class Record
{
    String name[] = new String[50];
    int rnk[] = new int[50];
    Record()//default constructor
    {
        for(int i=0; i<50; i++)
        {
            name[i] = "";
            rnk[i] = 0;
        }
    }
    void readValues()
    {
        Scanner in = new Scanner(System.in);
        for(int i=0; i<50; i++)//for loop for inputs
        {
            System.out.println("Enter name of the student: ");
            name[i] = in.nextLine();
            System.out.println("Enter rank of the student: ");
            rnk[i] = in.nextInt();
        }
    }
    void display()
    {
        System.out.println("Name\t\t"+"Rank");
        for(int i=0; i<50; i++)
        {
            System.out.println(name[i]+"\t\t"+rnk[i]);
        }
    }
}//end of base class
//codr written derived class
class Rank extends Record
{
    int index;
    Rank()//default constructor
    {
        index = 0;
    }
    void highest()//method to locate highest rank
    {
        for(int i=0; i<50; i++)
        {
            if(rnk[i] < rnk[index])
            {
                index = i;
            }
        }
    }
    void display()
    {
        super.display();
        System.out.println("The topmost rank:\t"+rnk[index]);
        System.out.println("Name of rankholder:\t\t"+name[index]);
    }
}