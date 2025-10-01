import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(1,10);
        System.out.println(list);
        list.set(0,5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}