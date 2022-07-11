import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Pet> humansPets = new ArrayList<>();
        humansPets.add(new Cat());
        humansPets.add(new Dog());

        new Human(humansPets).call();
    }
}
