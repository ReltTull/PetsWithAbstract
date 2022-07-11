import java.util.ArrayList;

public class Human {
    ArrayList<Pet> pets = new ArrayList<>();
    public Human(ArrayList<Pet> humansPets) {
        for (Pet pet: humansPets) {
            pets.add(pet);
        }
    }
    void call() {
        System.out.println("*calling*");
        for (Pet pet: pets) {
            pet.voice();
        }
    }
}
