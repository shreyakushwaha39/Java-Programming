public class CopyArray {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int[] copied=copyArray(arr);
        for(int i=0;i<copied.length;i++)
        {
            System.out.print(copied[i]+" ");
        }
    }
    static int[] copyArray(int[] arr)
    {
        int n=arr.length;
        int[] copied=new int[n];
        for(int i=0;i<n;i++)
        {
            copied[i]=arr[i];
        }
        return copied;
    }
}
