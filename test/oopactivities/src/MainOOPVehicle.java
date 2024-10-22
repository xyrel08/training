public class MainOOPVehicle {
    public static void main(String[] args) {
        OOPVehicle_Genio[] vehicles = new OOPVehicle_Genio[3];

        vehicles[0] = new Car("Red", "Toyota", 2020);
        vehicles[1] = new Truck("Blue", "Ford", 2018);
        vehicles[2] = new Motorcycle("Black", "Harley-Davidson", 2022);

        for (OOPVehicle_Genio vehicle : vehicles) {
            System.out.println("Color: " + vehicle.getColor());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Year: " + vehicle.getYear());
            vehicle.start();
            vehicle.stop();
            System.out.println();
        }
    }
}
