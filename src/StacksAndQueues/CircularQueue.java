package StacksAndQueues;

public class CircularQueue {
    int[] data;
    int size = 0;
    int front = 0, end = 0;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Circular Queue is full");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front];
        front++;
        front = front % data.length;
        size--;
        return removed;
    }

    public void display() {
        int temp = front;
        for (int i = 1; i <= size; i++) {
            System.out.print(data[temp] + " -> ");
            temp++;
            temp = temp % data.length;
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
