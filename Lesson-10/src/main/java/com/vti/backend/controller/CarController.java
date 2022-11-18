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

    public Car findById(int carId) throws SQLException {
        return service.findById(carId);
    }

    public void deleteById(int id) throws SQLException {
        service.deleteById(id);
    }

    public void update(int carId, String color, String note) throws SQLException {
        service.update(carId, color, note);
    }

    public List<Car> demoStoreProcedure() throws SQLException {
        return service.demoStoreProcedure();
    }
}
