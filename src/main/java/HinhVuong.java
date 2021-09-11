import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    private int dTrai;
    private int dTren;
    private int cRong;

    public HinhVuong(int dTrai, int dTren, int cRong) {
        this.dTrai = dTrai;
        this.dTren = dTren;
        this.cRong = cRong;
    }

    public HinhVuong() {

    }

    public void inputHV() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter diem trai : ");
        this.dTrai = input.nextInt();
        System.out.println("Enter diem tren : ");
        this.dTren = input.nextInt();
        System.out.println("Enter chieu rộng : ");
        this.cRong = input.nextInt();

    }
    public String toString() {
        String hcn = "Trai: " + this.dTrai + "\nTren: " + this.dTren +
                "\nChieu rộng: " + this.cRong;
        return hcn;
    }
}
