public class RemoveAllOccurrences {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,2,4,2,5};
        int val=2;
        int n=removeAllOccurrences(arr,val);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static int removeAllOccurrences(int[] arr,int val)
    {
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=val)
            {
                arr[j++]=arr[i];
            }
        }
        return j;
    }
}
