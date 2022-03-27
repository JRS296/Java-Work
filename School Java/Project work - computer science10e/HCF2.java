import java.util.Scanner;

public class HCF2 {

    static int findHCF(int x, int y) {
        int greater;
        int lesser;
        if (x > y) {
            greater = x;
            lesser = y;
        }
        else {
            greater = y;
            lesser = 
        }
        while (greater % lesser != 0) {
            int remainder = greater % lesser;
            greater = lesser;
            lesser = remainder;
        }
        return lesser;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = scanner.nextInt();
        System.out.print("Enter second number : ");
        int y = scanner.nextInt();
        int hcf = findHCF(x, y);
        System.out.println("The HCF of " + x + " and " + y + " is " + hcf);
        scanner.close();
    }

}