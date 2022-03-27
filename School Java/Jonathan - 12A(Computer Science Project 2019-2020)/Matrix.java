//Name: Jonathan Rufus Samuel
//Roll no: 12120
//Class: 12 'A'
/*Computer Science Project - Question 15(Program to check for symmetry and to calculate sum of 
diagonals in a matrix)*/
import java.io.*; 
import java.util.Scanner;
class Matrix//initialization of class
{ 
    static int  MAX = 100; 
    // Fills transpose of mat[N][N] in tr[N][N] 
    static void transpose(int mat[][], int tr[][], int N) 
    { 
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
                tr[i][j] = mat[j][i]; 
    } 
    // Returns true if mat[N][N] is symmetric, else false 
    static boolean SymSum(int mat[][], int N) 
    { 
        int tr[][] = new int[N][MAX]; 
        transpose(mat, tr, N); 
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < N; j++) 
                if (mat[i][j] != tr[i][j]) 
                    return false; 
        return true; 
    } 

    public static void main (String[] args) //main method
    { 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number for order of matrix");
        int M = in.nextInt();
        int sumL = 0;
        int sumR = 0;
        if(M>2 && M<10)
        {
            int mat[][] = new int[M][M];
            for(int i=0 ; i<M;i++)
            {
                for(int j=0; j<M ; j++)
                {
                    System.out.println("Enter element at pos ("+i+","+j+")");
                    mat[i][j] = in.nextInt();
                }
            }
            System.out.println("ORGINAL MATRIX");
            for(int i=0 ; i<M;i++)
            {
                for(int j=0; j<M ; j++)
                {
                    System.out.print(mat[i][j]+"  ");
                    if(i==j)
                    {
                        sumL += mat[i][j];
                    }
                    else if (i == M-j-1)
                    {
                        sumR += mat[i][j];
                    }
                }
                System.out.println();
            }
            if (SymSum(mat, M)) 
            {
                System.out.println("It is symmetric"); 
                System.out.println("Sum of Left Diagonal = "+sumL);
                System.out.println("Sum of Right Diagonal = "+sumR);
            }
            else
            {
                System.out.println ("It is not symmetric"); 
                System.out.println("Sum of Left Diagonal = "+sumL);
                System.out.println("Sum of Right Diagonal = "+sumR);
            }
        } 
        else 
        {
            System.out.println("INVALID INPUT");
        }
    }//end of main method
} //end of class

/*
Enter number for order of matrix
3
Enter element at pos (0,0)
1
Enter element at pos (0,1)
2
Enter element at pos (0,2)
3
Enter element at pos (1,0)
2
Enter element at pos (1,1)
4
Enter element at pos (1,2)
5
Enter element at pos (2,0)
3
Enter element at pos (2,1)
5
Enter element at pos (2,2)
6
ORGINAL MATRIX
1  2  3  
2  4  5  
3  5  6  
It is symmetric
Sum of Left Diagonal = 11
Sum of Right Diagonal = 10

Enter number for order of matrix
4
Enter element at pos (0,0)
7
Enter element at pos (0,1)
8
Enter element at pos (0,2)
9
Enter element at pos (0,3)
2
Enter element at pos (1,0)
4
Enter element at pos (1,1)
5
Enter element at pos (1,2)
6
Enter element at pos (1,3)
3
Enter element at pos (2,0)
8
Enter element at pos (2,1)
5
Enter element at pos (2,2)
3
Enter element at pos (2,3)
1
Enter element at pos (3,0)
7
Enter element at pos (3,1)
6
Enter element at pos (3,2)
4
Enter element at pos (3,3)
2
ORGINAL MATRIX
7  8  9  2  
4  5  6  3  
8  5  3  1  
7  6  4  2  
It is not symmetric
Sum of Left Diagonal = 17
Sum of Right Diagonal = 20

 */