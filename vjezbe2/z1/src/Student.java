public class Student extends Osoba{
    private String brojIndexa;

    public Student(String ime,String prezime,String brojIndexa){
        super(ime,prezime);
        this.brojIndexa=brojIndexa;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    @Override
    public void pozdrav(){
        super.pozdrav();
        System.out.println("Pozdrav ja sam student " + super.getIme() + " "+ super.getPrezime() + " s brojem indeksa " + this.brojIndexa );
    }
}
