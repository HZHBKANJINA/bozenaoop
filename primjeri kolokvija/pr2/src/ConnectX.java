import java.util.Scanner;

public class ConnectX {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        int brRedaka = Integer.parseInt(args[0]);
        int brStupaca = Integer.parseInt(args[1]);

        Ploca p = new Ploca(brRedaka, brStupaca);

        Scanner sc = new Scanner(System.in);
        int brojacPoteza = 0;

        while (sc.hasNextInt()) {
            int stupac = sc.nextInt();

            char zeton;
            if (brojacPoteza % 2 == 0) {
                zeton = 'X';
            } else {
                zeton = 'O';
            }

            p.ubaciZeton(stupac, zeton);
            brojacPoteza++;

            for (int i = 0; i < p.getBrRedaka(); i++) {
                for (int j = 0; j < p.getBrStupaca(); j++) {
                    char trenutni = p.getZeton(i, j);

                    if (trenutni == ' ') {
                        System.out.print(". ");
                    } else {
                        System.out.print(trenutni + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("---");
        }
        sc.close();
    }
}