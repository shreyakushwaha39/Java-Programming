import java.util.Arrays;
public class DeleteElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int index = 2; 
        for(int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        int[] newArr = Arrays.copyOf(arr, arr.length-1);
        System.out.println(Arrays.toString(newArr));
    }
}
