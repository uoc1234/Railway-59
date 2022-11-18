package com.vti.backend.repository;

import com.vti.entity.Car;
import com.vti.entity.Maker;
import com.vti.utils.JdbcUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarRepository {
    public List<Car> getAllCar() throws SQLException {
        String sql = "SELECT * FROM JDBC.Car;";
        Statement statement = JdbcUtils.getConect().createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Car> cars = new ArrayList<>();
        while (resultSet.next()){
            int carID = resultSet.getInt("CarID");
            String maker = resultSet.getString("Maker");
            String model = resultSet.getString("Model");
            String year = resultSet.getString("year");
            String color = resultSet.getString("color");
            String note = resultSet.getString("note");
            // Cách 1: dùng contructor -> gán giá trị
            Car car = new Car(carID, Maker.valueOf(maker), model, year, color, note);
            // Cách 2: setter -> gán giá trị
            cars.add(car);
        }
        return cars;
    }

    public void addNewCar(Car car) throws SQLException {
        String sql = "insert into Car (Maker,Model,Year,color,Note) values( ? , ? , ? , ? , ? );";
        PreparedStatement preparedStatement = JdbcUtils.getConect().prepareStatement(sql);
        preparedStatement.setString(1, car.getMaker().name());
        preparedStatement.setString(2, car.getModel());
        preparedStatement.setString(3, car.getDate());
        preparedStatement.setString(4, car.getColor());
        preparedStatement.setString(5, car.getNote());

        int rs = preparedStatement.executeUpdate();
        System.out.println("đã thêm mới " + rs + " bản ghi");
    }
}
