import java.util.*;
public class MergekSortedLists {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public Node mergetwoLists(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node A = list1;
        Node B = list2;
        Node curr = dummy;
        while (A != null && B != null) {
            if (A.data < B.data) {
                curr.next = A;
                A = A.next;
            }
            else {
                curr.next = B;
                B = B.next;
            }
            curr = curr.next;
        }
        if (A != null) {
            curr.next = A;
        }
        if (B != null) {
            curr.next = B;
        }
        return dummy.next;
    }

    public Node mergeLists(Node[] lists) {
        if(lists==null || lists.length==0) {
            return null;
        }
        Node result=lists[0];
        for(int i=1;i<lists.length;i++) {
            result=mergetwoLists(result,lists[i]);
        }
        return result;
    }

    public Node createLL(int n, Scanner sc) {
        Node head = null;
        Node temp = null;
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                temp = newNode;
            }
            else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        return head;
    }

    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        MergekSortedLists msl = new MergekSortedLists();
        Node list1 = msl.createLL(n1, sc);
        Node list2 = msl.createLL(n2, sc);
        Node list3 = msl.createLL(n3, sc);
        System.out.println("List1:");
        msl.printList(list1);
        System.out.println("List2:");
        msl.printList(list2);
        System.out.println("List3:");
        msl.printList(list3);
        Node[] lists = {list1, list2, list3};
        System.out.println("Merged List:");
        Node merged = msl.mergeLists(lists);
        msl.printList(merged);
    }
}
