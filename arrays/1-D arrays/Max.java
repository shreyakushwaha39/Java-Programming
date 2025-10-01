public class Max
{
    public static void main(String[] args)
    {
        int[] arr={1,3,23,9,18};
        System.out.println(maximum(arr));
    }
    static int maximum(int[] arr)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}