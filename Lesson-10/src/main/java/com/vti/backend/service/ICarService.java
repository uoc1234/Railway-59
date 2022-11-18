package com.vti.backend.service;

import com.vti.entity.Car;

import java.sql.SQLException;
import java.util.List;

public interface ICarService {
    List<Car> getAllCar() throws SQLException;

    void addNewCar(Car car) throws SQLException;

    Car findById(int carId) throws SQLException;

    void deleteById(int carId) throws SQLException;

    void update(int carId, String color, String note) throws SQLException;

    List<Car> demoStoreProcedure() throws SQLException;
}
