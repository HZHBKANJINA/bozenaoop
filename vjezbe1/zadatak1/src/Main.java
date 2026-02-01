public class Main {
    public static void main(String[] args) {
        Predmet programiranje1=new Predmet("Programiranje 1",3);
        Predmet matematika1=new Predmet("Matematika 1",4);
        Predmet umjetna=new Predmet("Umjetna inteligencija",5);

        Student s1=new Student("Božena","Copić Bačelić","13483");

        s1.dodajPredmet(programiranje1);
        s1.dodajPredmet(matematika1);
        s1.dodajPredmet(umjetna);

        System.out.println(s1);
        System.out.println("Ukupan broj dodanih studenata je: " +Student.getBrojStudenata());
    }
}