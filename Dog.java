public class Dog extends Pet{
    String name;
    String tailState;
    int distance;

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

}
