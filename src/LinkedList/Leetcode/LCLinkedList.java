package LinkedList.Leetcode;

public class LCLinkedList {
    ListNode head;
    ListNode tail;
    int size;

    public LCLinkedList() {
        this.size = 0;
    }

    public void addFirst(int value) {
        if (head == null) {
            head = new ListNode(value);
            tail = head;
        } else {
            ListNode node = new ListNode(value, head);
            head = node;
        }
        size++;
    }

    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
        } else {
            ListNode node = new ListNode(value);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void add(int value, int index) {
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            ListNode temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            ListNode node = new ListNode(value, temp.next);
            temp.next = node;
            size++;
        }
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void createCycle(int index) {
        ListNode cycleStart = head;
        for (int i = 1; i <= index; i++) {
            cycleStart = cycleStart.next;
        }
        tail.next = cycleStart;
    }

//https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle() {
        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public int cycleLength() {
        if(head == null) return 0;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int length = 0;
                do {
                    slow = slow.next;
                    length++;
                } while (slow != fast);
                return length;
            }
        }
        return 0;
    }

//    https://leetcode.com/problems/linked-list-cycle-ii/description/
    public ListNode cycleStartNode() {
        int length = cycleLength();
        if (length == 0) return null;
        ListNode first = head;
        ListNode second = head;

        for (int i = 1; i <= length; i++) {
            second = second.next;
        }

        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return first;
    }

    //bubble sort
    public void sortList() {
        ListNode tempHead;
        ListNode tempNext;
        while (head != null) {
            tempHead = head;
            ListNode tempPrev = new ListNode(-1);
            tempPrev.next = tempHead;
            tempNext = tempHead.next;
            if (tempHead.value > tempHead.next.value) {
                head = head.next;
            }
            int counter = 0;
            while (tempHead.next != null) {
                if (tempHead.value > tempHead.next.value) {
                    tempHead.next = tempHead.next.next;
                    tempPrev.next = tempNext;
                    tempNext.next = tempHead;
                    counter++;
                } else {
                    tempHead = tempHead.next;
                }
                tempPrev = tempPrev.next;
                tempNext = tempHead.next;
            }
            if (counter == 0) {
                break;
            }
        }
    }

    // bubble sort for linked list, more efficient compared to sortList() method
    // because im not traversing the entire list after the larger elements are placed at the end, but need size variable.
    public void sortList2() {
        for (int i = 0; i < size - 1; i++) {
            ListNode temp = head;
            ListNode tempNext = temp.next;
            ListNode tempPrev = new ListNode(-1);
            tempPrev.next = head;
            if (temp.value > temp.next.value) {
                head = head.next;
            }
            for (int j = 0; j < size - 1 - i; j++) {
                if (temp.next != null && temp.value > temp.next.value) {
                    temp.next = temp.next.next;
                    tempPrev.next = tempNext;
                    tempNext.next = temp;
                } else {
                    temp = temp.next;
                }
                tempPrev = tempPrev.next;
                tempNext = temp.next;
            }
        }
    }

     class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }

        ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
}
