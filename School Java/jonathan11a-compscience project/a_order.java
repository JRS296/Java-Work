//Jonathan Rufus Samuel
//11A - 11120 (Pakenham Walsh)
// program to arrange a string in alphabetic order
import java.util.Scanner;
class a_order
{
    public static void main()//main method begins
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");//inputs value from user
        String st = input.nextLine();
        int x = st.length();
        char ar[] = new char[x];
        for(int i = 0; i<x ; i++)
        {
            ar[i] = st.charAt(i);
        }
        //selsection sort
        
        int place,small; 
        char temp;
        
        for(int i=0 ; i<x-1; i++)
        {
            small = (ar[i]);
            place = i;
            for(int j=i+1 ; j<x; j++)
            {
                 if (ar[j] < small)
                 {
                     small = ar[j];
                     place = j;
                    }
            }
            temp = ar[i];
            ar[i] = ar[place];
            ar[place] = temp;
        }
        System.out.println("Output");
        System.out.println("\nThe word in alphabetic order :");
        for(int i=0 ; i<x; i++)
        {
            System.out.print(ar[i]+" ");
        }
    }//main method ends
}
/*
 Enter a word
Swimming
Output

The word in alphabetic order :
S g i i m m n w 

Enter a word
Thiruvananthapuram
Output

The word in alphabetic order :
T a a a a h h i m n n p r r t u u v 
 */