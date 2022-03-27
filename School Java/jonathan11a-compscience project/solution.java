//Jonathan Rufus Samuel
//11A - 11120 (Pakenham Walsh)
/* Function to Sort the array of string 
    according to lengths. This function  
    implements Insertion Sort.  */
import java.util.Scanner;
class solution 
{ 
    static void sort(String []s, int n)//main method begins
    { 
        for (int i=1 ;i<n; i++) 
        { 
            String temp = s[i]; 

            // Insert s[j] at its correct position 
            int j = i - 1; 
            while (j >= 0 && temp.length() < s[j].length()) 
            { 
                s[j+1] = s[j]; 
                j--; 
            } 
            s[j+1] = temp; 
        } 
    } 
    // Function to print the sorted array of string 
    static void printArraystring(String str[], int n) 
    { 
        for (int i=0; i<n; i++) 
            System.out.print(str[i]+" "); 
    }     
    public static void main(String args[]) //main function 
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");String arr=" ";
        String st = input.nextLine();//inputs value from user
        String[] ar = st.split("\\s");
        for (int i=0; i < ar.length; i++)
        {
            arr = ar[i];
        }
        int n = ar.length; 
        sort(arr,n); // Function to perform sorting 
        printArraystring(arr, n); // Calling the function to print result 
    } //main method ends
} 

/*
Enter a string
The quick brown fox jumps over the lazy dog
dog fox The the lazy over brown jumps quick

Enter a string
Google is preferred over Internet Explorer
is over Google Explorer Internet preferred
 */