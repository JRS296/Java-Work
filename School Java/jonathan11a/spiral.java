//Jonathan Rufus Samuel
//11A - 11120 (Pakenham Walsh)
// program to display array in spiral form
import java.util.*;
public class spiral
{
    public static void main(String args[])//main method begins
    {
        System.out.println("Enter The Value For N :");
        Scanner sc = new Scanner(System.in);//inputs value from user
        int n = sc.nextInt();
        int[][] spiral = new int[n][n];
        int value = 1;
        int minCol = 0;
        int maxCol = n-1;
        int minRow = 0;
        int maxRow = n-1;
        while (value <= n*n)
        {
            for (int i = minCol; i <= maxCol; i++)
            {
                spiral[minRow][i] = value;
                value++;
            }
            for (int i = minRow+1; i <= maxRow; i++) 
            { 
                spiral[i][maxCol] = value; 

                value++; 
            } 
            for (int i = maxCol-1; i >= minCol; i--)
            {
                spiral[maxRow][i] = value;

                value++;
            }
            for (int i = maxRow-1; i >= minRow+1; i--) 
            {
                spiral[i][minCol] = value;

                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }
        for (int i = 0; i < spiral.length; i++)
        {
            for (int j = 0; j < spiral.length; j++)
            {
                System.out.print(spiral[i][j]+ "\t");
            }
            System.out.println();
        }
    }//main method ends
}
/*
Enter The Value For N :
5
1	2	3	4	5	
16	17	18	19	6	
15	24	25	20	7	
14	23	22	21	8	
13	12	11	10	9	

Enter The Value For N :
8
1	2	3	4	5	6	7	8	
28	29	30	31	32	33	34	9	
27	48	49	50	51	52	35	10	
26	47	60	61	62	53	36	11	
25	46	59	64	63	54	37	12	
24	45	58	57	56	55	38	13	
23	44	43	42	41	40	39	14	
22	21	20	19	18	17	16	15	

 */