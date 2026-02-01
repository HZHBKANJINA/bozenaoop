public abstract class Igrac {
    private String ime;
    private char zeton;

    public Igrac(String ime, char zeton) {
        this.ime = ime;
        this.zeton = zeton;
    }

    public String getIme() {
        return ime;
    }

    public char getZeton() {
        return zeton;
    }

    @Override
    public String toString() {
        return ime;
    }

    public abstract Potez odluci();
}