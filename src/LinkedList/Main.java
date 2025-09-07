package LinkedList;

public class Main {
    public static void main(String[] args) {
//        CustomLinkedList l = new CustomLinkedList();
//        l.addFirst(5);
//        l.addFirst(10);
//        l.addFirst(15);
//        l.addFirst(20);
//        l.addFirst(25);
//        l.printLL();
//
//        l.addLast(5);
//        l.addLast(10);
//        l.addLast(15);
//        l.addLast(20);
//        l.addLast(25);
//        l.printLL();

//        l.add(1, 0);
//        l.add(2, 1);
//        l.add(3, 2);
//        l.add(4, 3);
//        l.add(5, 4);
//        l.display();
//        System.out.println(l.size);
//        l.remove(4);
//        l.remove(3);
//        l.display();
//        System.out.println(l.size);

//        CustomDoublyLinkedList cd = new CustomDoublyLinkedList();
//        cd.addFirst(5);
//        cd.addFirst(4);
//        cd.addFirst(3);
//        cd.addFirst(2);
//        cd.addFirst(1);
//        cd.display();
//
//        cd.addLast(6);
//        cd.addLast(7);
//        cd.addLast(8);
//        cd.addLast(9);
//        cd.addLast(10);
//        cd.display();
//
//        System.out.println(cd.size);
//
//        cd.add(11, 10);
//        cd.add(12, 11);
//        cd.add(13, 12);
//        cd.add(14, 13);
//        cd.display();
//        System.out.println(cd.size);
//        cd.addFirst(0);
//        cd.addLast(15);
//        cd.display();
//        System.out.println(cd.size);
//
//        cd.remove(15);
//        cd.remove(0);
//        cd.display();
//        System.out.println(cd.size);
//        cd.displayReverse();
//        cd.insertLast(15);
//        cd.insertLast(16);
//        cd.display();
//        System.out.println(cd.size);

        CyclicLL cl = new CyclicLL();
        cl.addFirst(10);
        cl.addFirst(9);
        cl.addFirst(8);
        cl.addFirst(7);
        cl.addFirst(6);
        cl.display();
        System.out.println(cl.size);

        cl.addLast(11);
        cl.addLast(12);
        cl.display();
        System.out.println(cl.size);

        cl.add(1, 0);
        cl.add(2, 1);
        cl.add(3, 2);
        cl.add(4, 3);
        cl.add(5, 4);
        cl.display();
        System.out.println(cl.size);

        cl.add(0, 0);
        cl.add(13, 13);
        cl.display();
        System.out.println(cl.size);
        cl.remove(0);
        cl.remove(13);
        cl.remove(10);
        cl.display();
        System.out.println(cl.size);

    }

}
