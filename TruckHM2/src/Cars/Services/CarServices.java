package Cars.Services;

import Cars.Exception.ChangeDriverException;
import Cars.Model.CarState;
import Cars.Model.Cars;
import Cars.Model.Drivers;
import Cars.Repository.CarsAndDriverRepository;

import java.util.List;
import java.util.Scanner;

public class CarServices {
    CarsAndDriverRepository carsAndDriverRepository = new CarsAndDriverRepository();
    List<Cars> carsList = carsAndDriverRepository.getCarsList();
    List<Drivers> driversList = carsAndDriverRepository.getDriverList();
    Cars car = new Cars();
    Drivers drivers = new Drivers();
    Scanner enterData = new Scanner(System.in);


    public String driverNameMethod() {
        return driversList.stream().filter(drivers -> drivers.getBus().equals(""))
                .findFirst().get().getName();

    }

    public void change(Cars car, String driverName) {

//        return carsList.stream().peek(System.out::println).filter(cars -> cars.getCarState().equals(CarState.BASE))
//                .findFirst().setDriver_name(driverName);
        carsAndDriverRepository.getCarsList().stream().filter(cars -> cars.getCarState().equals(CarState.BASE))
                .findFirst().orElseThrow().setDriver_name(driverName);
        carsAndDriverRepository.getDriverList().stream().filter(drivers -> drivers.getBus().equals(""))
        .findFirst().orElseThrow().setBus(car.getModel());

//        for (Cars cars : carsList) {
//             if (cars.getCarState().equals(CarState.BASE)) {
//                cars.setDriver_name(driverName);
//            }
//        }
    }

    public void changeDriver(Cars cars, Drivers drivers) {
        if (cars.getCarState().equals(CarState.BASE)) {
            cars.setDriver_name(drivers.getName());
            drivers.setBus(cars.getModel());
            System.out.println("Done... The truck " + cars.getModel() + "'s driver is: " + drivers.getName());
        }
        if (cars.getCarState().equals(CarState.ROUTE)) {
            throw new ChangeDriverException("The driver on the road. You cannot change this driver");
        }
        if (cars.getCarState().equals(CarState.REPAIR)) {
            throw new ChangeDriverException("The truck in repair. You cannot change the driver");
        }

    }
    public Cars findById(int id) {
        System.out.println("Choose driver by Id: ");
        return carsAndDriverRepository.getCarsList().stream()
                .peek(System.out::println)
                .filter(cars -> cars.getId() == 1)
                .findFirst().orElseThrow(IllegalStateException::new);
    }

    public void tableCars() {
        System.out.println();
        System.out.println("----------------------   TRUCKS  --------------------------  ");
        System.out.println("   #   |  Bus               |  Driver        |  State     |    ");
        System.out.println("-------+--------------------+----------------+-------------");
        for (Cars car : carsList) {
            System.out.printf("   %-4s|", car.getId());
            System.out.printf("  %-18s|", car.getModel());
            System.out.printf("  %-14s|", car.getDriver_name());
            System.out.printf("  %-10s|", car.getCarState());
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------   END  -----------------------------  ");
        System.out.println("test carlist " + carsList);
        System.out.println("test driver " + driversList);

    }

    public void tableDrivers() {
        System.out.println();
        System.out.println("--------------------   Drivers  -------------  ");
        System.out.println("   #   |  Driver            |  Bus           |");
        System.out.println("-------+--------------------+----------------+");
        for (Drivers drivers : carsAndDriverRepository.getDriverList()) {
            System.out.printf("   %-4s|", drivers.getIdDriver());
            System.out.printf("  %-18s|", drivers.getName());
            System.out.printf("  %-14s|", drivers.getBus());
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------   END  -----------------------  ");

    }


    public void menu() {

        while (true) {
            Scanner enterCommand = new Scanner(System.in);
            System.out.println("\n\t Choose command:");
            System.out.println("");

            System.out.println("" +
                    "        1 - > Change driver press \n" +
                    "        2 - > Send truck to road press \n" +
                    "        3 - > Send truck to repair press \n" +
                    "        4 - > See drivers information press \n" +
                    "        5 - > EXIT");
            int commnads = Integer.parseInt(enterCommand.nextLine());
            switch (commnads) {
                case 1:
//                    change(car, driverNameMethod());
                    changeDriver(car, drivers);
                    break;

                case 2:
                    System.out.println();
                    break;
                case 3:
                    driverNameMethod();
                    break;
                case 4:
                    tableCars();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Please Retype Right command !!!");
                    break;

            }
        }
    }



}
