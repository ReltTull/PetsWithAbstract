public class Dog extends Pet implements Comparable<Pet>{
    String tailState;
//    int distance;

    public Dog(int disToHuman) {
        distance = disToHuman;
    }

    @Override
    void voice() {
        dogReaction();
    }
    void dogReaction() {
        tailState = "wagging";
        distance -= 5;
        System.out.println("Waf, " + tailState + ", " + distance);
    }

    @Override
    void getInfo() {
        System.out.println("Dog, " + distance);
    }
}
