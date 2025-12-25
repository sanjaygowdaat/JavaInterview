package Trees.SegmentTree;

public class SegmentTree {
    private Node root;

    public void populate(int[] arr) {
        root = new Node(0, arr.length - 1);
        populate(root, arr, 0, arr.length - 1); // actually no need to separate variables for start and end since they are already stored in node.
    }

    /*notice that you are adding sum of values of two children while coming back up
    and not recomputing range sum for each node's value separately while going down from root node.
    if you do that, time complexity will increase to O(NlogN) since you will be
    accessing full array at each level, and height of the tree is logN. So it'll be O(N*logN)
    In the below code, since we are aggregating leaf nodes value to compute range sum for parent node
    we only access array elements one time per tree construction. So time complexity is O(N) for the below function.*/
    private void populate(Node node,int[] arr, int start, int end) {
        if (start == end) {
            node.value = arr[start];
            return;
        }
        int mid = start + (end - start) / 2;
        node.left = new Node(start, mid);
        node.right = new Node(mid + 1, end);
        populate(node.left, arr, start, mid);
        populate(node.right, arr, mid + 1, end);
        node.value = node.left.value + node.right.value;
    }

    public void update(int index, int newValue) {
        if (index < root.start || index > root.end) {
            System.out.println("Index out of bounds");
            return;
        }
        update(root,index, newValue);
    }

    private void update(Node node, int index, int newValue) {
        if (index == node.start && index == node.end) {
            node.value = newValue;
            return;
        }
        if (index <= node.left.end) {
            update(node.left, index, newValue);
        } else {
            update(node.right, index, newValue);
        }
        node.value = node.left.value + node.right.value;
    }

    public int range(int start, int end) {
        // if input index is out of bounds
        if (start > root.end || end < root.start) {
            return 0;
        }
        // if input is invalid where start is greater than end
        if (start > end) {
            return 0;
        }
        return range(root, start, end);
    }

    private int range(Node node, int start, int end) {
        if (start == node.start && end == node.end) {
            return node.value;
        } else if (end <= node.left.end) {
            return range(node.left, start, end);
        } else if (start >= node.right.start) {
            return range(node.right, start, end);
        } else {
            return range(node.left, start, node.left.end) + range(node.right, node.right.start, end);
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
            System.out.println("|------>[" + node.value +"]");
        } else {
            System.out.println("[" + node.value + "]");
        }
        display(node.left, level + 1);
    }

    private static class Node {
        int value;
        int start;
        int end;
        Node left;
        Node right;

        private Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}

class Main {
    public static void main(String[] args) {
        SegmentTree st = new SegmentTree();
        int[] arr = new int[]{2, 7, 8, -1, 3, 6, 1, 9};
        st.populate(arr);
        st.display();
        System.out.println("-------------------------------");
//        st.update(7, 12);
//        st.display();
        System.out.println(st.range(0, 3));
    }
}
