package level1.javacore.collection.generic.homework;

import java.util.ArrayList;
import java.util.List;

public class Stable<T> {
    private List<T> horses = new ArrayList<>();

    public T addAnimal(T hourse) {
        horses.add(hourse);
        return hourse;
    }

    public void addAllAnimals(List<? extends T> horses) { this.horses.addAll(horses); }

    public List<T> getAllAnimals() { return horses; }

    public int countAnimals() {
        return horses.size();
    }
}
