public class OOPVehicle_Genio {
    private String color;
    private String model;
    private int year;

    public OOPVehicle_Genio(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Starting the vehicle.");
    }

    public void stop() {
        System.out.println("Stopping the vehicle.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

 class Car extends OOPVehicle_Genio {
    public Car(String color, String model, int year) {
        super(color, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting the car.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car.");
    }
}

 class Motorcycle extends OOPVehicle_Genio {
    public Motorcycle(String color, String model, int year) {
        super(color, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting the motorcycle.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the motorcycle.");
    }
}

 class Truck extends OOPVehicle_Genio {
    public Truck(String color, String model, int year) {
        super(color, model, year);
    }

    @Override
    public void start() {
        System.out.println("Starting the truck.");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the truck.");
    }
}