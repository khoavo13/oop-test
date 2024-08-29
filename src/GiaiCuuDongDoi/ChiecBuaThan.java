package GiaiCuuDongDoi;

import java.util.Scanner;

public class ChiecBuaThan extends VatPham{
    @Override
    public void xuatThongTin(){
        System.out.print("Chiếc búa thần (");
        super.xuatThongTin();
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("################################");
        System.out.println("Nhập thông tin chiếc búa thần:");
        System.out.print("Nhập chỉ số sức mạnh: ");
        this.setChiSoSucManh(sc.nextInt());
        System.out.print("Nhập hệ số sức mạnh: ");
        this.setHeSoSucManh(sc.nextFloat());
        System.out.print("Nhập số vàng quy đổi trên 1 sức công phá: ");
        this.setSoVangQuyDoi(sc.nextInt());
    }
}
