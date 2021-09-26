package lesson3;


import java.util.ArrayList;

public class Box<T extends Fruit> {
    public ArrayList<T> fruits = new ArrayList<>();

    private float getWeight() {
        float res = 0;
        for (T f : fruits) res += f.weight;
        return res;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
    public void add(T fruit) {
        fruits.add(fruit);
    }
    public void addAll(Box<T> box) {
        fruits.addAll(box.fruits);
        box.fruits.clear();
    }
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<Apple>();
        Box<Orange> orangeBox = new Box<Orange>();
        Box<Apple> apple2Box2 = new Box<Apple>();
        appleBox.add(new Apple());
        orangeBox.add(new Orange());
        apple2Box2.add(new Apple());

        System.out.println(appleBox.compare(orangeBox));
        appleBox.addAll(apple2Box2);
        System.out.println(appleBox.compare(orangeBox));

    }
}
