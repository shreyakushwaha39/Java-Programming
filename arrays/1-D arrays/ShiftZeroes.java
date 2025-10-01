public class ShiftZeroes 
{
    public static void main(String[] args)
    {
        int[] arr={0,1,0,3,12};
        shiftZeroes(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void shiftZeroes(int[] arr)
    {
        int n=arr.length;
        int j=0; 
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<n)
        {
            arr[j]=0;
            j++;
        }
    }
}
