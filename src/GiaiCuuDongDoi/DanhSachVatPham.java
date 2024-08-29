package GiaiCuuDongDoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {
    private List<VatPham> arr;

    public DanhSachVatPham(){
        this.arr = new ArrayList<>();
    }

    public void nhapThongTin(){
        System.out.println("Câu 1:");

        VatPham chiecBuaThan = new ChiecBuaThan();
        chiecBuaThan.nhap();
        this.arr.add(chiecBuaThan);

        VatPham baoTaySamSet = new BaoTaySamSet();
        baoTaySamSet.nhap();
        this.arr.add(baoTaySamSet);

        VatPham honDaKichNo = new HonDaKichNo();
        honDaKichNo.nhap();
        this.arr.add(honDaKichNo);

        CayRiuPhepThuat cayRiuPhepThuat = new CayRiuPhepThuat();
        cayRiuPhepThuat.nhap();
        this.arr.add(cayRiuPhepThuat);

        CayGayChienThan cayGayChienThan = new CayGayChienThan();
        cayGayChienThan.nhap();
        this.arr.add(cayGayChienThan);
    }

    public void xuat(){
        System.out.println("Câu 2:");
        for (VatPham v : this.arr){
            v.xuatThongTin();
        }
    }

    public float tinhXuVangLonNhat(){
        float maxXu = 0.0f;
        for (VatPham v : this.arr){
            maxXu = Math.max(maxXu, v.tinhSoXuVang());
        }
        return maxXu;
    }

    public void cau3(){
        System.out.println("Câu 3: Vật phẩm cần tốn nhiều xu vàng nhất:");
        float maxXuVang = tinhXuVangLonNhat();
        for (VatPham v : this.arr){
            if (v.tinhSoXuVang() == maxXuVang){
                v.xuatThongTin();
            }
        }
    }

    public float tongXuVangCanThiet(){
        float tongXu = 0f;
        for (VatPham v : this.arr){
            tongXu += v.tinhSoXuVang();
        }
        return tongXu;
    }
    public void cau4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Câu 4:");
        System.out.print("Nhập số xu vàng mà Spon thu được: ");
        float soXuVang = sc.nextFloat();

        if (soXuVang >= tongXuVangCanThiet()){
            System.out.println("Spon giải cứu đồng đội thành công!");
        }
        else {
            System.out.println("Spon giải cứu thất bại!");
        }
    }
}
