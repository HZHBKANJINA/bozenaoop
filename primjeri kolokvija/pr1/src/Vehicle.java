import java.util.ArrayList;

public class Vehicle {
    private Engine engine;
    private String regNo;
    private String model;
    private int year;
    private double price;

    public Vehicle(Engine engine,String regNo,String model,int year,double price){
        this.engine=engine;
        this.regNo=regNo;
        this.model=model;
        this.year=year;
        this.price=price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPricePerDay(){
        return this.price*24;
    }

    public final double getPricePerMonth(){
        return getPricePerDay()*30;
    }

    public static Vehicle newestVehicle(ArrayList<Vehicle> vehicles){
        if(vehicles.isEmpty()) return null;
        Vehicle newest=vehicles.getFirst();
        for(Vehicle v:vehicles){
            if(v.year>newest.year){
                newest=v;
            }
        }
        return newest;
    }

    @Override
    public String toString(){
        return this.model + " " + this.year + " reg no: " + this.regNo;
    }
}
