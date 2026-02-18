package PracticePrograms.Practice01;

import Trees.SegmentTree.SegmentTree;

public class SegmentTreee {
    private Node root;

    public void populate(int[] arr) {
        root = new Node(0, arr.length - 1);
        populate(root, arr);
        root.val = root.left.val + root.right.val;
    }

    private void populate(Node node, int[] arr) {
        if (node.start == node.end) {
            node.val = arr[node.start];
            return;
        }
        int mid = node.start + (node.end - node.start) / 2;
        node.left = new Node(node.start, mid);
        node.right = new Node(mid + 1, node.end);
        populate(node.left, arr);
        populate(node.right, arr);
        node.val = node.left.val + node.right.val;
    }

    public void update(int index, int newVal) {
        if (index < root.start || index > root.end) {
            return;
        }
        update(root, index, newVal);
    }

    private void update(Node node, int index, int newVal) {
        if (node.start == node.end) {
            node.val = newVal;
            return;
        }
        if (index <= node.left.end) {
            update(node.left, index, newVal);
        } else {
            update(node.right, index, newVal);
        }
        node.val = node.left.val + node.right.val;
    }

    public int query(int start, int end) {
        if (start > end || start > root.end || start < root.start || end > root.end) {
            return -1;
        }
        return query(root, start, end);
    }

    private int query(Node node, int start, int end) {
        // no overlap
        if (start > node.end || end < node.start) {
            return 0;
        }
        // complete overlap
        else if (node.start >= start && node.end <= end) {
            return node.val;
        }
        // partial overlap
        else {
            return query(node.left, start, end) + query(node.right, start, end);
        }

    }

    // display function for the purpose of debugging mostly
    public void display() {
        display(root, 0);
    }

    private void display(Node node, int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("\t\t");
            }
            System.out.println("|------>[" + node.val +"]");
        } else {
            System.out.println("[" + node.val + "]");
        }
        display(node.left, level + 1);
    }

    private static class Node {
        Node left;
        Node right;
        int start;
        int end;
        int val;

        private Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        SegmentTreee st = new SegmentTreee();
        int[] arr = {1, 2, 3, 4, 5, 6};
        st.populate(arr);
        st.display();
        System.out.println("-------------------------");
        System.out.println("Query Answer " + st.query(0, 3));
        System.out.println("-------------------------");
        st.update(2, 1);
        st.display();
        System.out.println("-------------------------");
        System.out.println("Query Answer " + st.query(0, 3));
        System.out.println("-------------------------");

    }
}
