import java.util.*;
public class ReverseLinkedListII {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public Node reverseBetween(Node head, int left, int right) {
        if(head==null || left==right) {
            return head;
        }
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        for(int i=1;i<left;i++) {
            prev=prev.next;
        }
        Node curr=prev.next;
        for(int i=0;i<right-left;i++) {
            Node next=curr.next;
            curr.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return dummy.next;
    }

    public void printList(Node head) {
        Node curr=head;
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReverseLinkedListII rll=new ReverseLinkedListII();
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
        int left=sc.nextInt();
        int right=sc.nextInt();
        System.out.println("Original list:");
        rll.printList(head);
        head=rll.reverseBetween(head, left, right);
        System.out.println("Reversed list:");
        rll.printList(head);
    }
}
