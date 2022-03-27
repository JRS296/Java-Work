import java.util.Scanner;

public class SeriesFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        float prevFactorial = 1;
        float numerator = 2;
        float denominator = 1;
        float sum = 0;
        for (int i = 0; i < n; i++, numerator++, denominator++) {
            float term = 1;
            term = prevFactorial * numerator / denominator;
            sum += term;
            prevFactorial = term;
        }
        System.out.println("Sum of the series is " + sum);
        scanner.close();
    }

}