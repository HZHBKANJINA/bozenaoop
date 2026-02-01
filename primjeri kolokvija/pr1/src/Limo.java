public class Limo extends Vehicle{
    private double length;
    private boolean miniBar;
    private boolean sunRoof;

    public Limo(Engine engine,String regNo,String model,int year,double price,double length,boolean miniBar,boolean sunRoof){
        super(engine,regNo,model,year,price);
        this.length=length;
        this.miniBar=miniBar;
        this.sunRoof=sunRoof;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public boolean hasMiniBar(){
        return this.miniBar;
    }

    public void setMiniBar(boolean miniBar) {
        this.miniBar = miniBar;
    }
    public boolean hasSunRoof(){
        return this.sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    @Override
    public double getPricePerDay(){
        return super.getPrice()*24*1.5;
    }

    @Override
    public String toString() {
        return "Limo " + super.toString();
    }
}
