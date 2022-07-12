import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Pet> humansPets = new ArrayList<>();
        humansPets.add(new Cat(20));
        humansPets.add(new Dog(10));

        new Human(humansPets).call();
    }
}
