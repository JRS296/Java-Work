//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 8(Program to sort integers using pendulum arrangement)
import java.util.Arrays; 
import java.util.Scanner;
class Pendulum//initialization of class
{ 
    // Prints pendulum arrangement of arr[] 
    static void Arrange(int arr[], int n) //method to arrange elements
    { 
        // sorting the elements 
        Arrays.sort(arr); 
        // Auxiliary array to store output 
        int op[] = new int[n]; 
        // calculating the middle index 
        int mid = (n-1)/2; 
        // storing the minimum element in the middle 
        // i is index for output array and j is for 
        // input array. 
        int j = 1, i = 1; 
        op[mid] = arr[0]; 
        for (i = 1; i <= mid; i++) 
        { 
            op[mid+i] = arr[j++]; 
            op[mid-i] = arr[j++]; 
        } 
        // adjustment for when no. of elements is even 
        if (n%2 == 0) 
        {
            op[mid+i] = arr[j]; 
        }
        // Printing the pendulum arrangement 
        System.out.println("Pendulum arrangement:"); 
        for (i = 0 ; i < n; i++) 
        {
            System.out.print(op[i] + " "); 
        }
        System.out.println(); 
    } 

    public static void main(String[] args)  //main method
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list of integers to be sorted");
        int arr[] = new int[5];
        for(int i=0; i<5;i++)
        {
            arr[i] = input.nextInt();
        }
        Arrange(arr, arr.length); 
    } //end of main method
} //end of class

/*
Enter list of integers to be sorted
1
2
3
4
5
Pendulum arrangement:
5 3 1 2 4 

Enter list of integers to be sorted
11
12
31
14
5
Pendulum arrangement:
31 12 5 11 14 

Enter list of integers to be sorted
18
76
34
25
77
Pendulum arrangement:
77 34 18 25 76 

 */