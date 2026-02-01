public class Car extends Vehicle{
    private String carType;

    public Car(Engine engine,String regNo,String model,int year,double price,String carType){
        super(engine,regNo,model,year,price);
        this.carType=carType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString(){
        return "Car " + super.toString();
    }
}
