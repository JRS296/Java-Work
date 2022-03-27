public class FunctionX {

    public static void main(String[] args) {
        for (float x = -10; x <= 10; x = x + 2) {
            float numerator = (float) (x * x + 1.5 * x + 5);
            float denominator = x - 3;
            float result = numerator / denominator;
            System.out.println("For x = " + x + ", result = " + result);
        }
    }

}