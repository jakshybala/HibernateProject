package Cars.Model;

public class Cars {

    private int id;
    private String model;
    private String driver_name;
    private CarState carState;
    private CarType carType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public CarState getCarState() {
        return carState;
    }

    public void setCarState(CarState carState) {
        this.carState = carState;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }


//    @Override
//    public String toString() {
//        String str = String.format("\n   %-4s|", id );
//        String str1 = String.format("%-18s|" ,model);
//        String str2 = String.format("%-8s|" ,carState);
//        String str3 = String.format("%-10s|" ,carType);
//        String str4 = String.format("\n");
//
//        return "" + str + str1 + str2 + str3 + str4;
//    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", driver_name='" + driver_name + '\'' +
                ", carState=" + carState +
                ", carType=" + carType +
                '}';
    }


}
