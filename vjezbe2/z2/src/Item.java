public class Item {
    private String name;
    private String sku;
    private double netSalePrice;

    public Item(String name,String sku,double netSalePrice){
        this.name=name;
        this.sku=sku;
        this.netSalePrice=netSalePrice;
    }

    public Item(String name,String sku){
        this(name,sku,0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getNetSalePrice() {
        return netSalePrice;
    }

    public void setNetSalePrice(double netSalePrice) {
        this.netSalePrice = netSalePrice;
    }

    public String getItemType(){
        return "";
    }
    public double getVAT(){
        return 0.17;
    }
    @Override
    public String toString(){
        return this.sku + "-" + this.name;
    }
    public double getPrice(int n){
        return n*this.netSalePrice*(1+getVAT());
    }
}
