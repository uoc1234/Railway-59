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
        printListCar(cars);
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

    public void findById() throws SQLException {
        System.out.println("Mời bạn nhập CarId muốn tìm kiếm");
        int carId = ScannerUtils.inputIntPositive();
        Car car = controller.findById(carId);
        if (car == null){
            System.err.println("CarId không tồn tại!");
        } else {
            String leftAlignFormat = "| %-3s| %-15s | %-15s | %-17s | %-15s | %-15s |%n";
            System.out.format("+----+-----------------+-----------------+--------------------+-----------------+-----------------+%n");
            System.out.format("| id |      Maker      |      model      |        Date        |      color      |       note      |%n");
            System.out.format("+----+-----------------+-----------------+--------------------+-----------------+-----------------+%n");
            System.out.format(leftAlignFormat, car.getCarID(), car.getMaker(), car.getModel(), car.getDate(), car.getColor(), car.getNote());
            System.out.format("+----+-----------------+-----------------+--------------------+-----------------+-----------------+%n");
        }
    }

    public void deleteById() throws SQLException {
        System.out.println("Mời bạn nhập CarId muốn xoá");
        int carId = ScannerUtils.inputIntPositive();
        controller.deleteById(carId);
    }

    public void updateCar() throws SQLException {
        System.out.println("Mời bạn nhập CarId muốn chỉnh sửa");
        int carID = ScannerUtils.inputIntPositive();

        System.out.println("Mời bạn nhập vào màu xe muốn sửa");
        String color = ScannerUtils.inputString();

        System.out.println("Mời bạn nhập vào ghi chú muốn sửa: ");
        String note = ScannerUtils.inputString();

        controller.update(carID, color, note);
    }

    public void demoStoreProcedure() throws SQLException {
        List<Car> cars = controller.demoStoreProcedure();
        printListCar(cars);
    }

    private void printListCar(List<Car> cars){
        String leftAlignFormat = "| %-3s| %-15s | %-15s | %-17s | %-15s | %-15s |%n";
        System.out.format("+----+-----------------+-----------------+--------------------+-----------------+-----------------+%n");
        System.out.format("| id |      Maker      |      model      |        Date        |      color      |       note      |%n");
        System.out.format("+----+-----------------+-----------------+--------------------+-----------------+-----------------+%n");
        for (Car car : cars) {
            System.out.format(leftAlignFormat, car.getCarID(), car.getMaker(), car.getModel(), car.getDate(), car.getColor(), car.getNote());
        }
        System.out.format("+----+-----------------+-----------------+--------------------+-----------------+-----------------+%n");
    }
}
