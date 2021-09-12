import java.util.ArrayList;
import java.util.Scanner;

public class TongDienTich {
    public static void main(String[] args) {

        int soLuongManhDat;
        String loaiManhDat;
        int giaDat;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter so luong manh dat:");
        soLuongManhDat = sc.nextInt();
        System.out.println("Enter giá đất ( /m2): ");
        giaDat = sc.nextInt();
        int sumPricePerEachOne = 0;
        int sumPrice = 0;

        ArrayList<DanhSachManhDat> dsachManhDat = new ArrayList<>();
        for (int i = 0; i < soLuongManhDat; i++) {
            sc = new Scanner(System.in);
            System.out.println("Hình (hcn, hv, ht, htg ) : ");
            loaiManhDat = sc.nextLine();

            if (loaiManhDat.equals("hcn")){
                HinhChuNhat new_HCN = new HinhChuNhat();
                new_HCN.inputHCN();
                dsachManhDat.add(new_HCN);
                sumPricePerEachOne = new_HCN.tongTien(giaDat);
                sumPrice += sumPricePerEachOne;
            }else if(loaiManhDat.equals("hv")){
                HinhVuong new_HV = new HinhVuong();
                new_HV.inputHV();
                dsachManhDat.add(new_HV);
                sumPricePerEachOne = new_HV.tongTien(giaDat);
                sumPrice += sumPricePerEachOne;
            }else if(loaiManhDat.equals("ht")){
                HinhTron new_HT = new HinhTron();
                new_HT.inputHT();
                dsachManhDat.add(new_HT);
                sumPricePerEachOne = new_HT.tongTien(giaDat);
                sumPrice += sumPricePerEachOne;
            }else{
                HinhTamGiac new_HTG = new HinhTamGiac();
                new_HTG.inputHTG();
                dsachManhDat.add(new_HTG);
                sumPricePerEachOne = new_HTG.tongTien(giaDat);
                sumPrice += sumPricePerEachOne;
            }
        }

        //Xuất thông tin mảnh đất
        for (int i = 0; i < dsachManhDat.size(); i++) {
            System.out.println("Hình thứ " + (i + 1));
            System.out.println(dsachManhDat.get(i).toString());
        }
        // Tong tiền để mua tất cả các mảnh đất
        System.out.println(sumPrice);
    }
}
