import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        ArrayList<Pet> humansPets = new ArrayList<>();
        humansPets.add(new Dog(15));
        humansPets.add(new Cat(20));
        humansPets.add(new Dog(10));
        humansPets.add(new Cat(5));

        new Human(humansPets).call();

        Collections.sort(humansPets);

        Iterator<Pet> iter = humansPets.iterator();
        while (iter.hasNext()){
            iter.next().getInfo();
        }

    }
}
