package dsa;

public class LinkedList {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    public int size() {
        Node i = head;
        int count = 0;
        while (i != null) {
            count++;
            i = i.next;
        }
        return count;
    }

    public void display() {
        Node i = head;
        while (i != null) {
            System.out.print(i.val + " ");
            i = i.next;
        }
    }

    public void addAtFirst(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
    }

    public void addAtLast(int val) throws Exception {
        Node temp = new Node(val);
        if (head == null) {
            addAtFirst(val);
        } else {
            Node curr = getNodeAtAnyIndex(size() - 1);
            curr.next = temp;
        }
    }

    public void addAtIndex(int idx, int val) throws Exception {
        if (idx < 0 || idx > size()) {
            throw new Exception("Wrong Index");
        }
        if (idx == 0) {
            addAtFirst(val);
        } else if (idx == size()) {
            addAtLast(val);
        } else {
            Node temp = new Node(val);
            Node i = head;
            for (int j = 0; j < idx - 1; j++) {
                i = i.next;//3k
            }
            Node flag = i.next;//5k
            i.next = temp;//12k
            temp.next = flag;//5k

//            Node temp = new Node(val);
//            Node preIndex = getNodeAtAnyIndex(idx - 1);
//            Node currIndex = getNodeAtAnyIndex(idx);
//            preIndex.next = temp;
//            temp.next = currIndex;
        }
    }

    public int getAtFirst() throws Exception {
        if (head == null) {
            throw new Exception("LinkedList is Empty");
        }
        return head.val;
    }

    public int getAtLast() throws Exception {
        if (head == null) {
            throw new Exception("LinkedList is Empty");
        }
        Node i = head;
        while (i.next != null) {
            i = i.next;
        }
        return i.val;
    }

    public int getAtAnyIndex(int index) throws Exception {
        if (head == null) {
            throw new Exception("LinkedList is Empty");
        }
        if (index < 0 || index >= size()) {
            throw new Exception("Wrong Index");
        }
        Node i = head;
        for (int j = 0; j < index; j++) {
            i = i.next;
        }
        return i.val;
    }

    public Node getNodeAtAnyIndex(int index) throws Exception {
        if (head == null) {
            throw new Exception("LinkedList is Empty");
        }
        if (index < 0 || index >= size()) {
            throw new Exception("Wrong Index");
        }
        Node i = head;
        for (int j = 0; j < index; j++) {
            i = i.next;
        }
        return i;
    }

    public Node swapPairs() {
        Node curr = head;
        while (curr != null && curr.next != null) {
            int temp = curr.val;
            curr.val = curr.next.val;
            curr.next.val = temp;
            curr = curr.next.next;
        }
        return head;
    }

    public Node oddEvenList(Node head) {
        if (head == null) return null;
        Node odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
