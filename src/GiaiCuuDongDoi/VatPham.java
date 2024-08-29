package GiaiCuuDongDoi;

public abstract  class VatPham {
    protected int chiSoSucManh;
    protected float heSoSucManh;
    protected int soVangQuyDoi;

    public int getChiSoSucManh() {
        return chiSoSucManh;
    }

    public void setChiSoSucManh(int chiSoSucManh) {
        this.chiSoSucManh = chiSoSucManh;
    }

    public float getHeSoSucManh() {
        return heSoSucManh;
    }

    public void setHeSoSucManh(float heSoSucManh) {
        this.heSoSucManh = heSoSucManh;
    }

    public int getSoVangQuyDoi() {
        return soVangQuyDoi;
    }

    public void setSoVangQuyDoi(int soVangQuyDoi) {
        this.soVangQuyDoi = soVangQuyDoi;
    }
    public float tinhSucCongPha(){
        return this.chiSoSucManh * this.heSoSucManh;
    }
    public void xuatThongTin(){
        System.out.println("chỉ số sức mạnh: " + this.chiSoSucManh + ", hệ số sức mạnh: " + this.heSoSucManh + ", số vàng quy đổi trên 1 sức công phá: " + this.soVangQuyDoi
                + ", sức công phá: " + this.tinhSucCongPha() + ")");
    }

    public abstract  void nhap();
    public float tinhSoXuVang(){
        return this.chiSoSucManh * this.heSoSucManh * this.soVangQuyDoi;
    }
}
