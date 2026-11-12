import java.util.*;
public class ReverseEvenLengthGroups {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public Node reverseNode (Node head) {
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        int size=1;
        while(prev.next!=null) {
            Node curr=prev.next;
            Node temp=curr;
            int count=0;
            while(temp!=null && count<size) {
                count++;
                temp=temp.next;
            }
            if(count%2==0) {
                Node start=curr;
                Node previous=temp;
                for(int i=0;i<count;i++) {
                    Node nxt=curr.next;
                    curr.next=previous;
                    previous=curr;
                    curr=nxt;
                }
                prev.next=previous;
                prev=start;
            }
            else {
                for(int i=0;i<count;i++) {
                    prev=prev.next;
                }
            }
            size++;
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
        ReverseEvenLengthGroups rn=new ReverseEvenLengthGroups();
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
        rn.printList(head);
        Node reverse=rn.reverseNode(head);
        System.out.println("Reversed list:");
        rn.printList(reverse);
    }
}
