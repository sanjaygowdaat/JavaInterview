package OOP.Video6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        BeforeGeneric bf = new BeforeGeneric();
//        bf.addFirst("Adi");
//        bf.addFirst("Sam");
//        bf.addFirst(8);
//
//        for (int i = 0; i < 3; i++) {
//            Object o = bf.get(i); // no error, so why not do this instead of generics
//            System.out.println(o);
//        }

        ArrayList<Integer> list = new ArrayList<>();
//        list.addFirst(1);
//        list.addFirst(2);
//        list.addFirst(3);
//        list.addFirst(4);
//        list.addFirst(5);
//        list.set(4, 5);
//        list.get(2);
//        list.isEmpty();
//        list.remove(4);
//        System.out.println(list);

//        CustomArrayList list1 = new CustomArrayList();
//        list1.addFirst(1);
//        list1.addFirst(2);
//        list1.addFirst(3);
//        list1.addFirst(4);
//        list1.addFirst(5);
//        list1.addFirst(6);
//        System.out.println(list1.get(1));
//        System.out.println(list1.length());
//        list1.remove();
//        System.out.println(list1.length());
//
//        System.out.println(list1);

        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(countGreaterThan(arr, 1));

    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] array, T element) {
        int count = 0;
        for (T e : array) {
            if (e.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

}
