public class PotezUbaci extends Potez {
    private char zeton;

    public PotezUbaci(int indeksStupca, char zeton) {
        super(indeksStupca);
        this.zeton = zeton;
    }

    public char getZeton() {
        return zeton;
    }

    @Override
    public void igraj(Ploca ploca) {
        ploca.ubaciZeton(this.indeksStupca, this.zeton);
    }

    @Override
    public String toString() {
        return "Potez: ubaci žeton " + zeton + " u stupac " + indeksStupca;
    }
}