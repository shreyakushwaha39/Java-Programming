import java.util.*;
public class RemoveDuplicatesFromSortedListII {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val=val;
            this.next=null;
        }
    }

    public Node removeDuplicatesII(Node head) {
        if(head==null || head.next==null) {
            return head;
        }
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        Node temp=head;
        while(temp!=null && temp.next!=null) {
            if(temp.next!=null && temp.val==temp.next.val) {
                while(temp.next!=null && temp.val==temp.next.val) {
                    temp=temp.next;
                }
                prev.next=temp.next;
            }
            else {
                prev=temp;
            }
            temp=temp.next;
        }
        return dummy.next;
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
        RemoveDuplicatesFromSortedListII rd=new RemoveDuplicatesFromSortedListII();
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
        rd.printList(head);
        System.out.println("List after removing duplicates: ");
        Node duplicates=rd.removeDuplicatesII(head);
        rd.printList(duplicates);
    }

}
