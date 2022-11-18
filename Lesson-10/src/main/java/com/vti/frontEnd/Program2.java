package com.vti.frontEnd;

import com.vti.backend.repository.AccountRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) throws SQLException {
        int menu;
        Scanner scanner = new Scanner(System.in);
        Function2 function2 = new Function2();
        while (true) {
            System.out.println("------------------------- MENU -----------------------");
            System.out.println(" Mời chọn chức năng");
            System.out.println("1. Danh sách Car");
            System.out.println("2. Thêm mới Car");
            System.out.println("3. Tìm kiếm Car theo id");
            System.out.println("4. Update Car");
            System.out.println("5. Xoá Car theo Id");
            System.out.println("6. Danh sách ô tô được sản xuất trong năm");
            System.out.println("7. Thoát");

            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    function2.getAllCar();
                    break;
                case 2:
                    function2.addNewCar();
                    break;
                case 3:
                    function2.findById();
                    break;
                case 4:
                    function2.updateCar();
                    break;
                case 5:
                    function2.deleteById();
                    break;
                case 6:
                    function2.demoStoreProcedure();
                    break;
                case 7:
                    return;
            }
        }
    }
}
