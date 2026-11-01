import java.util.*;
public class RemoveNthNodeFromTheList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
    
    public Node removeNthNode(Node head, int pos) {
        int count=0;
        Node temp=head;
        while(temp!=null) {
            count++;
            temp=temp.next;
        }
        if(pos<=0 || pos>count) {
            return head;
        }
        if(pos==count) {
            head=head.next;
            return head;
        }
        temp=head;
        int diff=count-pos;
        for(int i=1;i<diff;i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
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
        RemoveNthNodeFromTheList rnn=new RemoveNthNodeFromTheList();
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
        rnn.printList(head);
        int pos=sc.nextInt();
        head=rnn.removeNthNode(head,pos);
        System.out.println("List after removing "+pos+"th node from the end:");
        rnn.printList(head);
    }
}
