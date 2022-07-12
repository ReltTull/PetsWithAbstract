public class Dog extends Pet{
    String name;

    @Override
    void voice() {
        dogVoice();
    }
    void dogVoice() {
        System.out.println("waf");
    }
}
