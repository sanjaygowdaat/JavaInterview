package Trees.BinarySearchTree;

import java.util.Scanner;

public class BST {
    private Node root;

    public BST() {
        this.root = null;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }
        if (val < node.value) {
             node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

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
            System.out.println("|------>" + node.value);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }

    public void display1() {
        display1(root, "Root node : ");
    }

    private void display1(Node node, String message) {
        if (node == null) {
            return;
        }
        System.out.println(message + node.value);
        display1(node.left, "Left of node " + node.value + " : ");
        display1(node.right, "Right of node " + node.value + " : ");
    }

    public void populate(int[] input) {
        for (int i = 0; i < input.length; i++) {
            this.insert(input[i]);
        }
    }

    public void populateSorted(int[] input) {
        populateSorted(input, 0, input.length - 1);
    }

    private void populateSorted(int[] input, int start, int end) {
        if (start > end) {
            return;
        }
        int mid = (end - start)/2 + start;
        this.insert(input[mid]);
        populateSorted(input, start, mid - 1);
        populateSorted(input, mid + 1, end);
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
        System.out.println("Pre-Order Traversal");
    }

    private void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + "-> ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
        System.out.println("In-Order Traversal");
    }

    private void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.value + "-> ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
        System.out.println("Post-Order Traversal");
    }

    private void postOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + "-> ");
    }

    // display method for displaying the height of each node as well.
    /*private void display(Node node, int level) {
        if (node == null) {
            return;
        }
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("\t\t");
            }
            System.out.println("|------>" + node.value + " " + node.height);
        } else {
            System.out.println(node.value + " " + node.height);
        }
        display(node.left, level + 1);
    }
*/
    public boolean isEmpty() {
        return root == null;
    }

    private static class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        private Node(int value) {
            this.value = value;
        }

        private int getValue() {
            return this.value;
        }
    }
}

class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(20);
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(30);
        bst.insert(25);
        bst.insert(35);
//        bst.insert(45);
//        bst.insert(34);
//        bst.insert(6);
//        bst.insert(4);
        bst.display();
        System.out.println("Is balanced : " + bst.isBalanced());

        bst.preOrderTraversal();
        bst.inOrderTraversal();
        bst.postOrderTraversal();

//        BST bst1 = new BST();
//        int[] input = new int[]{20, 10, 30, 5, 4, 6, 15, 25, 35, 14, 16, 24, 26, 34, 36};
//        bst1.populate(input);
//        bst1.display();
//        System.out.println("Is balanced : " + bst1.isBalanced());

//        BST bst2 = new BST();
//        int[] input1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        bst2.populateSorted(input1);
//        bst2.display();
//        System.out.println("Is balanced : " + bst2.isBalanced());
//        bst2.display1();
    }
}
