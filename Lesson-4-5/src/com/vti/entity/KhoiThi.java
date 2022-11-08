package com.vti.entity;

public enum KhoiThi {
    A("Toan, Ly, Hoa", "A"),
    B("Toán, Hoá, Sinh", "B"),
    C("Văn, Sử, Địa", "C");

    public final String monHoc;
    public final String kyHieu;
    KhoiThi(String monHoc, String kyHieu) {
        this.monHoc = monHoc;
        this.kyHieu= kyHieu;
    }

    public String getMonHoc() {
        return monHoc;
    }
}
