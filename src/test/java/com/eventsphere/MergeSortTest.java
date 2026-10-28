package com.eventsphere.dsa.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {
    @Test
    void shouldSortArray() {
        int[] arr = {5, 3, 8, 1, 9};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{1, 3, 5, 8, 9}, arr);
    }
}
