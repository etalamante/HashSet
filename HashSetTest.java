import java.util.*;

public class HashSetTest {
    ArrayList<Object> baseMap = new ArrayList<>();

    public void add(Object objectToAdd) {
        if(baseMap.size() == 0) {
            baseMap.add(objectToAdd);
            return;
        }
        if(baseMap.contains(objectToAdd))
            return;
        else {
            baseMap.add(objectToAdd);
            return;
        }
    }
    public void print() {
        for(int i = 0; i < baseMap.size(); i++)
            System.out.println(baseMap.get(i));
    }
    public Object get(int index) {
        return baseMap.get(index);
    }
    public void clear() {
        baseMap.clear();
    }
    public boolean contains(Object objectToAnalize) {
        return baseMap.contains(objectToAnalize);
    }
    public boolean isEmpty() {
        return baseMap.isEmpty();
    }
    public void remove(Object objectToRemove) {
        baseMap.remove(objectToRemove);
    }
    public int size() {
        return baseMap.size();
    }
}
