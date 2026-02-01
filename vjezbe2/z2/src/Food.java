import java.time.LocalDate;

public class Food extends Item{
    private double weight;
    private LocalDate bestBefore;

    public Food(String name, String sku, double netSalePrice, double weight, LocalDate bestBefore){
        super(name,sku,netSalePrice);
        this.weight=weight;
        this.bestBefore=bestBefore;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    @Override
    public double getVAT(){
        return 0.07;
    }
    @Override
    public String getItemType(){
        return "Food";
    }
    @Override
    public String toString(){
        return super.getSku() + " - " + super.getName() + ", best before " + this.bestBefore;
    }
}
