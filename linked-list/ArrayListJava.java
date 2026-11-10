import java.util.*;
public class ArrayListJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            int val=sc.nextInt();
            list.add(val);
        }
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        list.add(0,10);
        list.add(80);
        System.out.println("After insertion: " + list);
        list.remove(2);
        list.remove(Integer.valueOf(10));
        System.out.println("After deletion: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
        Collections.reverse(list);
        System.out.println("After reversing: " + list);
    }
}
