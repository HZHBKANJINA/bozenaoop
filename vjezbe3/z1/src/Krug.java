public class Krug extends Oblik{
    private double radijus;

    public Krug(double radijus){
        this.radijus = radijus;
    }

    public double getRadijus() {
        return radijus;
    }

    public void setRadijus(double radijus) {
        this.radijus = radijus;
    }

    @Override
    public double izracunajPovrsinu(){
        return Math.PI * this.radijus * this.radijus;
    }

    @Override
    public double izracunajOpseg(){
        return 2 * this.radijus * Math.PI;
    }
}