import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter edge A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter edge B: ");
        double b = scanner.nextDouble();
        System.out.println("Enter edge C: ");
        double c = scanner.nextDouble();
        try {
            if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) {
                throw new IllegalTriangleException("not valid!");
            } else {
                throw new IllegalTriangleException("This is a triangle!");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
