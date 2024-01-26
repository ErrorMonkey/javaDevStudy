package _05_class._08_generic;

public class Prac01_Generic {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        System.out.printf("Key: %s, Value: %s", pair1.getKey(), pair1.getValue()).println();
        Pair<Integer, String> pair2 = new Pair<>(2, "two");
        System.out.printf("Key: %s, Value: %s", pair2.getKey(), pair2.getValue()).println();
    }
}
class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return this.key;
    }
    public V getValue() {
        return this.value;
    }
}
