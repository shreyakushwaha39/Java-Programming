import java.util.Arrays;
public class InsertElement {
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        int index = 2, value=3;
        int[] newArr = new int[arr.length+1];
        for(int i=0;i<index;i++) 
        {
            newArr[i]=arr[i];
            newArr[index]=value;
        }
        for(int i=index;i<arr.length;i++)
        {
            newArr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
