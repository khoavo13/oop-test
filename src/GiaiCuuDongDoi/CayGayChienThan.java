package GiaiCuuDongDoi;

import java.util.Scanner;

public class CayGayChienThan extends VatPham{
    @Override
    public void xuatThongTin(){
        System.out.print("Cây gậy chiến thần (");
        super.xuatThongTin();
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("################################");
        System.out.println("Nhập thông tin cây gậy chiến thần:");
        System.out.print("Nhập chỉ số sức mạnh: ");
        this.setChiSoSucManh(sc.nextInt());
        System.out.print("Nhập hệ số sức mạnh: ");
        this.setHeSoSucManh(sc.nextFloat());
        System.out.print("Nhập số vàng quy đổi trên 1 sức công phá: ");
        this.setSoVangQuyDoi(sc.nextInt());
    }
}
