package lesson3;


import java.util.ArrayList;

public class Box<T extends Fruit> {
    public ArrayList<T> fruits;

    public float getWeight() {
        float res = 0;
        for (T f : fruits) res += f.weight;
        return res;
    }

    public boolean compare(Box<T> box) {
        return this.getWeight() == box.getWeight();
    }
}
