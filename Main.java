import java.util.Scanner;

class Circle {
    private double radius;

    void setRadius(double r) throws Exception {
        if (r < 0) throw new Exception("Radius cannot be negative.");
        radius = r;
    }

    double getArea() { return Math.PI * radius * radius; }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter radius: ");
            Circle c = new Circle();
            c.setRadius(sc.nextDouble());
            System.out.println("Area: " + c.getArea());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
