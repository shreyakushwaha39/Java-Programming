import java.util.*;
public class MaximumTwinSumOfALinkedList {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val=val;
            this.next=null;
        }
    }
    
    //HashSet<Integer> set=new HashSet<>();
    public int maxTwinSum(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev=null;
        Node curr=slow;
        while(curr!=null) {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        int maxTwinSum=0;
        while(right!=null) {
            int sum=left.val+right.val;
            //set.add(sum);
            maxTwinSum=Math.max(maxTwinSum,sum);
            left=left.next;
            right=right.next;
        }
        //int max=Collections.max(set);
        return maxTwinSum;
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
        MaximumTwinSumOfALinkedList mt=new MaximumTwinSumOfALinkedList();
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
        mt.printList(head);
        int maxTwinSum=mt.maxTwinSum(head);
        System.out.println("Maximum twin sum: "+maxTwinSum);
    }
}
