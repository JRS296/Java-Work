//Jonathan Rufus Samuel
//11A

import java.util.Scanner;
public class GCD 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter two number");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt(); 
        int n2 = input.nextInt();
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