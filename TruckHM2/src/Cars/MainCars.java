package Cars;

import Cars.Model.Cars;
import Cars.Repository.CarsAndDriverRepository;
import Cars.Services.CarServices;

import java.util.List;
import java.util.Scanner;

public class MainCars {
    public static void main(String[] args) {
//        CarsAndDriverRepository carsAndDriverRepository = new CarsAndDriverRepository();
        CarServices carServices = new CarServices();
        carServices.tableCars();
        carServices.tableDrivers();
        carServices.menu();
        System.out.println("after");


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Choose truck by id : ");
//        int id = scanner.nextInt();

//        Cars cars = carServices.findById(id);
//
//        int num = scanner.nextInt();
//
//        if (num == 1) {
//            System.out.print(" write a driver name: ");
//            scanner.nextLine();
//            String newDriver = scanner.nextLine();
//            cars.setDriver_name(newDriver);
//        }
//
//
//    }

    }}