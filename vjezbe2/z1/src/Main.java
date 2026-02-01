public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivo", "Ivic", "R12234");
        Profesor profesor1 = new Profesor("Pero", "Peric", "programiranje");

        student1.pozdrav();
        profesor1.pozdrav();
    }
}