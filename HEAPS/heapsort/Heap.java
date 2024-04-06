package HEAPS.heapsort;

public class Heap {
    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    // insert method
    public void insert(int value) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }
        heap[size] = value;
        // calling method
        fixHeapAbove(size);
        size++;

    }

    // deleting a item
    public int delete(int index) {
        // check is it empty or not
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("heap is empty");
        }
        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];
        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }
        size--;
        return deletedValue;
    }

    // heap sort

    public void sort() {
        int lastHEapIndex = size - 1;
        for (int i = 0; i < lastHEapIndex; i++) {
            int tmp = heap[0];
            heap[0] = heap[lastHEapIndex - i];
            heap[lastHEapIndex - i] = tmp;

            fixHeapBelow(0, lastHEapIndex - i - 1);

        }
    }

    // comparing values to pareants
    private void fixHeapAbove(int index) {
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;

    }

    // peeking
    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return heap[0];
    }

    // // checking which heap need we need to work with above or below
    private void fixHeapBelow(int index, int lastHEapIndex) {
        int childToSwap;
        while (index <= lastHEapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHEapIndex) {
                if (rightChild > lastHEapIndex) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                // comapre the value to swap to make it complete tree
                if (heap[index] < heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;

                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }
        }
    }

    // print heap method
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.println(heap[i]);
            System.out.println(", ");
        }
        System.out.println();
    }

    // check tree is full of not
    public boolean isFull() {
        return size == heap.length;
    }

    // utlity method
    public int getParent(int index) {
        return (index - 1) / 2;
    }

    // is empty (checking the heap )
    public boolean isEmpty() {
        return size == 0;
    }

    // get child
    public int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

}
