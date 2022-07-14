public class Cat extends Pet implements Comparable<Pet>{
//    int distance;

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

    @Override
    void getInfo() {
        System.out.println("Cat, " + distance);
    }
}
