package PracticePrograms.Practice01;

public class AVLTreee {
    private Node root;

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    private int balanceFactor(Node node) {
        return getHeight(node.left) - getHeight(node.right);
    }

    private Node leftRotation(Node node) {
        Node newRoot = node.right;
        node.right = newRoot.left;
        newRoot.left = node;
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        newRoot.height = Math.max(getHeight(newRoot.left), getHeight(newRoot.right)) + 1;
        return newRoot;
    }

    private Node rightRotation(Node node) {
        Node newRoot = node.left;
        node.left = newRoot.right;
        newRoot.right = node;
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        newRoot.height = Math.max(getHeight(newRoot.left), getHeight(newRoot.right)) + 1;
        return newRoot;
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    private Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.val) {
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        // Right case
        if (balanceFactor(node) < -1) {
            // Right-left case
            if (balanceFactor(node.right) > 0) {
                node.right = rightRotation(node.right);
                return leftRotation(node);
            }
            // Right-Right case
            else {
                return leftRotation(node);
            }
        }
        // Left case
        else if (balanceFactor(node) > 1) {
            // Left-Left case
            if (balanceFactor(node.left) > 0) {
                return rightRotation(node);
            }
            // Left-Right case
            else {
                node.left = leftRotation(node.left);
                return rightRotation(node);
            }
        }

        return node;
    }

    public void display() {
        display(root, 0);
    }

    private void display(Node node,int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("\t\t");
            }
            System.out.println("|---->[" + node.val + "]");
        } else {
            System.out.println(node.val);
        }
        display(node.left, level + 1);
    }

    static class Node {
        Node left;
        Node right;
        int val;
        int height;

        public Node(int val) {
            this.val = val;
        }
    }

}

class Main {
    public static void main(String[] args) {
        AVLTreee avl = new AVLTreee();
        avl.insert(25);
        avl.insert(75);
        avl.insert(50);
        avl.insert(8);
        avl.insert(18);
        avl.insert(30);
        avl.insert(40);
        avl.insert(65);
        avl.insert(55);
        avl.insert(70);
        avl.insert(80);
        avl.insert(150);
        avl.insert(100);
        avl.insert(12);
        avl.insert(35);
        avl.display();
    }
}
