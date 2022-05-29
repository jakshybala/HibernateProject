package Cars.Model;

public class Drivers {
    private int id;
    private String name, bus;


    public Drivers(int id, String name, String bus) {
        this.id = id;
        this.name = name;
        this.bus = bus;
    }

    public Drivers() {

    }

    public int getIdDriver() {
        return id;
    }

    public void setIdDriver(int idDriver) {
        this.id = idDriver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }
    @Override
    public String toString() {
        return "Drivers{" +
                "idDriver=" + id +
                ", name='" + name + '\'' +
                ", bus='" + bus + '\'' +
                '}';
    }
}
