
public class Main {
    public static void main(String[] args) {
        Pravokutnik o1 = new Pravokutnik(2.5, 3.2);
        Krug o2 = new Krug(8.9);

        System.out.println("Pravokutnik: ");
        o1.printInfo();
        System.out.println("Krug");
        o2.printInfo();

        Oblik.compareAreas(o1, o2);
    }
}