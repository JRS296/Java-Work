import java.util.Scanner;

public class Distance {
    float distanc(float u, float time, float acc) {
        float distance = u * time + acc * time * time / 2;
        return distance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter velocity : ");
        float u = scanner.nextFloat();
        System.out.print("Enter acceleration : ");
        float acc = scanner.nextFloat();
        System.out.print("Enter time : ");
        float time = scanner.nextFloat();
        Distance d = new Distance();
        float dist = d.distanc(u, time, acc);
        System.out.println("\n\n");
        System.out.println("Velocity : " + u);
        System.out.println("Time : " + time);
        System.out.println("Acceleration : " + acc);
        System.out.println("Didtance : " + dist);
        scanner.close();

    }

}