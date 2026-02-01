import java.util.ArrayList;

public class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private ArrayList<Predmet> predmeti;
    private static int brojStudenata;

    public Student(String ime,String prezime,String brojIndeksa){
        this.ime=ime;
        this.prezime=prezime;
        this.brojIndeksa=brojIndeksa;
        brojStudenata++;
        this.predmeti=new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public static int getBrojStudenata(){
        return brojStudenata;
    }

    public void dodajPredmet(Predmet predmet){
        this.predmeti.add(predmet);
    }

    public double izracunajProsjek(){
        if(this.predmeti.isEmpty()){
            return 0.0;
        }
        int suma=0;
        for(Predmet p:predmeti){
            suma+=p.getOcjena();
        }
        return (double) suma/predmeti.size();
    }

    @Override
    public String toString(){
     return String.format("Student %s %s ima prosjek ocjena %.2f",this.ime,this.prezime,this.izracunajProsjek());
    }
}
