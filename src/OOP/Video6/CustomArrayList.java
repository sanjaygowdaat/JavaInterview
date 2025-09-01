package OOP.Video6;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        data = new int[DEFAULT_SIZE];
    }

    public CustomArrayList(int capacity) {
        data = new int[capacity];
    }

    private void resize() {
        int[] temp = new int[size * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public void add(int element) {
        if (size == data.length) {
            resize();
        }
        data[size++] = element;
    }

    public void remove() {
        data[--size] = 0;
    }

    public int get(int index) {
        return data[index];
    }

    public int length() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) ;
    }
}
