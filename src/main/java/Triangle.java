import java.util.Scanner;

public class Triangle extends Shape {
    public Triangle() {

    }

    private int positionX;
    private int positionY;
    private int positionZ;

    public Triangle(int positionX, int positionY, int positionZ) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionZ = positionZ;
    }

    public void inputTriangleInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter position X : ");
        this.positionX = input.nextInt();
        System.out.println("Enter position Y : ");
        this.positionY = input.nextInt();
        System.out.println("Enter position Z : ");
        this.positionZ = input.nextInt();
    }
    public String toString() {
        String triangle = "Position X: " + this.positionX + ", Position Y: " + this.positionY + ", Position Z: " + this.positionZ;
        return triangle;
    }

    public int totalPrice(int costPerM2) {
        int pricePerShape = 0;
        return pricePerShape;
    }
}
