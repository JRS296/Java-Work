import java.util.Scanner;
class a
{
    void main()
    {
        Scanner in = new Scanner(System.in);
        int average;
        int i;int sum = 0;
        int M[] = new int[10];
        for (i = 0 ; i < 10 ; i++ )
        {
            M[i] = in.nextInt();
        }
        for (i = 0 ; i < 10 ; i++ )
        {
            sum += M[i];
            average = sum/10;
        }
    }
}
