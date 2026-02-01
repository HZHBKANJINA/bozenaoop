public class Van extends Vehicle{
    private double height;
    private int noOfSeats;

    public Van(Engine engine,String regNo,String model,int year,double price,double height,int noOfSeats){
        super(engine,regNo,model,year,price);
        this.height=height;
        this.noOfSeats=noOfSeats;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public double getPricePerDay(){
        return super.getPrice()*24*0.8;
    }

    @Override
    public String toString() {
        return "Van " + super.toString();
    }
}
