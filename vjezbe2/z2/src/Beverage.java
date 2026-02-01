public class Beverage extends Item{
    private double volume;

    public Beverage(String name,String sku,double netSalePrice,double volume){
        super(name, sku, netSalePrice);
        this.volume=volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String getItemType(){
        return "Beverage";
    }
}
