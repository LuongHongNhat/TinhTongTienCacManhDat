import java.util.Scanner;

public class HinhTron extends DanhSachManhDat{
    private int x;
    private int banKinh;
    public HinhTron() {

    }

    public HinhTron(int x, int banKinh) {
        this.x = x;
        this.banKinh = banKinh;
    }

    public void inputHT() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter toa do x : ");
        this.x = input.nextInt();
        System.out.println("Enter ban kinh : ");
        this.banKinh = input.nextInt();
    }

    public String toString() {
        String ht = "Toa do X: " + this.x + ", Ban kinh: " + this.banKinh;
        return ht;
    }

    public int tongTien(int giaDat) {
        int tongTien = (int) ((Math.pow(this.banKinh, 2) / 4) * Math.PI);
        return tongTien;
    }
}
