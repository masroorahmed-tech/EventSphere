package com.eventsphere.dsa.hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomHashTableTest {
    @Test
    void shouldStoreAndRetrieveValues() {
        CustomHashTable<String, Integer> map = new CustomHashTable<>();
        map.put("alpha", 10);
        map.put("beta", 20);

        assertEquals(10, map.get("alpha"));
        assertEquals(20, map.get("beta"));
    }
}
