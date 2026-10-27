import java.util.*;
public class LinkedListCycle {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val=val;
            this.next=null;
        }
    }

    public boolean ListCycle(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                return true;
            }
        }
        return false;
    }

    public void printList(Node head) {
        Node curr=head;
        while(curr!=null) {
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedListCycle llc=new LinkedListCycle();
        int n=sc.nextInt();
        Node head=null;
        Node temp=head;
        for(int i=0;i<n;i++) {
            int val=sc.nextInt();
            Node newNode=new Node(val);
            if(head==null) {
                head=newNode;
                temp=newNode;
            }
            else{
                temp.next=newNode;
                temp=newNode;
            }
        }
        int pos=sc.nextInt();
        if(pos>=0 && pos<n) {
            Node curr=head;
            for(int i=0;i<pos;i++) {
                curr=curr.next;
            }
            temp.next=curr;
        }
        System.out.println("Original list:");
        llc.printList(head);      
        boolean hasCycle=llc.ListCycle(head);
        System.out.println("Does the linked list have a cycle? "+hasCycle);
    }
}
