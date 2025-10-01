import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        rotateRight(arr, d);
        System.out.println("Rotate Right: " + Arrays.toString(arr));
    }
    static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n; 

        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[n - d + i];
        }

        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }
}
