package com.vti.backend;

import com.vti.entity.Account;
import com.vti.utils.JdbcUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    public List<Account> getAllAccount() throws SQLException {
        String sql = "SELECT * FROM JDBC.Account";
        // Chuẩn bị sẵn 1 stament ( câu lệnh )
        Statement statement = JdbcUtils.getConect().createStatement();
        // execute câu lệnh SQL
        ResultSet resultSet = statement.executeQuery(sql);
        List<Account> accounts = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt("Id");
            String username = resultSet.getString("username");

            Account account = new Account();
            account.setId(id);
            account.setUsername(username);
            accounts.add(account);
        }
        System.out.println(accounts);

        return accounts;
    }

    public Account findById(){
        //code here

        return null;
    }
}
