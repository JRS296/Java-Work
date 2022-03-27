//Jonathan Rufus Samuel
//11A

import java.util.Scanner;
public class Power 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base number");
        int base = input.nextInt(); 
        System.out.println("Enter the base number");
        int powerRaised = input.nextInt(); 
        int result = power(base, powerRaised);
        System.out.printf("%d^%d = %d", base, powerRaised, result);
    }
    public static int power(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * power(base, powerRaised - 1));
        else
            return 1;
    }
}
/*
Enter the base number
3
Enter the base number
4
3^4 = 81

Enter the base number
8
Enter the base number
6
8^6 = 262144
 */