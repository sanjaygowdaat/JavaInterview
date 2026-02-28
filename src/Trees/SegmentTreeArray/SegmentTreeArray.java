package Trees.SegmentTreeArray;

import java.util.Arrays;

public class SegmentTreeArray {
    private int[] tree;
    int n;

    public SegmentTreeArray(int[] arr) {
        n = arr.length;
        if (n > 0) {
            tree = new int[4 * n];
            build(arr);
        }
    }

    public void build(int[] arr) {
        build(arr, 0, arr.length - 1, 0);
    }

    private void build(int[] arr, int start, int end, int node) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            int leftNode = (node * 2) + 1;
            int rightNode = (node * 2) + 2;
            build(arr, start, mid, leftNode);
            build(arr, mid + 1, end, rightNode);
            tree[node] = tree[leftNode] + tree[rightNode];
        }
    }

    public void update(int index, int newVal) {
        update(0, 0, n - 1, index, newVal);
    }

    private void update(int node, int start, int end, int index, int newVal) {
        if (start == end) {
            tree[node] = newVal;
        }
        else {
            int mid = (start + end) / 2;
            int leftNode = (node * 2) + 1;
            int rightNode = (node * 2) + 2;
            if (index >= start && index <= mid) {
                update(leftNode, start, mid, index, newVal);
            } else {
                update(rightNode, mid + 1, end, index, newVal);
            }
            tree[node] = tree[leftNode] + tree[rightNode];
        }
    }

    public int query(int qStart, int qEnd) {
        return query(0, 0, n - 1, qStart, qEnd);
    }

    private int query(int node, int start, int end, int qStart, int qEnd) {
        if (qStart > end || qEnd < start) {
            return 0;
        } else if (start >= qStart && end <= qEnd) {
            return tree[node];
        } else {
            int mid = (start + end) / 2;
            return query((node * 2) + 1, start, mid, qStart, qEnd) +
                    query((node * 2) + 2, mid + 1, end, qStart, qEnd);
        }
    }

    public void display() {
        System.out.println("Segment Tree Array : ");
        System.out.println(Arrays.toString(tree));
    }
}

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        SegmentTreeArray sa = new SegmentTreeArray(arr);
        sa.display();
        System.out.println("Query range 2 - 4 result : " + sa.query(2, 4));
        sa.update(3, 8);
        sa.display();
        System.out.println("Query range 2 - 4 result : " + sa.query(2, 4));
    }
}