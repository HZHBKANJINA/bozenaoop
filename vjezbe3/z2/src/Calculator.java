public class Calculator implements Addable,Subtractable{
    @Override
    public int add(int a, int b){
        return a+b;
    }

    @Override
    public int subtract(int a, int b){
        return a-b;
    }
}
