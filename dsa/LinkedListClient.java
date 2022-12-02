package dsa;

public class LinkedListClient {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.addAtFirst(10);
        ll.addAtFirst(20);
        ll.addAtFirst(30);
        ll.addAtFirst(40);
        ll.addAtFirst(50);
//        ll.addAtLast(10);
//        ll.addAtIndex(0, 100);

        ll.display();
        System.out.println();
//        System.out.println("Size -> " + ll.size());
//        System.out.println("First -> " + ll.getAtFirst());
//        System.out.println("Last -> " + ll.getAtLast());
//        System.out.println("Index -> " + ll.getAtAnyIndex(2));
    }
}
