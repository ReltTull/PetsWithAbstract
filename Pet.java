import java.util.Iterator;

abstract class Pet implements Comparable<Pet>{
    int distance;

    /**
     * Метод включает в себя вызов метода voice(), так как голос - часть реакции
     */
    abstract void reaction();
    abstract void voice();

    abstract void getInfo();

    public int compareTo(Pet p) {
        return Integer.compare(this.distance, p.distance);
    }
}
