package com.vti.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
    // Tạo 1 method chuyên dùng để conect tới My Sql
    public static Connection getConect(){
        // Những thông số để connect -> My SQL
        String url = "jdbc:mysql://localhost:3306/JDBC";
        String user = "root";
        // pass phụ thuộc mỗi máy khi setup my sql
        String pass = "Mothaiba123.";
        String driver = "com.mysql.cj.jdbc.Driver";
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            if (connection != null) {
                System.out.println("Thanh cong1");
            } else {
                System.out.println("That bai");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
