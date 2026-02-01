public class Predmet {
    private String ime;
    private int ocjena;

    public Predmet(String ime,int ocjena){
        this.ime=ime;
        this.ocjena=ocjena;
    }

    public String getIme() {
        return ime;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }
}
