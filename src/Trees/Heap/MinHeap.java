package Trees.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinHeap {
    List<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public int peek() throws Exception {
        if (heap.isEmpty()) {
            throw new Exception("Heap is empty!");
        }
        return heap.getFirst();
    }

    public void insert(int val) {
        heap.add(val);
        heapifyUp(heap.size() - 1);
    }

    private void heapifyUp(int index) {
        int parent = (index - 1) / 2;
        while (parent >= 0 && heap.get(parent) > heap.get(index)) {
            Collections.swap(heap, index, parent);
            index = parent;
            parent = (parent - 1) / 2;
        }
    }

    public void removeMin() {
        Collections.swap(heap, 0, heap.size() - 1);
        heap.removeLast();
        heapifyDown(0);
    }

    private void heapifyDown(int index) {
        int smallest = index;
        int left = (index * 2) + 1;
        int right = (index * 2) + 2;
        if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }
        if (smallest != index){
            Collections.swap(heap, index, smallest);
            heapifyDown(smallest);
        }
    }

    public void display() {
        System.out.println(heap);
    }

    public List<Integer> heapSort() {
        ArrayList<Integer> list = new ArrayList<>();
        while (!heap.isEmpty()) {
            list.add(heap.getFirst());
            this.removeMin();
        }
        return list;
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        MinHeap h = new MinHeap();
        h.insert(10);
        h.insert(15);
        h.insert(5);
        h.insert(20);
        h.insert(40);
        h.insert(30);
        h.insert(25);

//        h.display();
//        System.out.println(h.peek());
//        h.removeMin();
//        h.display();
//        System.out.println(h.peek());
//        h.removeMin();
//        h.display();

        h.insert(7);
        h.insert(108);
        h.insert(28);
        h.insert(-1);
        h.insert(56);

        System.out.println(h.heapSort());
    }
}