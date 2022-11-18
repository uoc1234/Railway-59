package com.vti.backend.repository;

import com.vti.entity.Car;
import com.vti.entity.Maker;
import com.vti.utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
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
        JdbcUtils.closeConection();
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
        JdbcUtils.closeConection();
        System.out.println("đã thêm mới " + rs + " bản ghi");
    }

    public void updateCar(int carId, String color, String note) throws SQLException {
        String sql = "update Car set color = ? , note = ? where carID = ?;";
        PreparedStatement preparedStatement = JdbcUtils.getConect().prepareStatement(sql);
        preparedStatement.setString(1, color);
        preparedStatement.setString(2, note);
        preparedStatement.setInt(3, carId);

        int rs = preparedStatement.executeUpdate();
        JdbcUtils.closeConection();
        if (rs == 0){
            System.out.println("CarId ko tồn tại!");
        } else {
            System.out.println("đã update thành công " + rs + " bản ghi");
        }
    }
    public Car findById(int carId) throws SQLException {
        Car car = new Car();
        String sql = "SELECT * FROM JDBC.Car where CarID = ?;";
        PreparedStatement preparedStatement = JdbcUtils.getConect().prepareStatement(sql);
        preparedStatement.setInt(1, carId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String maker = resultSet.getString("Maker");
            String model = resultSet.getString("Model");
            String year = resultSet.getString("year");
            String color = resultSet.getString("color");
            String note = resultSet.getString("note");
            JdbcUtils.closeConection();
            // Cách 2: dùng setter để gán giá trị
            car.setCarID(carId);
            car.setMaker(Maker.valueOf(maker));
            car.setModel(model);
            car.setDate(year);
            car.setColor(color);
            car.setNote(note);
            return car;
        } else {
            return null;
        }
    }

    public void deleteById(int id) throws SQLException {
        Car car = findById(id);
        if (car == null) {
            System.err.println("CarId ko tồn tại!");
        } else {
            String sql = "delete from car where carId = ?";
            PreparedStatement preparedStatement = JdbcUtils.getConect().prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            JdbcUtils.closeConection();
            if (rs == 0) {
                System.err.println("Có lỗi xảy ra, ko xoá được!");
            } else {
                System.out.println("Bạn đã xoá thành công " + rs + " bản ghi!");
            }
        }
    }

    public List<Car> demoStoreProcedure() throws SQLException {
        String sql = "call demoStore();";
        CallableStatement callableStatement = JdbcUtils.getConect().prepareCall(sql);
        ResultSet resultSet = callableStatement.executeQuery();

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
        JdbcUtils.closeConection();
        return cars;
    }
}
