import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,8,2,9,7,56};
        Arrays.sort(arr);
        System.out.println("Second Largest = " + arr[arr.length - 2]);
    }
}

