public abstract class Potez {
    protected int indeksStupca;

    public Potez(int indeksStupca) {
        this.indeksStupca = indeksStupca;
    }

    public int getIndeksStupca() {
        return indeksStupca;
    }

    public abstract void igraj(Ploca ploca);
}