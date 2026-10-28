package com.eventsphere.dsa.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskPriorityHeapTest {
    @Test
    void shouldReturnHighestPriority() {
        TaskPriorityHeap heap = new TaskPriorityHeap(10);
        heap.insert(3);
        heap.insert(9);
        heap.insert(1);

        assertEquals(9, heap.extractMax());
    }
}
