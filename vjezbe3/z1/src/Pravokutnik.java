public class Pravokutnik extends Oblik{
    private double sirina;
    private double visina;

    public Pravokutnik(double sirina,double visina){
        this.sirina=sirina;
        this.visina=visina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    @Override
    public double izracunajPovrsinu(){
        return this.visina * this.sirina;
    }

    @Override
    public double izracunajOpseg(){
        return 2 * (this.visina + this.sirina);
    }
}
