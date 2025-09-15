package LinkedList;

public class Main1 {
    public static void main(String[] args) {
        CustomLinkedList cl = new CustomLinkedList();
        cl.insert(1, 0);
        cl.insert(2, 1);
        cl.insert(3, 2);
        cl.insert(4, 3);
        cl.display();
        System.out.println(cl.size);
        cl.insert(0, 0);
        cl.insert(5, 5);
        cl.display();
        System.out.println(cl.size);
    }
}
