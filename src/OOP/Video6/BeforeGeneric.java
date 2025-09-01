package OOP.Video6;

import java.util.Arrays;

public class BeforeGeneric {
    private Object[] data;
    private int size = 0;

    public BeforeGeneric() {
        data = new Object[10];
    }

    public void add(Object object) {
        data[size++] = object;
    }

    public Object get(int index) {
        return data[index];
    }

    public String toString() {
        return Arrays.toString(data);
    }

}
