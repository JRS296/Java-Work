public class CBV_CBR {

}

// Call by Value
class Tester {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("Before swapping, a = " + a + " and b = " + b);
        // Invoke the swap method
        swapFunction(a, b);
        System.out.println("\n**Now, Before and After swapping values will be same here**:");
        System.out.println("After swapping, a = " + a + " and b is " + b);
    }

    public static void swapFunction(int a, int b) {
        System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
        // Swap n1 with n2
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping(Inside), a = " + a + " b = " + b);
    }
}

// Call by Reference
class JavaTester {
    public static void main(String[] args) {
        IntWrapper a = new IntWrapper(30);
        IntWrapper b = new IntWrapper(45);
        System.out.println("Before swapping, a = " + a.a + " and b = " + b.a);
        // Invoke the swap method
        swapFunction(a, b);
        System.out.println("\n**Now, Before and After swapping values will be different here**:");
        System.out.println("After swapping, a = " + a.a + " and b is " + b.a);
    }

    public static void swapFunction(IntWrapper a, IntWrapper b) {
        System.out.println("Before swapping(Inside), a = " + a.a + " b = " + b.a);
        // Swap n1 with n2
        IntWrapper c = new IntWrapper(a.a);
        a.a = b.a;
        b.a = c.a;
        System.out.println("After swapping(Inside), a = " + a.a + " b = " + b.a);
    }
}

class IntWrapper {
    public int a;

    public IntWrapper(int a) {
        this.a = a;
    }
}