import java.util.*;
public class DeleteTheMiddleNodeOfTheLInkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public Node deleteMiddle(Node head) {
        if(head==null || head.next==null) {
            return null;
        }
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null) {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
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
        DeleteTheMiddleNodeOfTheLInkedList dmn=new DeleteTheMiddleNodeOfTheLInkedList();
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
        dmn.printList(head);
        head=dmn.deleteMiddle(head);
        System.out.println("List after deleting middle node:");
        dmn.printList(head);
    }
}
