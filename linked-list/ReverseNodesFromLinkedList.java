import java.util.*;
public class ReverseNodesFromLinkedList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node compute(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        head = reverse(head);
        int max = head.data;
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.data < max) {
                curr.next = curr.next.next;

            } 
            else {
                max = curr.next.data;
                curr = curr.next;
            }
        }
        head = reverse(head);
        return head;
    }

    public void printList(Node head) {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ReverseNodesFromLinkedList rnfl=new ReverseNodesFromLinkedList();
        int n=sc.nextInt();
        Node head=null;
        Node temp=head;
        for(int i=0;i<n;i++){
            int data=sc.nextInt();
            Node newNode=new Node(data);
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
        rnfl.printList(head);
        System.out.println("Reversed linked List after removing nodes:");
        Node reversedList=rnfl.compute(head);
        rnfl.printList(reversedList);
    }
}
