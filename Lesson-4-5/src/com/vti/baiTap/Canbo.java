package com.vti.baiTap;

public class Canbo {
    public String hoTen;
    public int tuoi;
    public GioiTinh gioiTinh;
    public String diaChi;

    public Canbo() {
    }

    public Canbo(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Canbo{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}