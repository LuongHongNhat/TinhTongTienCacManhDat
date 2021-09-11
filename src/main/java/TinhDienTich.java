import java.util.ArrayList;
import java.util.Scanner;

public class TinhDienTich {
    public static void main(String[] args) {

        int soLuongManhDat;
        String loaiManhDat;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter so luong manh dat:");
        soLuongManhDat = sc.nextInt();
        // chỗ này cho nhập số lượng hành khách vào
        ArrayList<HinhChuNhat> dsachManhDat = new ArrayList<>();
        for (int i = 0; i < soLuongManhDat; i++) {
            sc = new Scanner(System.in);
            System.out.println("Hình (hcn, hv, ht, htg ) : ");
            loaiManhDat = sc.nextLine();

            if (loaiManhDat.equals("hcn")){
                HinhChuNhat new_HCN = new HinhChuNhat();
                new_HCN.inputHCN();
                dsachManhDat.add(new_HCN);
            }else if(loaiManhDat.equals("hv")){
                HinhVuong new_HV = new HinhVuong();
                new_HV.inputHV();
                dsachManhDat.add(new_HV);
            }else if(loaiManhDat.equals("ht")){
                HinhTron new_HT = new HinhTron();
                new_HT.inputHT();
                dsachManhDat.add(new_HT);
            }else{
                HinhTamGiac new_HTG = new HinhTamGiac();
                new_HTG.inputHTG();
                dsachManhDat.add(new_HTG);
            }

        }

        for (int i = 0; i < dsachManhDat.size(); i++) {
            System.out.println("Hình thứ " + (i + 1));
            System.out.println(dsachManhDat.get(i).toString());
        }
    }
}
