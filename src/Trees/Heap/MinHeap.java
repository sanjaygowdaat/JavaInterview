package Trees.Heap;

import java.util.ArrayList;
import java.util.Arrays;
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



    public void buildHeap(int[] arr) {
        int index = (arr.length / 2) - 1;
        for (int i = index; i >= 0; i--) {
            heapifyDown(arr, i);
        }
    }

    private void heapifyDown(int[] arr, int index) {
        int left = (index * 2) + 1;
        int right = (index * 2) + 2;
        int largest = index;
        if (left < arr.length && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < arr.length && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != index) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            heapifyDown(arr, largest);
        }
    }

    public void heapSort(int[] arr) {
        buildHeap(arr);
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0]  = temp;
            heapifyDown(arr, 0, i - 1);
        }
    }

    private void heapifyDown(int[] arr, int index, int end) {
        int left = (index * 2) + 1;
        int right = (index * 2) + 2;
        int largest = index;
        if (left <= end && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right <= end && arr[right] > arr[largest]) {
            largest = right;
        }
        if (index != largest) {
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            heapifyDown(arr, largest, end);
        }
    }

    public List<Integer> heapSort1() {
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

        System.out.println(h.heapSort1());

        System.out.println("-----------------");

        int[] arr = {50, 40, 30, 20, 10};
        h.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}