import java.util.*;
public class MiddleNode {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val=val;
            this.next=null;
        }
    }

    public Node middleNode(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
        MiddleNode middle=new MiddleNode();
        int n=sc.nextInt();
        Node head=null;
        Node temp=head;
        for(int i=0;i<n;i++) {
            int val=sc.nextInt();
            Node newNode = new Node(val);
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
        middle.printList(head);
        head=middle.middleNode(head);
        System.out.println("Linked list from Middle node:");
        middle.printList(head);
    }
}
