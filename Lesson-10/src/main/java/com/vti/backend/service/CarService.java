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

    @Override
    public Car findById(int carId) throws SQLException {
        return repository.findById(carId);
    }

    @Override
    public void deleteById(int carId) throws SQLException {
        repository.deleteById(carId);
    }

    @Override
    public void update(int carId, String color, String note) throws SQLException {
        repository.updateCar(carId, color, note);
    }

    @Override
    public List<Car> demoStoreProcedure() throws SQLException {
        return repository.demoStoreProcedure();
    }
}
