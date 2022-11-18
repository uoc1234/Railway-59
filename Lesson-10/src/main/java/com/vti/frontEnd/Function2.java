package com.vti.frontEnd;

import com.vti.backend.controller.CarController;
import com.vti.entity.Car;
import com.vti.entity.Maker;
import com.vti.utils.ScannerUtils;

import java.sql.SQLException;
import java.util.List;

public class Function2 {
    CarController controller = new CarController();

    public void getAllCar() throws SQLException {
        List<Car> cars = controller.getAllCar();

        String leftAlignFormat = "| %-3s| %-15s | %-15s | %-17s | %-15s | %-15s |%n";
        System.out.format("+----+-----------------+-----------------+--------------------+-----------------+-----------------+%n");
        System.out.format("| id |      Maker      |      model      |        Date        |      color      |       note      |%n");
        System.out.format("+----+-----------------+-----------------+--------------------+-----------------+-----------------+%n");
        for (Car car : cars) {
            System.out.format(leftAlignFormat, car.getCarID(), car.getMaker(), car.getModel(), car.getDate(), car.getColor(), car.getNote());
        }
        System.out.format("+----+-----------------+-----------------+--------------------+-----------------+-----------------+%n");

    }

    public void addNewCar() throws SQLException {
        System.out.println("Mời bạn chọn hãng sản xuất:");
        System.out.println("1. HONDA");
        System.out.println("2. TOYOTA");
        System.out.println("3. NISSAN");
        Maker maker;
        int chose = ScannerUtils.inputIntPositive();
        switch (chose) {
            case 1:
                maker = Maker.HONDA;
                break;
            case 2:
                maker = Maker.TOYOTA;
                break;
            default:
                maker = Maker.NISSAN;
                break;
        }

        System.out.println("Mời bạn nhập model: ");
        String model = ScannerUtils.inputString();

        System.out.println("Mời bạn nhập ngày sản xuất: ");
        String year = ScannerUtils.inputString();

        System.out.println("Mời bạn nhập màu sắc của xe: ");
        String color = ScannerUtils.inputString();

        System.out.println("Mời bạn nhập ghi chú: ");
        String note = ScannerUtils.inputString();

        Car car = new Car();
        car.setMaker(maker);
        car.setModel(model);
        car.setDate(year);
        car.setColor(color);
        car.setNote(note);

        controller.addNewCar(car);
    }

}
