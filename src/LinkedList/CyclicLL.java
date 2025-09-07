package LinkedList;

public class CyclicLL {
    Node head;
    Node tail;
    int size;

    public CyclicLL() {
        size = 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = head;
        } else {
            tail.next = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int value) {
        if (head == null) {
            addFirst(value);
        } else {
            Node node = new Node(value);
            node.next = head;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void add(int value, int index) {
        if (index == 0) {
            addFirst(value);
        } else {
            Node node = new Node(value);
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            if (index == size) {
                tail = node;
            }
            size++;
        }
    }

    // have handled few edge cases like : -> if there is only single element or if the element to
    // be removed is head or tail, then head and tail pointer have to updated
    public void remove(int value) {
        Node temp = head;
        if (head == null) {
            return;
        } else if (head == tail && head.value == value) {
            head = null;
            tail = null;
        } else if (head.value == value) {
            tail.next = head.next;
            head = head.next;
        } else {
            do {
                if (temp.next.value == value) {
                    if (temp.next == tail) {
                        temp.next = head;
                        tail = temp;
                    } else {
                        temp.next = temp.next.next;
                    }
                } else {
                    temp = temp.next;
                }
            } while (temp != head);
        }
        size--;
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("Head");
        }

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
