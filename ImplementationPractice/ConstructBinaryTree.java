package ImplementationPractice;

import java.util.Scanner;

public class ConstructBinaryTree {

    private Scanner sc = new Scanner(System.in);
    private Node root;

    private class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public ConstructBinaryTree() {
        this.root = constructTree();
    }

    private Node constructTree() {
        int val = sc.nextInt();
        if (val == -1) {
            return null;
        }
        Node nn = new Node(val);
        nn.left = constructTree();
        nn.right = constructTree();
        return nn;
    }

    public void display() {
        display(root);
    }

    private void display(Node root) {
        if (root == null) {
            return;
        }
        String str = "";
        if (root.left != null) {
            str += root.left.val;
        } else {
            str += " * ";
        }
        str += " -> " + root.val + " <- ";
        if (root.right != null) {
            str += root.right.val;
        } else {
            str += " * ";
        }
        System.out.println(str);
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        ConstructBinaryTree bt = new ConstructBinaryTree();
//        10 20 -1 40 -1 -1 50 60 -1 -1 -1
        bt.display();
    }
}
