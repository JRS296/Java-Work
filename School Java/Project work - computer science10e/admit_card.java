import java.util.Scanner;
import java.lang.*;
class admit_card
{
    Scanner input = new Scanner(System.in);
    String candidate;
    String date;
    String centre;
    long roll;
    public void input()
    {
        System.out.println("Enter name of candidate");
        candidate = input.nextLine();
        System.out.println("Enter date of examination");
        date = input.nextLine();
        System.out.println("Enter Examination centre");
        centre = input.nextLine();
        System.out.println("Enter roll number of candidate");
        roll = input.nextInt();
    }
    public void output()
    {
        System.out.print("Name of candidate: " + candidate);  
        System.out.println("\0Date: " + date);
        System.out.print("Examination centre: " + centre);  
        System.out.println("\0Roll number: " + roll);
    }
    public static void main (String[] args)
    {
        admit_card obj = new admit_card();
        obj.input();
        obj.output();
    }
}
//Program by Jonathan Rufus Samuel, 10-E, Bishop Cotton Boys' School
//input: Jonathan Rufus Samuel
//       9/20/2017
//       Bangalore
//       10517
//output: Name of candidate: Jonathan Rufus Samuel       Date:9/20/17
//        Examination Centre: Bangalore                  Roll Number: 10517