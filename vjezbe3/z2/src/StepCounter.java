public class StepCounter implements Addable{
    private static int totalNumberOfSteps;

    public StepCounter(){
        totalNumberOfSteps=0;
    }

    @Override
    public int add(int a,int b){
        int zbroj=a+b;
        totalNumberOfSteps+=zbroj;
        return zbroj;
    }

    public static int getTotalNumberOfSteps(){
        return totalNumberOfSteps;
    }
}
