package linkedlist;

public class LinkedList {

    class Node {
        int val;
        Node next;// address of next Node

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    public int size() {
        int ct = 0;
        Node i = head;
        while (i != null) {
            ct++;
            i = i.next;
        }
        return ct;
    }

    public void display() {
        Node i = head;
        while (i != null) {
            System.out.print(i.val + "->");
            i = i.next;
        }

        System.out.println();
    }

    public void addAtFirst(int val) {
        Node nn = new Node(val);
        nn.next = head;
        head = nn;
    }

    public void addAtLast(int val) throws Exception {
        Node nn = new Node(val);
        if (head == null) {
            addAtFirst(val);
        } else {
            Node curr = getNodeAtIndex(size() - 1);
            curr.next = nn;
        }
    }

    public int getFirst() throws Exception {
        if (head == null) {
            throw new Exception("Linked list khaali hai!");
        }
        return head.val;// null.val
    }

    public int getLast() throws Exception {
        if (head == null) {
            throw new Exception("Linked list khaali hai!");
        }
        Node i = head;
        while (i.next != null) {
            i = i.next;
        }

        return i.val;
    }

    public int getAtIndex(int idx) throws Exception {
        if (head == null) {
            throw new Exception("Linked list khaali hai!");
        }

        if (idx < 0 || idx >= size()) {
            throw new Exception("Galat index hai bhai!");
        }
        Node i = head;
        for (int it = 1; it <= idx; it++) {
            i = i.next;
        }
        return i.val;
    }

    public void addAtIndex(int value, int idx) throws Exception {
        if (idx < 0 || idx > size()) {
            throw new Exception("Galat index hai bhai!");
        }

        if (idx == 0) {
            addAtFirst(value);
        } else if (idx == size()) {
            addAtLast(value);
        } else {
            Node nn = new Node(value);
            Node idx_1N = getNodeAtIndex(idx - 1);
            Node idxN = getNodeAtIndex(idx);

            idx_1N.next = nn;
            nn.next = idxN;
        }
    }

    public Node getNodeAtIndex(int idx) throws Exception {
        if (head == null) {
            throw new Exception("Linked list khaali hai!");
        }

        if (idx < 0 || idx >= size()) {
            throw new Exception("Galat index hai bhai!");
        }
        Node i = head;
        for (int it = 1; it <= idx; it++) {
            i = i.next;
        }

        return i;// node ka address
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int deleteFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Khaali hai LinkedList!");
        }
        Node i = head;
        head = head.next;
        i.next = null;
        return i.val;
    }

    public int deleteLast() throws Exception {
        if (size() == 1) {
            return deleteFirst();
        } else {
            Node last_1 = getNodeAtIndex(this.size() - 2);
            Node last = last_1.next;
            int temp = last.val;
            last_1.next = null;
            return temp;
        }
    }

    public int deleteAtIndex(int idx) throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Khaali hai LinkedList!");
        }

        if (idx >= size()) {
            throw new Exception("Galat Index!");
        }
        if (idx == 0) {
            return deleteFirst();
        } else {
            Node idx_1 = getNodeAtIndex(idx - 1);
            Node idxN = idx_1.next;
            Node idxPlus1 = idx_1.next.next;
            idxN.next = null;
            idx_1.next = idxPlus1;
            return idxN.val;
        }
    }

    public void reverseActual() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Empty hai!");
        }
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }

        head = prev;
    }

    public int midPointVal() {
        return midPointNode().val;
    }

    public Node midPointNode() {
        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;//f -> last node, f.next = null, null.next = npe
        }
        return s;
    }

    public int kthNodeFromLast(int k) {
        Node s = head;
        Node f = head;

        for (int i = 1; i <= k; i++) {
            f = f.next;
        }
        //bacha hua distance = n - k for fast
        while (f != null) {
            s = s.next;
            f = f.next;
        }

        return s.val;
    }

    public void cycleCreate() {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = head.next;
    }

    public boolean cycleDetection() {
        Node s = head;
        Node f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;//f == null, f.next = npe, f.next = null, null.next = npe

            if (s == f) {
                return true;
            }
        }
        return false;
    }

    public LinkedList mergeTwoSortedLL(LinkedList a, LinkedList b) throws Exception {
        LinkedList c = new LinkedList();

        Node t1 = a.head;
        Node t2 = b.head;

        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                c.addAtLast(t1.val);
                t1 = t1.next;
            } else {
                c.addAtLast(t2.val);
                t2 = t2.next;
            }
        }

        while (t2 != null) {
            c.addAtLast(t2.val);
            t2 = t2.next;
        }

        while (t1 != null) {
            c.addAtLast(t1.val);
            t1 = t1.next;
        }
        return c;
    }

    public void oddEvenList() {
        if (head == null) {
            return;
        }
        Node odd = head;
        Node even = head.next;
        Node evenFirst = even;

        while (true) {
            if (odd == null || even == null || even.next == null) {
                odd.next = evenFirst;
                break;
            }
            odd.next = even.next;
            odd = even.next;
            if (odd.next == null) {
                even.next = null;
                odd.next = evenFirst;
                break;
            }

            even.next = odd.next;
            even = odd.next;
        }
        while (head != null) {
            System.out.print(head.val + "-");
            head = head.next;
        }
    }

    public void oddList() {
        Node oddList = head;
        Node temp = head;
        while (temp != null) {
            System.out.print(oddList.val + "-");
            oddList.next = temp.next.next;
            oddList = oddList.next;
            temp = temp.next;
        }
    }
}
