public class Student extends Osoba{
    private String brojIndeksa;

    public Student(String ime,String prezime,String brojIndeksa){
        super(ime,prezime);
        this.brojIndeksa=brojIndeksa;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    @Override
    public void pozdrav(){
        System.out.println("Pozdrav ja sam student "+super.getIme()+" "+super.getPrezime()+" sa brojem indeksa" +this.brojIndeksa);
    }
}
