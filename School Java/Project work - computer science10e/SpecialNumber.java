public class SpecialNumber {

    static int fact(int q) {
        int factorial = 1;
        for (int i = 1; i <= q; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += fact(digit);
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Special numbers from 10 to 200 are ");
        printNumbers(10, 200);
    }

}

