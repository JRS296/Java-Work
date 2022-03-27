//Jonathan Rufus Samuel
//11A - 11120 (Pakenham Walsh)
// program to find greatest common divisor(HCF) of two numbers using recursion
import java.util.Scanner;
public class GCD 
{
    public static void main(String[] args) //main method begins
    {
        System.out.println("Enter two number");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt(); //inputs value from user
        int n2 = input.nextInt();//inputs value from user
        int hcf = hcf(n1, n2);
        System.out.printf("G.C.D of "+n1+" and "+n2+" is "+hcf);
    }
    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}
/*
Enter two number
56
25
G.C.D of 56 and 25 is 1

Enter two number
256
44
G.C.D of 256 and 44 is 4
 */