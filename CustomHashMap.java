import java.util.LinkedList;

class CustomHashMap {
    private static final int SIZE = 16;
    private LinkedList<Entry>[] table;

    public CustomHashMap() {
        table = new LinkedList[SIZE];
        for(int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int getHash(String key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(String key, int value) {
        int hash = getHash(key);
        LinkedList<Entry> bucket = table[hash];

        for(Entry entry : bucket) {
            if(entry.key.equals(key)) {
                entry.value = value; 
                return;
            }
        }
        bucket.add(new Entry(key, value)); 
    }

    public Integer get(String key) {
        int hash = getHash(key);
        LinkedList<Entry> bucket = table[hash];

        for(Entry entry : bucket) {
            if(entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; 
    }

    public void remove(String key) {
        int hash = getHash(key);
        LinkedList<Entry> bucket = table[hash];

        bucket.removeIf(entry -> entry.key.equals(key));
    }

    public void display() {
        for(int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            for(Entry entry : table[i]) {
                System.out.print("[" + entry.key + " -> " + entry.value + "] ");
            }
            System.out.println();
        }
    }

    private static class Entry {
        String key;
        int value;

        public Entry(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
public class demo{
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("key1",4);
        map.put("hello",5);
        
        System.out.println("Value for key 'two': " + map.get("two"));
        map.remove("two");
        System.out.println("Value for key 'two' after removal: " + map.get("two"));
        
        map.display();
    }
}
