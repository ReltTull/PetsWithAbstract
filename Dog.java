public class Dog extends Pet implements Comparable<Pet>{
    String tailState;
//    int distance;


    @Override
    void reaction() {
        voice();
        dogReaction();
    }

    public Dog(int disToHuman) {
        distance = disToHuman;
    }

    @Override
    void voice() {
        System.out.println("Waf");
    }
    void dogReaction() {
        tailState = "wagging";
        distance -= 5;
    }

    @Override
    void getInfo() {
        System.out.println("Dog, " + distance + ", " + tailState);
    }
}
