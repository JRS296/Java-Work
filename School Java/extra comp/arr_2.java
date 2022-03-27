import java.util.Scanner;
class arr_2
{
    public static void amin()
    {
        Scanner in = new Scanner(System.in);
        int ar[] = new int[20];
        for (int a = 0; a <20; a++)
        {
            System.out.println("Enter a number");
            ar[a] = in.nextInt();
        }
        int small,pos=0,large=0,sum=0;
        for (int f = 0; f <20; f++)
        {
            if (ar(f) > large)
              large = ar(f);
            if (ar(f) < small)
              small = ar(f);
            sum = sum+ar(f);
        }
        System.out.println("Largest number : "+ large);
        System.out.println("Smallest number : "+ small);
        System.out.println("Sum of numbers : "+sum);
    }
}
        