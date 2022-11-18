package com.vti.backend.service;

import com.vti.backend.repository.CarRepository;
import com.vti.entity.Car;

import java.sql.SQLException;
import java.util.List;

public class CarService implements ICarService{
    CarRepository repository = new CarRepository();

    @Override
    public List<Car> getAllCar() throws SQLException {
        return repository.getAllCar();
    }

    @Override
    public void addNewCar(Car car) throws SQLException {
        repository.addNewCar(car);
    }
}
