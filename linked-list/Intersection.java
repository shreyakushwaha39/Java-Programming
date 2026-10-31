import java.util.*;
public class Intersection {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val=val;
            this.next=null;
        }
    }

    public int count(Node head) {
        int count=0;
        Node curr=head;
        while(curr!=null) {
            count++;
            curr=curr.next;
        }
        return count;
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        int countA = count(headA);
        int countB = count(headB);

        Node slow = headA;
        Node fast = headB;
        if (countA > countB) {
            fast = headA;
            slow = headB;
        }
        for (int i = 0; i < Math.abs(countA - countB); i++) {
            fast = fast.next;
        }

        while(slow!=null && fast!=null) {
            if(slow==fast) {
                return slow;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return null;
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
        Intersection intersection=new Intersection();
        int n1=sc.nextInt();
        Node headA=null;
        Node tempA=headA;
        for(int i=0;i<n1;i++) {
            int val=sc.nextInt();
            Node newNode=new Node(val);
            if(headA==null) {
                headA=newNode;
                tempA=newNode;
            }
            else{
                tempA.next=newNode;
                tempA=newNode;
            }
        }
        int n2=sc.nextInt();
        Node headB=null;
        Node tempB=headB;
        for(int i=0;i<n2;i++) {
            int val=sc.nextInt();
            Node newNode=new Node(val);
            if(headB==null) {
                headB=newNode;
                tempB=newNode;
            }
            else{
                tempB.next=newNode;
                tempB=newNode;
            }
        }
        int pos=sc.nextInt();
        if(pos>=0 && pos<n1) {
            Node curr=headA;
            for(int i=0;i<pos;i++) {
                curr=curr.next;
            }
            tempB.next=curr;
        }
        System.out.println("Original list A:");
        intersection.printList(headA);
        System.out.println("Original list B:");
        intersection.printList(headB);
        System.out.println("Intersection node:");
        Node intersectionNode = intersection.getIntersectionNode(headA, headB);
        if (intersectionNode != null) {
            System.out.println(intersectionNode.val);
        } 
        else {
            System.out.println("No intersection found.");
        }
    }
}