package LinkedList;

public class CustomDoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public CustomDoublyLinkedList() {
        size = 0;
    }

    public void addFirst(int value) {
        if (head != null) {
            head.prev = new Node(value, head);
            head = head.prev;
        } else {
            head = new Node(value);
            tail = head;
        }
        size++;
    }

    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
        } else {
            tail.next = new Node(value);
            tail.next.prev = tail;
            tail = tail.next;
        }
        size++;
    }

    public void add(int value, int index) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        node.next.prev = node;
        node.prev = temp;
        temp.next = node;
        size++;
    }

    //add new node at the end without using tail pointer, careful, tail pointer is not updated here. This was just a boring exercise.
/*    public void insertLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
            node.prev = last;
        }
        size++;
    }*/

    public void remove(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        if (size == 1) {
            head = tail = null;
        } else if (index == 0) {
            head = temp.next;
            head.prev = null;
        } else if (index == size - 1) {
            tail = temp;
            temp.next.prev = null;
            temp.next = null;
        } else {
            Node removeElement = temp.next;
            temp.next = removeElement.next;
            removeElement.next.prev = temp;
        }
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("Start");
}

    private class Node {
        int value;
        Node next;
        Node prev;

        private Node(int value) {
            this.value = value;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
