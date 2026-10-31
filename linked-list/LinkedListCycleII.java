import java.util.*;
public class LinkedListCycleII {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public Node detectCycle(Node head) {
        if(head==null || head.next==null) {
            return null;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                slow=head;
                while(slow!=fast) {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
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
        LinkedListCycleII ll=new LinkedListCycleII();
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
        ll.printList(head);
        int pos=sc.nextInt();
        if(pos>=0 && pos<n) {
            Node curr=head;
            for(int i=0;i<pos;i++) {
                curr=curr.next;
            }
            temp.next=curr;
        }
        Node cycleNode=ll.detectCycle(head);
        if(cycleNode!=null) {
            System.out.println("Cycle detected at node with value: "+cycleNode.data);
        }
        else{
            System.out.println("No cycle detected.");
        }
    }
}
