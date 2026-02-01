import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine("Petrol", 120);
        Engine e2 = new Engine("Diesel", 140);
        Engine e3 = new Engine("Electric", 200);

        Car car = new Car(e1, "ZG1111AA", "Opel Astra", 2019, 6.0, "Hatchback");
        Van van = new Van(e2, "ZG2222BB", "Renault Traffic", 2021, 6.0, 2.1, 9);
        Limo limo = new Limo(e3, "ZG3333CC", "Tesla Model X", 2023, 6.0, 5.5, true, true);

        System.out.println(car);
        System.out.println("Car price per month: " + car.getPricePerMonth() + "€");

        System.out.println(van);
        System.out.println("Van price per month: " + van.getPricePerMonth() + "€");

        System.out.println(limo);
        System.out.println("Limo price per month: " + limo.getPricePerMonth() + "€");

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(car);
        vehicleList.add(van);
        vehicleList.add(limo);

        System.out.println(Vehicle.newestVehicle(vehicleList));
    }
}