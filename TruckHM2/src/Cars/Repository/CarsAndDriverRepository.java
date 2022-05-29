package Cars.Repository;
import Cars.Model.Cars;
import Cars.Model.Drivers;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class CarsAndDriverRepository {

    private final List<Cars> carsList;
    private final List<Drivers> driverList;


    public CarsAndDriverRepository() {
        Gson gson = new Gson();
        String fileCars = "Resource/car.json";
        String fileDrivers = "Resource/driver.json";
        JsonReader jsonReader = null;
        JsonReader jsonReaderDriver = null;
        try {
            jsonReader = new JsonReader(new FileReader(fileCars));
            jsonReaderDriver = new JsonReader(new FileReader(fileDrivers));

        } catch (FileNotFoundException e) {
            System.out.println(fileCars + " Not founded in directory!!!");
        }
        Cars[] carsArray = gson.fromJson(jsonReader, Cars[].class);
        carsList = Arrays.asList(carsArray);
        System.out.println("Test cars:" + carsList);


        Drivers[] driverArray = gson.fromJson(jsonReaderDriver, Drivers[].class);
        driverList = Arrays.asList(driverArray);
        System.out.println("Test drivers:" + driverList);

    }

    public List<Cars> getCarsList() {
        return carsList;
    }

    public List<Drivers> getDriverList() {
        return driverList;
    }
}
