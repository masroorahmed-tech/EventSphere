package com.eventsphere.dsa.hashtable;

public class CustomHashTable<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private final Object[] keys;
    private final Object[] values;

    public CustomHashTable() {
        this.keys = new Object[DEFAULT_CAPACITY];
        this.values = new Object[DEFAULT_CAPACITY];
    }

    public void put(K key, V value) {
        int index = Math.abs(key.hashCode()) % keys.length;
        keys[index] = key;
        values[index] = value;
    }

    public V get(K key) {
        int index = Math.abs(key.hashCode()) % keys.length;
        if (keys[index] != null && keys[index].equals(key)) {
            return (V) values[index];
        }
        return null;
    }
}
