//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 24(Program to input,find and arrange admission numbers)
import java.util.*;
class Admission//initialization of class
{
    int Adno[]=new int[100];//initialization of array
    static Scanner sc = new Scanner(System.in);//Scanner class
    Admission() // Default constructor
    {
        for(int i=0; i<100; i++)
        {
            Adno[i]=0;
        }
    }
    void fillArray()throws Exception // Function to accept elements in ascending order
    {
        for(int i=0; i<100; i++)
        {
            System.out.print("Enter Admission no of student "+(i+1)+": ");
            Adno[i] = sc.nextInt();
        }
        /*Sorting the array in ascending order */
        int temp=0;
        for(int i=0; i<99; i++)
        {
            for(int j=i+1; j<100; j++)
            {
                if(Adno[i]>Adno[j])
                {
                    temp = Adno[i];
                    Adno[i] = Adno[j];
                    Adno[j] = temp;
                }
            }
        }            
    }
    int binSearch(int l, int u, int v) // Recursive function implementing binary search
    {
        int mid = (l + u)/2;
        if(u < l) // condition if the search is unsuccessful
        {
            return -1;
        } 
        if(v==Adno[mid]) // condition if the search is successful
        {
            return 1;
        }
        else if(v>Adno[mid]) 
        {
            return binSearch(mid+1,u,v);
        }
        else
        {
            return binSearch(l,mid-1,v);
        }
    }
    public static void main(String args[])throws Exception//main method
    {
        Admission ob = new Admission();
        System.out.println("Enter Admission number in ascending order");
        ob.fillArray();
        System.out.print("Enter an Admission number to search : ");
        int v = sc.nextInt();
        int f = ob.binSearch(0,99,v);
        System.out.println("*****************************");
        if(f == 1)
        {
            System.out.println("Admission Number found");
        }
        else
        {
            System.out.println("Admission Number Not found");
        }
    }//end of main method
}//end of class