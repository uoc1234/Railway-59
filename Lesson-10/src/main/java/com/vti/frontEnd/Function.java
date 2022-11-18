package com.vti.frontEnd;

import com.vti.backend.controller.AccountController;
import com.vti.entity.Account;
import com.vti.utils.ScannerUtils;

import java.sql.SQLException;
import java.util.List;

public class Function {
    AccountController controller = new AccountController();

    public void getById() throws SQLException {
        System.out.println("Mời bạn nhập vào ID cần tìm kiếm!");
        int id = ScannerUtils.inputIntPositive();
        Account account = controller.findById(id);
        if (account == null){
            System.out.println("Account không tồn tại!");
        } else {
            String leftAlignFormat = "| %-3s| %-20s | %-20s |%n";
            System.out.format("+----+----------------------+----------------------+%n");
            System.out.format("| id |      FullName        |        Email         |%n");
            System.out.format("+----+----------------------+----------------------+%n");
//            System.out.println(account);
            System.out.format(leftAlignFormat,account.getId(), account.getUsername(),account.getRole());
            System.out.format("+----+----------------------+----------------------+%n");
        }
    }

    public void getAllAccount() throws SQLException {
        List<Account> accounts = controller.getAllAccount();
        if (accounts.size() > 0){
            System.out.println(accounts);
        } else {
            System.out.println("Danh sách account rỗng");
        }
    }
    public void findByName() throws SQLException {
        System.out.println("Mời bạn nhập vào tên cần tìm kiếm!");
        String name = ScannerUtils.inputString();
        Account account = controller.findByName(name);
        if (account == null){
            System.out.println("Account không tồn tại!");
        } else {
            System.out.println(account);
        }
    }

    public void deleteById(){
        System.out.println("Mời bạn nhập vào ID cần tìm kiếm!");
        int id = ScannerUtils.inputIntPositive();
    }
}
