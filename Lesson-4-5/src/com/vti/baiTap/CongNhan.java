package com.vti.baiTap;

public class CongNhan extends Canbo{
    private int capBac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, int capBac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.capBac = capBac;
    }

    public void setCapBac(int capBac) {
        if (capBac > 0 && capBac <= 10) {
            this.capBac = capBac;
        }
    }

    public int getCapBac() {
        return capBac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "capBac=" + capBac +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
