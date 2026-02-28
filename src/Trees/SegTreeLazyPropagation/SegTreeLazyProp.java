package Trees.SegTreeLazyPropagation;

import java.util.Arrays;

public class SegTreeLazyProp {
    private int[] segTree;
    private int[] lazyTree;
    private int n;

    public SegTreeLazyProp(int[] arr) {
        n = arr.length - 1;
        segTree = new int[4 * arr.length];
        lazyTree = new int[4 * arr.length];
        populate(arr);
    }

    private void populate(int[] arr) {
        populate(arr, 0, n, 0);
    }

    private void populate(int[] arr, int start, int end, int node) {
        if (start == end) {
            segTree[node] = arr[start];
        } else {
            int mid = start + (end - start) / 2;
            int leftNode = (node * 2) + 1;
            int rightNode = (node * 2) + 2;
            populate(arr, start, mid, leftNode);
            populate(arr, mid + 1, end, rightNode);
            segTree[node] = segTree[leftNode] + segTree[rightNode];
        }
    }

    public void rangeUpdate(int rStart, int rEnd, int val) {
        rangeUpdate(0, 0, n, rStart, rEnd, val);
    }

    private void rangeUpdate(int node, int start, int end, int rStart, int rEnd, int val) {
        pushDown(node, start, end);
        int mid = start + (end - start) / 2;
        if (rStart > end || rEnd < start) {
            return;
        } else if (start >= rStart && end <= rEnd) {
            segTree[node] += (end - start + 1) * val;
            if (start != end) {
                lazyTree[(node * 2) + 1] += val;
                lazyTree[(node * 2) + 2] += val;
            }
        } else {
            int leftNode = (node * 2) + 1;
            int rightNode = (node * 2) + 2;
            rangeUpdate(leftNode, start, mid, rStart, rEnd, val);
            rangeUpdate(rightNode, mid + 1, end, rStart, rEnd, val);
            segTree[node] = segTree[leftNode] + segTree[rightNode];
        }
    }

    private void pushDown(int node, int start, int end) {
        if (lazyTree[node] != 0) {
            segTree[node] += (lazyTree[node] * (end - start + 1));
            if (start != end) {
                lazyTree[(node * 2) + 1] += lazyTree[node];
                lazyTree[(node * 2) + 2] += lazyTree[node];
            }
            lazyTree[node] = 0;
        }
    }

    public int query(int qStart, int qEnd) {
        return query(0, 0, n, qStart, qEnd);
    }

    private int query(int node, int start, int end, int qStart, int qEnd) {
        pushDown(node, start, end);
        if (qStart > end || qEnd < start) {
            return 0;
        } else if (start >= qStart && end <= qEnd) {
            return segTree[node];
        } else {
            int mid = start + (end - start) / 2;
            int leftNode = (node * 2) + 1;
            int rightNode = (node * 2) + 2;
            return query(leftNode, start, mid, qStart, qEnd)
                    + query(rightNode, mid + 1, end, qStart, qEnd);
        }
    }

    public void display() {
        System.out.println(Arrays.toString(segTree));
        System.out.println(Arrays.toString(lazyTree));
    }
}

class Main {
    public static void main(String[] args) {
        SegTreeLazyProp s = new SegTreeLazyProp(new int[]{1, 2, 3, 4, 5, 6});
        s.display();
        s.rangeUpdate(0, 5, 1);
        s.display();
        System.out.println(s.query(4, 5));
        System.out.println(s.query(1, 2));
        s.display();
    }
}
