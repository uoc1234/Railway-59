package com.vti.backend.repository;

import com.vti.entity.Account;
import com.vti.entity.Role;
import com.vti.utils.JdbcUtils;

import java.sql.PreparedStatement;
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
        return accounts;
    }

    public Account findById(int id) throws SQLException {
        String sql = "Select * from JDBC.Account where id = ?";
        PreparedStatement preparedStatement = JdbcUtils.getConect().prepareStatement(sql);
        preparedStatement.setInt(1, id);
        // execute câu lệnh SQL
        ResultSet resultSet = preparedStatement.executeQuery();
        Account account = new Account();

        if (resultSet.next()) {
            account.setId(id);
            // Set giá trị user Name
            String username = resultSet.getString("username");
            account.setUsername(username);
            account.setFirstName(resultSet.getString("first_name"));
            account.setLastName(resultSet.getString("last_name"));
            String roleString = resultSet.getString("role");
            account.setRole(Role.valueOf(roleString));
        } else {
            return null;
        }
        return account;
    }

    public Account findByName(String name) throws SQLException {
        String sql = "Select * from JDBC.Account where username = ?";
        PreparedStatement preparedStatement = JdbcUtils.getConect().prepareStatement(sql);
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        Account account = new Account();
        if (resultSet.next()) {
            // Set giá trị user Name
            String username = resultSet.getString("username");
            account.setId(resultSet.getInt("id"));
            account.setUsername(username);
            account.setFirstName(resultSet.getString("first_name"));
            account.setLastName(resultSet.getString("last_name"));
            String roleString = resultSet.getString("role");
            account.setRole(Role.valueOf(roleString));
        } else {
            return null;
        }
        return account;
    }
}
