package practice.com;

import java.util.ArrayList;
import java.util.List;

public class HashMapCustom<K, V> {

    public static void main(String[] args) {
        HashMapCustom<String, Integer> map = new HashMapCustom<>();

        // 1. Basic Put & Get
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("Get A: " + map.get("A")); // 1
        System.out.println("Get B: " + map.get("B")); // 2

        // 2. Update Existing Key
        map.put("A", 100);
        System.out.println("Updated A: " + map.get("A")); // 100

        // 3. Non-existing Key
        System.out.println("Get C: " + map.get("C")); // null

        // 6. Collision Handling Test
        HashMapCustom<Integer, String> collisionMap = new HashMapCustom<>();

        collisionMap.put(1, "One");
        collisionMap.put(17, "Seventeen"); // same bucket if capacity = 16

        System.out.println("Collision get 1: " + collisionMap.get(1)); // One
        System.out.println("Collision get 17: " + collisionMap.get(17)); // Seventeen

        // 7. Resize Trigger Test
        HashMapCustom<Integer, Integer> resizeMap = new HashMapCustom<>();

        for (int i = 0; i < 20; i++) {
            resizeMap.put(i, i * 10);
        }

        boolean allCorrect = true;
        for (int i = 0; i < 20; i++) {
            if (resizeMap.get(i) != i * 10) {
                allCorrect = false;
                break;
            }
        }

        System.out.println("Resize test passed: " + allCorrect); // true
    }

    // Entry class to store key-value pair
    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 16; // default size
    private ArrayList<List<Entry<K, V>>> buckets;

    // Constructor
    public HashMapCustom() {
        buckets = new ArrayList<>(capacity);

        // initialize buckets
        for (int i = 0; i < capacity; i++) {
            buckets.add(new ArrayList<>());
        }
    }

    // Hash function
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // PUT operation
    public void put(K key, V value) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = buckets.get(index);

        // check if key exists
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // update
                return;
            }
        }

        // insert new entry
        bucket.add(new Entry<>(key, value));
    }

    // GET operation
    public V get(K key) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = buckets.get(index);

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null; // not found
    }
}
