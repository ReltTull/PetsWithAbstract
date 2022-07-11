public class Cat extends Pet{
    String name;

    @Override
    void voice() {
        catVoice();
    }

    void catVoice() {
        System.out.println("Meow");
    }
}
