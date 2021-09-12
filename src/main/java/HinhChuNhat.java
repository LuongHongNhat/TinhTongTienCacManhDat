import java.util.Scanner;

public class HinhChuNhat extends DanhSachManhDat{
    private int diemTrai;
    private int diemTren;
    private int chieuDai;
    private int chieuRong;
    public HinhChuNhat() {

    }

    public HinhChuNhat(int diemTrai, int diemTren, int chieuDai, int chieuRong) {
        this.diemTrai = diemTrai;
        this.diemTren = diemTren;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void inputHCN() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter diem trai : ");
        this.diemTrai = input.nextInt();
        System.out.println("Enter diem tren : ");
        this.diemTren = input.nextInt();
        System.out.println("Enter chieu dai : ");
        this.chieuDai = input.nextInt();
        System.out.println("Enter chieu rong : ");
        this.chieuRong = input.nextInt();

    }
    public String toString() {
        String hcn = "Trai: " + this.diemTrai + ", Tren: " + this.diemTren +
                ", Chieu dai: " + this.chieuDai + ", Chieu rong: " + this.chieuRong;
        return hcn;
    }

    public int tongTien(int giaDat) {
        int tongTien = (this.chieuDai * this.chieuRong) * giaDat;
        return tongTien;
    }
}
