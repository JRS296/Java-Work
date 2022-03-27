import java.util.Scanner;

public class Finder {

    static int findMax(int x, int y) {
        if (x > y) {
            return x;
        } else if (y > x) {
            return y;
        } else {
            return 0;
        }
    }

    static int findMax(int x, int y, int z) {
        if (x == y) {
            if (x == z) {
                return 0;
            } else if (x > z) {
                return x;
            } else {
                return z;
            }
        } else if (x == z) {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        }
        if (x > y) {
            if (x > z) {
                return x;
            } else {
                return z;
            }
        }
        if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x : ");
        int x = scanner.nextInt();
        System.out.print("Enter y : ");
        int y = scanner.nextInt();
        System.out.print("Enter z : ");
        int z = scanner.nextInt();
        int maxOfTwo = findMax(x, y);
        if (maxOfTwo == 0) {
            System.out.println("x(" + x + ") and y(" + y + ") are equal");
        } else {
            System.out.println("Maximum of x(" + x + ") and y(" + y + ") is " + maxOfTwo);
        }
        int maxOfThree = findMax(x, y, z);
        if (maxOfThree == 0) {
            System.out.println("x(" + x + "), y(" + y + ") and z(" + z + ")are equal");
        } else {
            System.out.println("Maximum of x(" + x + "), y(" + y + ") and z(" + z + ") is " + maxOfThree);
        }
        scanner.close();
    }

}