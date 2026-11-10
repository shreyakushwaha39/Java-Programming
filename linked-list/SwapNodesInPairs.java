import java.util.*;
public class SwapNodesInPairs {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public Node swapPairs(Node head) {
        if(head==null || head.next==null) {
            return head;
        }
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        while(prev.next!=null && prev.next.next!=null) {
            Node first=prev.next;
            Node second=first.next;
            first.next=second.next;
            second.next=first;
            prev.next=second;
            prev=first;
        }
        return dummy.next;
    }

    public void printList(Node head) {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SwapNodesInPairs snp=new SwapNodesInPairs();
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
            else {
                temp.next=newNode;
                temp=newNode;
            }
        }
        System.out.println("Original list:");
        snp.printList(head);
        System.out.println("List after swapping nodes in pairs:");
        Node swappedHead=snp.swapPairs(head);
        snp.printList(swappedHead);
    }
}
