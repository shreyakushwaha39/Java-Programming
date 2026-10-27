import java.util.*;
public class ReverseLinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val=val;
            this.next=null;
        }
    }

    public Node reverseList(Node head) {
        Node prev=null;
        Node curr=head;
        while(curr!=null) {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
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
        ReverseLinkedList rll=new ReverseLinkedList();
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
        System.out.println("Original list:");
        rll.printList(head);
        head=rll.reverseList(head);
        System.out.println("Reversed list:");
        rll.printList(head);
    }
}
