package com.vti.baiTap;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Canbo> canBos = new ArrayList<>();

    public static void main(String[] args) {
        int menu;
        while (true) {
            System.out.println("------------------------- MENU -----------------------");
            System.out.println(" Mời chọn chức năng");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiện thị thông tin về danh sách các cán bộ");
            System.out.println("4. Nhập vào tên của cán bộ và delete cán bộ đó");
            System.out.println("5. Thoát");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    addCanbo();
                    System.out.println("Chức năng thêm mới cán bộ");
                    break;
                case 2:
                    sreachCanbo();
                    System.out.println("Chức năng Tìm kiếm");
                    break;
                case 3:
                    showAllCanbo();
                    System.out.println("Chức năng hiển thị danh sách cán bộ");
                    break;
                case 4:
                    deletaCanbo();
                    System.out.println("Xoá cán bộ");
                    break;
                case 5:
                    return;
            }
        }
    }
    private static void addCanbo() {
        System.out.println("Nhập vào họ và tên cán bộ: ");
        String hoVaTen = scanner.nextLine();

        System.out.println("Mời nhập vào tuổi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());

        System.out.println("Mời bạn chọn giới tính: ");
        GioiTinh gioitinh;
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1){
            gioitinh = GioiTinh.NAM;
        } else if (choose == 2) {
            gioitinh = GioiTinh.NU;
        } else {
            gioitinh = GioiTinh.KHAC;
        }

        System.out.println("Mời bạn nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        // Thêm đối tượng cán bộ:
        Canbo canbo = new Canbo(hoVaTen, tuoi, gioitinh, diaChi);
        canBos.add(canbo);
        System.out.println("Đã thêm mới cán bộ thành công!!!");
    }


    private static void deletaCanbo() {
        System.out.println("Mòi bạn nhập vào tên cán bộ muốn xoá: ");
        String name = scanner.nextLine();
        for (int i = 0; i < canBos.size(); i++) {
            if (canBos.get(i).hoTen.equals(name)){
                canBos.remove(canBos.get(i));
                System.out.println("Đã xoá thành công");
            }
        }
    }

    private static void showAllCanbo() {
        System.out.println("--------------------- Danh sách cán bọ ---------------------");
        System.out.println(canBos);
    }

    private static void sreachCanbo() {
        System.out.println("Mòi bạn nhập vào tên cán bộ muốn tìm kiếm: ");
        String name = scanner.nextLine();
        for (Canbo canbo : canBos) {
            if (canbo.hoTen.equals(name)){
                System.out.println(canbo);
            }
        }

    }


}
