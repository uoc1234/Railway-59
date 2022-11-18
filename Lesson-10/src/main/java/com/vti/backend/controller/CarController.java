package com.vti.backend.controller;

import com.vti.backend.service.CarService;
import com.vti.entity.Car;

import java.sql.SQLException;
import java.util.List;

public class CarController {
    CarService service = new CarService();

    public List<Car> getAllCar() throws SQLException {
        return service.getAllCar();
    }

    public void addNewCar(Car car) throws SQLException {
        service.addNewCar(car);
    }
}
