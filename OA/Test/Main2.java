package OA.Test;

import java.util.*;

public class Main2 {
    private Node root;
    private int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};

    private class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Main2() {
        this.root = constructTree();
    }

    public Node constructTree() {
        return constructTree(arr, 0, arr.length);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node nn = new Node(arr[mid]);
        nn.left = constructTree(arr, start, mid);
        nn.right = constructTree(arr, mid + 1, end);
        return nn;
    }

    public void display() {
        display(root);
    }

    private void display(Node root) {
        if (root == null) {
            return;
        }
        List<String> binaryTree = new ArrayList<>();
        if (root.left != null) {
            binaryTree.add("" + root.left.val);
        } else {
            binaryTree.add("*");
        }

        binaryTree.add("->" + root.val + "<-");

        if (root.right != null) {
            binaryTree.add("" + root.right.val);
        } else {
            binaryTree.add("*");
        }
        System.out.println(binaryTree);
        display(root.left);
        display(root.right);
    }


    public static void main(String[] args) {
        Main2 ob = new Main2();
        ob.constructTree();
        ob.display();

//        ArrayList<Integer> listOfNodes = new ArrayList<>();
//        inOrderTraversal(root, listOfNodes);
    }

    private static void inOrderTraversal(Node root, ArrayList<Integer> listOfNodes) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, listOfNodes);
        listOfNodes.add(root.val);
        inOrderTraversal(root.right, listOfNodes);
    }
}
