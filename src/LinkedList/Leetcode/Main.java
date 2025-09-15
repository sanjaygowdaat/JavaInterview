package LinkedList.Leetcode;

public class Main {
    public static void main(String[] args) {
        LCLinkedList lc = new LCLinkedList();
        lc.add(1, 0);
        lc.add(2, 1);
        lc.add(3, 2);
        lc.add(4, 3);
        lc.display();
        System.out.println(lc.size);
        lc.addFirst(-1);
        lc.addLast(5);
        lc.display();
        System.out.println(lc.size);

        lc.createCycle(5);
        System.out.println(lc.hasCycle());
        System.out.println("Cycle Length : " + lc.cycleLength());

        System.out.println("Node value where cycle begins : " + lc.cycleStartNode().value);
    }
}
