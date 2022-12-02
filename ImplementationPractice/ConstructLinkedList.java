package ImplementationPractice;

public class ConstructLinkedList {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    public int size() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void addAtFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void addAtLast(int val) {
        Node nn = new Node(val);
        if (head == null) {
            addAtFirst(val);
        } else {
            Node temp = head;
            for (int i = 0; i < size() - 1; i++) {
                temp = temp.next;
            }
            temp.next = nn;
        }
    }

    public static void main(String[] args) {
        ConstructLinkedList ll = new ConstructLinkedList();
//        ll.addAtLast(10);
//        ll.addAtLast(20);
//        ll.addAtLast(30);
//        ll.addAtLast(40);
//        ll.addAtLast(50);
        ll.addAtFirst(10);
        ll.addAtFirst(100);
        ll.addAtFirst(1000);
        ll.display();
    }
}
