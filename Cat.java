public class Cat extends Pet{
    String name;
    int distance;

    public Cat(int distanceToHuman) {
        distance = distanceToHuman;
    }

    @Override
    void voice() {
        catReaction();
    }

    void catReaction() {
        distance -= 3;
        System.out.println("Meow, " + distance);
    }
}
