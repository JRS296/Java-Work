import java.util.Scanner;

public class SeriesPower {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of x : ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of n : ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int product = 1;
            int multiplier = 1;
            for (int j = 0; j < (2 * i + 1); j++, multiplier *= -1) {
                product *= (x * multiplier);
            }
            sum += product;
        }
        scanner.close();
        System.out.println("Result of the series is " + sum);
    }

}