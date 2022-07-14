import java.util.Iterator;

abstract class Pet implements Comparable<Pet>{
    int distance;
    abstract void voice();

    abstract void getInfo();

    public int compareTo(Pet p) {
        return Integer.compare(this.distance, p.distance);
    }
}
