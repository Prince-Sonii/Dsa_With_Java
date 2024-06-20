package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list1 = new CustomLinkedList();
        list1.addFirst(5);
        list1.addFirst(4);
        list1.addFirst(3);
        list1.addFirst(2);
        list1.addFirst(1);
        list1.addLast(6);
        list1.addAtIndex(4,9);
        list1.display();
        System.out.println(list1.deleteFirst());
        list1.display();
        System.out.println(list1.deleteLast());
        list1.display();
        System.out.println(list1.deleteAtIndex(0));
        list1.display();

    }
}
