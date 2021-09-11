import java.util.Scanner;

public class HinhTamGiac extends HinhChuNhat{
    public HinhTamGiac() {

    }

    private int diemX;
    private int diemY;
    private int diemZ;

    public HinhTamGiac(int diemX, int diemY, int diemZ) {
        this.diemX = diemX;
        this.diemY = diemY;
        this.diemZ = diemZ;
    }

    public void inputHTG() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter diem X : ");
        this.diemX = input.nextInt();
        System.out.println("Enter diem Y : ");
        this.diemY = input.nextInt();
        System.out.println("Enter diem Z : ");
        this.diemZ = input.nextInt();
    }
    public String toString() {
        String htg = "Toa do X: " + this.diemX + "\nToa do Y: " + this.diemY + "\nToa do Z: " + this.diemZ;
        return htg;
    }
}
