package LinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public CustomLinkedList() {
        this.size =0;
    }
    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null) {
            tail=head;
        }
        size++;
    }
    public void addLast(int val) {
        if(tail==null) {
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addAtIndex(int index, int val) {
        if(index==0) {
            addFirst(val);
            return;
        }
        if(index==size) {
            addLast(val);
            return;
        }
        Node temp = head;
        int num=1;
        while(num<index) {
            temp = temp.next;
            num++;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head==null) {
            tail.next =null;
        }
        size--;
        return val;
    }
    public int deleteLast() {
        if(size<=1) {
            deleteFirst();
        }
        int val = tail.value;
        Node secondLast = getNode(size-2);
        tail = secondLast;
        secondLast.next =null;
        size--;
        return val;
    }

    public int deleteAtIndex(int index) {
        if (index==0) {
            return deleteFirst();
        }
        if(index==size-1) {
            return deleteLast();
        }
        Node nodePrevious = getNode(index-1);
        Node node = getNode(index);
        nodePrevious.next = node.next;
        size--;
        return node.value;

    }
    public Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }
    // get node from node value
    public Node getNodeFromValue(int value) {
        Node node = head;
        while(node!=null) {
            if (node.value==value) {
                return node;
            }
            node=node.next;
        }
        return null;
    }
//    public int get() {
//        return tail.value;
//    }
    public int size() {
        return size;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value =value;
        }
        public Node(int value, Node next) {
            this.value =value;
            this.next = next;
        }
    }
}
