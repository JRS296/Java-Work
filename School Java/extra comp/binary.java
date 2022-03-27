import java.util.Scanner;
class binary
{
    public static void main()
    { 
        int num[] = {1,2,4,5,6,7,8,9,10,11,13,14,16,17,19,20,22,23,25,26,27,29,32,34,37,42 };
        int j, k, pos = 0;
        int found = 0;
        for (j=0 ; j<26-1; j++)
        {
            for (k=0 ; k<15-j-1 ; k++)
            {
                if (num[k] > num[k+1])
                {
                    int temp = num[k];
                    num [k] = num[k+1];
                    num [k+1] = temp;
                }
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to initialize binary search");
        int val = input.nextInt();
        int start = 0, last = 25 , middle;
        while (start <= last)
        {
            middle = (start + last)/2;
            if (val == num[middle])
            {
                found = 1;
                pos = middle;
                break;
            }
            else if( val > num[middle])
            {
                start = middle + 1;
            }
            else if( val < num[middle])
            {
                last = middle - 1;
            }
        }
        System.out.println("Output");
        System.out.println("\nThe sorted array is :");
        for(j=0 ; j<26; j++)
        {
            System.out.print(num[j]+" ");
        }
        System.out.println();
        if (found == 1)
        {
            System.out.println("Number found, Search Successful");
            System.out.println("Value : "+ val);
            System.out.println("Index : "+ pos);
        }
        else
        {
            System.out.println(val+" not found in the list, Search unsuccessful");
        }
        System.out.println();
    }
}
        
    
