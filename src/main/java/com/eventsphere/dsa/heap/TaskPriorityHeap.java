package com.eventsphere.dsa.heap;

public class TaskPriorityHeap {
    private final int[] heap;
    private int size;

    public TaskPriorityHeap(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {
        if (size >= heap.length) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    private void heapifyUp(int index) {
        int parent = (index - 1) / 2;
        while (index > 0 && heap[parent] < heap[index]) {
            swap(parent, index);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    private void heapifyDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
