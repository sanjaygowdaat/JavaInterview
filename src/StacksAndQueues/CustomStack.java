package StacksAndQueues;

public class CustomStack {
    int[] data;
    int ptr = -1;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    boolean isFull() {
        return ptr == data.length - 1;
    }
}
