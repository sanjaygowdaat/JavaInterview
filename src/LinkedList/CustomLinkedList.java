package LinkedList;

public class CustomLinkedList {
    Node head;
    Node tail;
    int size;

    public CustomLinkedList() {
        size = 0;
    }

    // It looks like a bad idea to return Node in public method and give direct access to node object
    // so below is a another insertMethod using recursion, with better encapsulation.
    /*public Node insert(int value, int index) {
        if (index == 0) {
            Node node = head;
            head = new Node(value);
            head.next = node;
            size++;
            return head;
        }
        Node temp = head;
        head = head.next;
        temp.next = insert(value, index - 1);
        head = temp;
        return head;
    }*/

    public void insert(int value, int index) {
        head = recursionInsert(value, index, head);
    }

    private Node recursionInsert(int value, int index, Node node) {
        if (index == 0) {
            size++;
            return new Node(value, node);
        }
        node.next = recursionInsert(value, index - 1, node.next);
        return node;
    }


    public void addFirst(int value) {
        if (head != null) {
            Node temp = head;
            head = new Node(value, head);
            head.next = temp;
        } else {
            head = new Node(value);
            tail = head;
        }
        size++;
    }

    public void addLast(int value) {
        if (head != null) {
            tail.next = new Node(value);
            tail = tail.next;
        } else {
            head = new Node(value);
            tail = head;
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
        temp.next = node;
        size++;
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        }
    }
