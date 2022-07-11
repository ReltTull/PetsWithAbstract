public class Cat extends Pet {
    String name;

    @Override
    void voice() {
        meow();
    }

    void meow() {
        System.out.println("meow");
    }
}
