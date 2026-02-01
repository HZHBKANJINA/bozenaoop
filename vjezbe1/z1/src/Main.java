public class Main {
    public static void main(String[] args) {
        Predmet OOP = new Predmet("Objektno orijentirano programiranje", 5);
        Predmet matematika = new Predmet("matematika 1", 3);
        Predmet programiranje = new Predmet("Programiranje 2", 5);



        Student student1 = new Student("Ivo", "Ivic", "R/12345");

        student1.dodajPredmet(OOP);
        student1.dodajPredmet(matematika);
        student1.dodajPredmet(programiranje);
        System.out.println(student1);
        System.out.println("Broj studenata: " + Student.getBrojStudenata());
    }
}