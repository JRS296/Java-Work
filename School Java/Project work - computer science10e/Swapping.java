import java.util.Scanner;

public class Swapping 
{
    int a;
    int b;

    static void swap(Swapping obj) {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Swapping obj = new Swapping();
        System.out.print("Enter first number : ");
        obj.a = scanner.nextInt();
        System.out.print("Enter second number : ");
        obj.b = scanner.nextInt();
        System.out.println("\n\n");
        System.out.println("Values before swapping");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
        swap(obj);
        System.out.println("------------------------------------------");
        System.out.println("Values after swapping");
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
        scanner.close();
    }

}