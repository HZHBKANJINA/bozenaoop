public class Ploca {
    private int brRedaka;
    private int brStupaca;
    private char[][] ploca;

    public Ploca(int brRedaka, int brStupaca) {
        this.brRedaka = brRedaka;
        this.brStupaca = brStupaca;
        this.ploca = new char[brRedaka][brStupaca];


        for (int i = 0; i < brRedaka; i++) {
            for (int j = 0; j < brStupaca; j++) {
                ploca[i][j] = '.';
            }
        }
    }

    public int getBrRedaka() {
        return brRedaka;
    }

    public int getBrStupaca() {
        return brStupaca;
    }

    public char getZeton(int redak, int stupac) {
        return ploca[redak][stupac];
    }

    public void ubaciZeton(int stupac, char zeton) {
        for (int i = brRedaka - 1; i >= 0; i--) {
            if (ploca[i][stupac] == ' ') {
                ploca[i][stupac] = zeton;
                return;
            }
        }
    }

    @Override
    public String toString() {
        String ispis = "";
        for (int i = 0; i < brRedaka; i++) {
            for (int j = 0; j < brStupaca; j++) {
                char trenutni = ploca[i][j];


                if (trenutni == ' ') {
                    ispis += ". ";
                } else {
                    ispis += trenutni + " ";
                }
            }
            ispis += "\n";
        }
        return ispis;
    }

}