import java.util.*;
public class RemoveDuplicatesFromUnsortedList {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val=val;
            this.next=null;
        }
    }

    public Node remmoveDuplicates(Node head) {
        if(head==null || head.next==null) {
            return head;
        }
        HashSet<Integer> set=new HashSet<>();
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        Node curr=head;
        while(curr!=null) {
            if(set.contains(curr.val)) {
                prev.next=curr.next;
            }
            else {
                set.add(curr.val);
                prev=curr;
            }
            curr=curr.next;
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
        RemoveDuplicatesFromUnsortedList rd=new RemoveDuplicatesFromUnsortedList();
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
        Node duplicates=rd.remmoveDuplicates(head);
        rd.printList(duplicates);
    }
}
