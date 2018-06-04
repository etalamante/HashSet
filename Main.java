public class Main {
    public static void main(String[] args) {
        HashSetTest test = new HashSetTest();
        test.add(true);
        test.add("asas");
        test.add(3);
        test.add(null);
        test.add("asas");
        test.print();
        System.out.println("The set contains the value 3? " + test.contains(3));
        test.clear();
        test.print();
        System.out.println("Is the set empty now? " + test.isEmpty());
        test.add(5);
        test.add(true);
        test.add(5);
        test.add(null);
        test.remove(true);
        test.add(3);
        test.print();
        System.out.println("The set size is: " + test.size());
    }
}
