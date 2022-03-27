//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 5(Program to sort boundary elements of an array)
import java.util.*;
class SortBoundary//initialization of class
{
    int A[][], B[], m, n; 
    static int sum=0;
    void input() //Function for taking the necessary inputs
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix : ");
        m=sc.nextInt();
        if(m<4 || m>10)//checks if input is within range
        {
            System.out.println("Invalid Range");
            System.exit(0);
        }
        else
        {
            A = new int[m][m];
            n = m*m;
            B = new int[n]; // 1-D Array to store Boundary Elements
            System.out.println("Enter the elements of the Matrix : ");
            for(int i=0;i<m;i++)//for loops to enter values into the array
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print("Enter a value : ");
                    A[i][j]=sc.nextInt();
                }
            }
        }
    }
    void convert()// The below function is used to store Boundary elements from array A[][] to array B[] 
    {
        int x=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i == 0 || j == 0 || i == m-1 || j == m-1) // Condition for boundary elements
                {
                    B[x] = A[i][j];
                    x++;
                    sum = sum + A[i][j]; // Finding sum of boundary elements
                }
            }
        }
    }
    void sortArray() //Function for sorting Boundary elements stored in array B[]
    {
        int c = 0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(B[i]<B[j]) // for ascending use B[i]>B[j]
                {
                    c = B[i];
                    B[i] = B[j];
                    B[j] = c;
                }
            }
        }
    }
    void fillSpiral()// Function fillSpiral is filling the boundary of 2-D array in spiral way from the elements of 1-D array
    {
        int R1=0, R2=m-1, C1=0, C2=m-1, x=0;
 
        for(int i=C1;i<=C2;i++) // accessing the top row
        {
            A[R1][i]=B[x++];
        }
        for(int i =R1+1;i<=R2;i++) // accessing the right column
        {
            A[i][C2]=B[x++];
        }
        for(int i =C2-1;i>=C1;i--) // accessing the bottom row
        {
            A[R2][i]=B[x++];
        }
        for(int i =R2-1;i>=R1+1;i--) // accessing the left column
        {
            A[i][C1]=B[x++];
        }
    }
    void printArray() //Function for printing the array A[][]
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])//main method
    {
        SortBoundary ob = new SortBoundary();
        ob.input();
        System.out.println("ORGINAL MATRIX:");
        ob.printArray(); //Printing the original array
        ob.convert(); //Storing Boundary elements to a 1-D array
        ob.sortArray(); //Sorting the 1-D array (i.e. Boundary Elements)
        ob.fillSpiral(); //Storing the sorted Boundary elements back to original 2-D array
        System.out.println("REARRANGED MATRIX:");
        ob.printArray(); //Printing the rearranged array
        System.out.println("The sum of boundary elements is = "+sum); //Printing the sum of boundary elements
    }//end of main method
}//end of class

/*
Enter the size of the square matrix : 4
Enter the elements of the Matrix : 
Enter a value : 9
Enter a value : 2
Enter a value : 1
Enter a value : 5
Enter a value : 8
Enter a value : 13
Enter a value : 8
Enter a value : 4
Enter a value : 15
Enter a value : 6
Enter a value : 3
Enter a value : 11
Enter a value : 7
Enter a value : 12
Enter a value : 23
Enter a value : 8
ORGINAL MATRIX:
9	2	1	5	
8	13	8	4	
15	6	3	11	
7	12	23	8	
REARRANGED MATRIX:
23	15	12	11	
1	13	8	9	
2	6	3	8	
4	5	7	8	
The sum of boundary elements is = 105


Enter the size of the square matrix : 4
Enter the elements of the Matrix : 
Enter a value : 8
Enter a value : 4
Enter a value : 6
Enter a value : 9
Enter a value : 3
Enter a value : 55
Enter a value : 4
Enter a value : 7
Enter a value : 5
Enter a value : 23
Enter a value : 8
Enter a value : 1
Enter a value : 2
Enter a value : 3
Enter a value : 34
Enter a value : 56
ORGINAL MATRIX:
8	4	6	9	
3	55	4	7	
5	23	8	1	
2	3	34	56	
REARRANGED MATRIX:
56	34	9	8	
1	55	4	7	
2	23	8	6	
3	3	4	5	
The sum of boundary elements is = 138

*/