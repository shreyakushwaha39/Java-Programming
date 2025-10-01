class Add
{
    public static void main(String[] args)
    {
        int[] arr={1,3,23,9,18};
        System.out.println(Sum(arr));
    }
    static int Sum(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}

//One line code for sum of array
/*
import java.util.Arrays;
import java.io.*;
class Add {
    public static void main (String[] args) {
        int [] nums = {1,2,3,4,5};
        int sum = Arrays.stream(nums).sum();
        System.out.println(sum);
    }
}
*/