package HashMaps;
// basic hashmap implementation using open addressing approach to deal with collision
// this is just to solidify my core understanding of hashmap fundamentals

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class HashMaps <K, V> {
    Node<K, V>[] hashTable;
    int m; // size of the hashTable
    int n; // number of elements in the hashTable
    private final Node<K, V> DELETED_NODE = new Node<>();

    public HashMaps() {
        hashTable = new Node[16];
        m = hashTable.length;
    }

    public float loadFactor() {
        return (float)n / m;
    }

    public void put(K key, V value) {
        if (loadFactor() > 0.75) {
            reHash();
        }
        int homeIndex = Math.abs(key.hashCode()) % m;
        // Linear probing with wrap around
        for (int i = 0; i < m; i++) {
            // new insert
            if (hashTable[(homeIndex + i) % m] == null || hashTable[(homeIndex + i) % m] == DELETED_NODE) {
                hashTable[(homeIndex + i) % m] = new Node<>(key, value);
                n++;
                return;
            }
            // update the index if key already exists in the table
            if (hashTable[(homeIndex + i) % m].key.equals(key)) {
                hashTable[(homeIndex + i) % m].value = value;
                return;
            }
        }
    }

 /*   private void reHash() {
        n = 0; // reset n to zero because otherwise add() call inside this function will increment  prev/old 'n' value
        m = m * 2; // double the prev hash table size
        Node<K, V>[] oldHashTable = hashTable;
        hashTable = new Node[m];
        for (Node<K, V> node : oldHashTable) {
            if (node != null && node != DELETED_NODE) {
                int homeIndex = Math.abs(node.key.hashCode()) % m;
                for (int i = 0; i < m; i++) {
                    if(hashTable[(homeIndex + i) % m] == null) {
                        hashTable[(homeIndex + i) % m] = node;
                        n++; // remember to increment n while rehashing to new table
                        break;
                    }
                }
            }
        }
    }*/

    private void reHash() {
        n = 0; // reset n to zero because otherwise add() call inside this function will increment  prev/old 'n' value
        m = m * 2; // double the prev hash table size
        Node<K, V>[] oldHashTable = hashTable;
        hashTable = new Node[m];
        for (Node<K, V> node : oldHashTable) {
            if (node != null && node != DELETED_NODE) {
                this.put(node.key, node.value);
            }
        }
    }

    public V get(K key) {
        int index = Math.abs(key.hashCode()) % m;
        for (int i = 0; i < m; i++) {
            if (hashTable[(index + i) % m] == null) {
                return null;
            }
            if (hashTable[(index + i) % m] == DELETED_NODE) {
                continue;
            }
            if (hashTable[(index + i) % m].key.equals(key)) {
                return hashTable[(index + i) % m].value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int homeIndex = Math.abs(key.hashCode()) % m;
        for (int i = 0; i < m; i++) {
            if ((hashTable[(homeIndex + i) % m]) == null) {
                return;
            }
            if (hashTable[(homeIndex + i) % m] == DELETED_NODE) {
                continue;
            }
            if ((hashTable[(homeIndex + i) % m]).key.equals(key)) {
                hashTable[(homeIndex + i) % m] = DELETED_NODE;
                n--;
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node<K, V> node : hashTable) {
            if (node != null) {
                sb.append("Key : ").append(node.key).append(" | ");
                sb.append("Value : ").append(node.value).append("\n");
            }
        }
        return sb.toString();
    }

    private static class Node <K, V> {
        K key;
        V value;

        private Node() {

        }

        private Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

class Main {
    public static void main(String[] args) {
        HashMaps<String, Integer> map = new HashMaps<String, Integer>();
        map.put("Mango", 1);
        map.put("Apple", 10);
        map.put("Orange", 2);
        map.put("Kiwi", 3);
        map.put("ButterFruit", 0);
        System.out.println(map.get("Mango"));
        System.out.println(map);
    }
}