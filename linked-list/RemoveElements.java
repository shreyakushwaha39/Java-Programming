import java.util.*;
public class RemoveElements {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node removeElements(Node head, int val) {
        while(head!=null && head.val==val) {
            head=head.next;
        }
        Node curr=head;
        while(curr!=null && curr.next!=null) {
            if(curr.next.val==val) {
                curr.next=curr.next.next;
            }
            else {
                curr=curr.next;
            }
        }
        return head;
    }

    public void printlist(Node head) {
        Node curr=head;
        while(curr!=null) {
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
        System.out.println("null");
    } 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RemoveElements remove=new RemoveElements();
        int n=sc.nextInt();
        Node head=null;
        Node temp=head;
        for(int i=0;i<n;i++) {
            int val=sc.nextInt();
            Node newNode= new Node(val);
            if(head==null) {
                head=newNode;
                temp=newNode;
            }
            else {
                temp.next=newNode;
                temp=newNode;
            }
        }
        remove.printlist(head);
        int valToRemove=sc.nextInt();
        head=remove.removeElements(head, valToRemove);
        remove.printlist(head);
    }
}
