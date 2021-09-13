import java.util.Scanner;

public class Square extends Shape {
    private int dTrai;
    private int dTren;
    private int cRong;

    public Square(int dTrai, int dTren, int cRong) {
        this.dTrai = dTrai;
        this.dTren = dTren;
        this.cRong = cRong;
    }

    public Square() {

    }

    public void inputSquareInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter left position : ");
        this.dTrai = input.nextInt();
        System.out.println("Enter above position : ");
        this.dTren = input.nextInt();
        System.out.println("Enter width : ");
        this.cRong = input.nextInt();

    }
    public String toString() {
        String square = "Left position: " + this.dTrai + ", Above position: " + this.dTren +
                ", Width: " + this.cRong;
        return square;
    }

    public int totalPrice(int costPerM2) {
        int pricePerShape = (this.cRong * this.cRong) * costPerM2;
        return pricePerShape;
    }
}
