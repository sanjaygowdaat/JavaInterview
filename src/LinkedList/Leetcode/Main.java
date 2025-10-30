package LinkedList.Leetcode;

public class Main {
    public static void main(String[] args) {
//        LCLinkedList lc = new LCLinkedList();
//        lc.add(1, 0);
//        lc.add(2, 1);
//        lc.add(3, 2);
//        lc.add(4, 3);
//        lc.display();
//        System.out.println(lc.size);
//        lc.addFirst(-1);
//        lc.addLast(5);
//        lc.display();
//        System.out.println(lc.size);
//
//        lc.createCycle(5);
//        System.out.println(lc.hasCycle());
//        System.out.println("Cycle Length : " + lc.cycleLength());
//
//        System.out.println("Node value where cycle begins : " + lc.cycleStartNode().value);

        LCLinkedList lc2 = new LCLinkedList();
        lc2.add(5, 0);
        lc2.add(4, 1);
        lc2.add(3, 2);
        lc2.add(2, 3);
        lc2.add(1, 4);
        lc2.add(5, 0);
        lc2.display();
        lc2.sortList2();
        System.out.print("Sorted List: ");
        lc2.display();
    }
}
