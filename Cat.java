public class Cat extends Pet implements Comparable<Pet>{
//    int distance;

    public Cat(int distanceToHuman) {
        distance = distanceToHuman;
    }

    @Override
    void reaction() {
        voice();
        distance -= 3;
    }

    @Override
    void voice() {
        System.out.println("Meow");
    }

//    void catReaction() {
//
//
//    }

    @Override
    void getInfo() {
        System.out.println("Cat, " + distance);
    }
}
