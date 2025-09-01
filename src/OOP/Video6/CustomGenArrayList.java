package OOP.Video6;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private int size = 0;
    private final int DEFAULT_SIZE = 10;

    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public CustomGenArrayList(int capacity) {
        data = new Object[capacity];
    }

    public void add(T t) {
        if (size == data.length) {
            resize();
        }
        data[size++] = t;
    }

    public T get(int index) {
        return (T) (data[index]);
    }

    public void resize() {
        Object[] temp = new Object[size * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                '}';
    }
}

class Main1 {
    public static void main(String[] args) {
        CustomGenArrayList<Integer> obj = new CustomGenArrayList<>();
        for (int i = 0; i < 15; i++) {
            obj.add(i * 2);
        }
        System.out.println(obj);
        System.out.println(obj.get(1));
    }
}
