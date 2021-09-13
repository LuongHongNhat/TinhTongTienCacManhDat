import java.util.Scanner;

public class Circle extends Shape {
    private int x;
    private int banKinh;
    public Circle() {

    }

    public Circle(int x, int banKinh) {
        this.x = x;
        this.banKinh = banKinh;
    }

    public void inputCirleInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X : ");
        this.x = input.nextInt();
        System.out.println("Enter R : ");
        this.banKinh = input.nextInt();
    }

    public String toString() {
        String circle = "X: " + this.x + ", R: " + this.banKinh;
        return circle;
    }

    public int totalPrice(int costPerM2) {
        int pricePerShape = (int) ((Math.pow(this.banKinh, 2) / 4) * Math.PI) * costPerM2;
        return pricePerShape;
    }
}
