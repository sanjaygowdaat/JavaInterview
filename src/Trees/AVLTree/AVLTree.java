package Trees.AVLTree;

public class AVLTree {
    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public int balanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        return (height(node.left) - height(node.right));
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node leftRotation(Node node) {
        Node newPivot = node.right;
        node.right = newPivot.left;
        newPivot.left = node;
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        newPivot.height = Math.max(height(newPivot.left), height(newPivot.right)) + 1;
        return newPivot;
    }

    private Node rightRotation(Node node) {
        Node newPivot = node.left;
        node.left = newPivot.right;
        newPivot.right = node;
        // notice why height of parent node is updated before newPivot
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        newPivot.height = Math.max(height(newPivot.left), height(newPivot.right)) + 1;
        return newPivot;
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        } else if (value < node.value) {
            node.left = insert(node.left, value);
        } else if(value > node.value) {
            node.right = insert(node.right, value);
        }
        // node height is updated first before going on to calculate balance factor for the node
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        if (balanceFactor(node) > 1) {
            // left-left case
            if (balanceFactor(node.left) > 0) {
                return rightRotation(node);
            }
            // left-right case
            if (balanceFactor(node.left) < 0) {
                node.left = leftRotation(node.left);
                return rightRotation(node);
            }
        }

        if (balanceFactor(node) < -1) {
            // right-right case
            if (balanceFactor(node.right) < 0) {
                return leftRotation(node);
            }
            // right-left case
            if (balanceFactor(node.right) > 0) {
                node.right = rightRotation(node.right);
                return leftRotation(node);
            }
        }
        return node;
    }

    public void display() {
        display(root, 0);
    }

    private void display(Node node, int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        for (int i = 0; i < level - 1; i++) {
            System.out.print("\t\t");
        }
        if (level == 0) {
            System.out.println(node.value);
        } else {
            System.out.println("|------>" + node.value);
        }
        display(node.left, level + 1);
    }

    private static class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        private Node(int value) {
            this.value = value;
            this.height = 0;
        }
    }
}

class Main {
    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        avl.insert(75);
        avl.insert(25);
        avl.insert(38);
        avl.insert(12);
        avl.insert(62);
        avl.insert(50);
        avl.insert(88);
        avl.insert(81);
        avl.insert(95);
        avl.insert(70);
        avl.insert(56);
        avl.insert(45);
        avl.insert(30);
        avl.insert(10);
        avl.insert(18);
        avl.display();
    }
}
