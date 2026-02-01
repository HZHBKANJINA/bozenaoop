
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(3, 9));
        System.out.println(calc.subtract(9, 3));

        StepCounter sc = new StepCounter();
        System.out.println(sc.add(100, 200));
        System.out.println(StepCounter.getTotalNumberOfSteps());
        System.out.println(sc.add(400, 500));
        System.out.println(StepCounter.getTotalNumberOfSteps());
    }
}