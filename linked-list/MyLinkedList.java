import java.util.*;
class MyLinkedList {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    Node head;
    int size;
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node curr=head;
        while(curr!=null && curr.next!=null){
            curr = curr.next;
        }
        if (curr == null) {
            head = newNode;
        } else {
            curr.next = newNode;
        }
        size++;
    }
    public void addAtIndex(int index, int val) {
        if (index<0 || index>size) {
            return;
        }
        if (index==0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyLinkedList list = new MyLinkedList();
        List<Integer> obj = new ArrayList<>();
        obj.add(null);
        int val1=sc.nextInt();
        list.addAtHead(val1);
        obj.add(null);
        int val2=sc.nextInt();
        list.addAtTail(val2);
        obj.add(null);
        int index1=sc.nextInt();
        int val3=sc.nextInt();
        list.addAtIndex(index1, val3);
        obj.add(null);
        obj.add(list.get(index1));
        int index2=sc.nextInt();
        list.deleteAtIndex(index2);
        obj.add(null);
        obj.add(list.get(index2));
        System.out.println(obj);
    }
}
