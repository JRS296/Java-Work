//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
//Computer Science Project - Question 6(Program to check if a matrix is a scalar matrix or not) 
import java.io.*; 
import java.util.Scanner;
class scalar//initialization of class
{ 
    static boolean isScalar(int mat[][],int N) 
    { 
        // Check all elements 
        // except main diagonal are 
        // zero or not. 
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
                if ((i != j) 
                  && (mat[i][j] != 0)) 
                    return false; 
        // Check all diagonal elements 
        // are same or not. 
        for (int i = 0; i < N - 1; i++) 
            if (mat[i][i] != mat[i + 1][i + 1]) 
                return false; 
        return true; 
    }  
    public static void main(String args[])//main method 
    { 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of matrix");
        int N = in.nextInt();//nputs size of matrix
        int mat[][] = new int[N][N];//initialization of array
        System.out.println("Enter elements of Matrix to check if Scalar or not");
        for (int i = 0; i < N; i++) 
            {
             for (int j = 0; j < N; j++) 
             {
                 mat[i][j] = in.nextInt();
                }
        }
        // Function call 
        if (isScalar(mat,N) )
        {
            System.out.println("The Matrix:");
            for (int i = 0; i < N; i++) 
                 {
                 for (int j = 0; j < N; j++) 
                 {
                     System.out.print(mat[i][j]+"  ");
                 }
                 System.out.println();
            }
            System.out.println("It is a scalar matrix");
        }
        else
        {
            System.out.println("The Matrix:");
            for (int i = 0; i < N; i++) 
                 {
                 for (int j = 0; j < N; j++) 
                 {
                     System.out.print(mat[i][j]+"  ");
                 }
                 System.out.println();
            }
            System.out.println("It is not a scalar matrix"); 
        }
    } //end of main method
} //end of class

/*
Enter size of matrix
4
Enter elements of Matrix to check if Scalar or not
4
0
0
0
0
4
0
0
0
0
4
0
0
0
0
4
The Matrix:
4  0  0  0  
0  4  0  0  
0  0  4  0  
0  0  0  4  
It is a scalar matrix

Enter size of matrix
4
Enter elements of Matrix to check if Scalar or not
1
3
5
7
9
0
8
6
4
2
3
4
6
7
8
9
The Matrix:
1 3 5 7
9 0 8 6
4 2 3 4
6 7 8 9
It is not a scalar matrix

*/
