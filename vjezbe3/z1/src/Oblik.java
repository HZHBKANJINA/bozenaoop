public abstract class Oblik {
    public abstract double izracunajPovrsinu();
    public abstract double izracunajOpseg();

    public void printInfo(){
        System.out.println("Povrsina iznosi: " + izracunajPovrsinu());
        System.out.println("Opseg iznosi: " + izracunajOpseg());
    }

    public static void compareAreas(Oblik oblik1, Oblik oblik2){
        double povrsina1 = oblik1.izracunajPovrsinu();
        double povrsina2 = oblik2.izracunajPovrsinu();

        if (povrsina1 > povrsina2){
            System.out.println("Povrsina prvog oblika je veca");
        }else if(povrsina2 > povrsina1){
            System.out.println("Povrsina drugog oblika je veca");
        }else{
            System.out.println("Povrsine su jednake!");
        }
    }
}
