import java.util.Scanner;

public class Rectangle extends Shape {
    private int leftPosition;
    private int abovePosition;
    private int length;
    private int width;
    public Rectangle() {

    }

    public Rectangle(int leftPosition, int abovePosition, int length, int width) {
        this.leftPosition = leftPosition;
        this.abovePosition = abovePosition;
        this.length = length;
        this.width = width;
    }

    public void inputRectangleInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter left position : ");
        this.leftPosition = input.nextInt();
        System.out.println("Enter above position : ");
        this.abovePosition = input.nextInt();
        System.out.println("Enter length : ");
        this.length = input.nextInt();
        System.out.println("Enter width : ");
        this.width = input.nextInt();

    }
    public String toString() {
        String rectangle = "Left position: " + this.leftPosition + ", Above position: " + this.abovePosition +
                ", Length: " + this.length + ", Width: " + this.width;
        return rectangle;
    }

    public int totalPrice(int costPerM2) {
        int pricePerShape = (this.length * this.width) * costPerM2;
        return pricePerShape;
    }
}
