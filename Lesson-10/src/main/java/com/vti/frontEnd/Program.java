package com.vti.frontEnd;

import com.vti.backend.repository.AccountRepository;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws SQLException {
        int menu;
        Scanner scanner = new Scanner(System.in);
        AccountRepository repository = new AccountRepository();
        Function function = new Function();
        while (true) {
            System.out.println("------------------------- MENU -----------------------");
            System.out.println(" Mời chọn chức năng");
            System.out.println("1. Danh sách Account");
            System.out.println("2. Thêm mới account");
            System.out.println("3. Tìm kiếm Account theo id");
            System.out.println("4. Update account");
            System.out.println("5. Xoá Account theo Id");
            System.out.println("6. Thoát");

            menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    function.getAllAccount();
                    break;
                case 2:
                    function.findByName();
                    break;
                case 3:
                    function.getById();
                    break;
                case 4:
//                    deletaCanbo();
                    break;
                case 5:
                    // method here
                    break;
                case 6:
                    return;
            }
        }
    }
}
