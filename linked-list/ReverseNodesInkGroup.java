import java.util.*;
public class ReverseNodesInkGroup {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public Node reverseKGroup(Node head, int k) {
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        while(true) {
            Node temp=prev;
            for(int i=0;i<k && temp!=null;i++) {
                temp=temp.next;
            }
            if(temp==null) {
                break;
            }
            Node first=prev.next;
            for(int i=0;i<k-1;i++) {
                Node second=first.next;
                first.next=second.next;
                second.next=prev.next;
                prev.next=second;
            }
            prev=first;
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
        ReverseNodesInkGroup rnk=new ReverseNodesInkGroup();
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
        int k=sc.nextInt();
        System.out.println("Original list:");
        rnk.printList(head);
        System.out.println("List after reversing nodes in k-group:");
        Node reversedHead=rnk.reverseKGroup(head,k);
        rnk.printList(reversedHead);
    }
}
