public class Dog extends Pet {
    String name;

    @Override
    void voice() {
        waf();
    }

    void waf() {
        System.out.println("waf waf");
    }
}
