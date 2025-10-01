class Duplicate
{
    public static void main(String[] args)
    {
        int[] arr ={12,34,54,12,45,67,34};
        int n=duplicate(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static int duplicate(int[] arr)
    {
        int n=arr.length;
        java.util.Arrays.sort(arr);
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        return j; //new size
    }
}
