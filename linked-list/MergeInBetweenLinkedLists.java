import java.util.*;
public class MergeInBetweenLinkedLists {
    static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data=data;
            this.next=null;
        }
    }

    public Node mergeInBetween(Node list1,int a,int b,Node list2) {
        Node dummy=new Node(0);
        dummy.next=list1;
        Node curr=dummy;
        Node A=list1;
        Node B=list2;
        for(int i=0;i<a;i++) {
            curr=A;
            A=A.next;
        }
        for(int i=a;i<=b;i++) {
            A=A.next;
        }
        curr.next=B;
        while(B.next!=null) {
            B=B.next;
        }
        B.next=A;
        return dummy.next;
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
        int a=sc.nextInt();
        int b=sc.nextInt();
        MergeInBetweenLinkedLists msl = new MergeInBetweenLinkedLists();
        Node list1 = msl.createLL(n1, sc);
        Node list2 = msl.createLL(n2, sc);
        System.out.println("List1:");
        msl.printList(list1);
        System.out.println("List2:");
        msl.printList(list2);
        System.out.println("Merged List:");
        Node merged = msl.mergeInBetween(list1,a,b,list2);
        msl.printList(merged);
    }
}
