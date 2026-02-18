package Trees.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomBinaryTree {
    Node root;

    public CustomBinaryTree() {
        root = null;
    }

    public void populate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the root node value : ");
        root = new Node(scan.nextInt());
        populate(root, scan);
    }

    public void populate(Node node, Scanner scan) {
        System.out.println("Enter true if you want to enter the value for left of node value " + node.value + " or false to skip it : ");
        boolean left = scan.nextBoolean();
        if (left) {
            System.out.println("Enter the left node value for the node " + node.value + " : ");
            node.left = new Node(scan.nextInt());
            populate(node.left, scan);
        }
        System.out.println("Enter true if you want to enter the value for right of node value " + node.value + " or false to skip it : ");
        boolean right = scan.nextBoolean();
        if (right) {
            System.out.println("Enter the right node value for the node " + node.value + " : ");
            node.right = new Node(scan.nextInt());
            populate(node.right, scan);
        }
    }

    public void displayBFS() {
        Queue<Node> list = new LinkedList<>();
        displayBFS(root, list);
        System.out.println("End");
    }

    private void displayBFS(Node node, Queue<Node> list) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + "->");
        if (node.left != null) {
            list.add(node.left);
        }
        if (node.right != null) {
            list.add(node.right);
        }
        displayBFS(list.poll(), list);
    }

    public void display() {
        display(root, "");
    }

    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        display(node.right, indent + "\t");
        System.out.println("" + indent + node.value);
        display(node.left, indent + "\t");
    }

    public void display1() {
        display1(root, 0);
    }

    public void display1(Node node, int level) {
        if (node == null) {
            return;
        }
        display1(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        } else {
            System.out.println(node.value);
        }
        display1(node.left, level + 1);
    }

    private static class Node {
        int value;
        Node left, right;

        private Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
