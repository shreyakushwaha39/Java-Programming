public class SumOfDiagonals {
    public static void main(String[] args)
    {
        int[][] A={{1,2,3},{4,5,6},{7,8,9}};
        int primaryDiagonalSum=0;
        int secondaryDiagonalSum=0;
        for(int i=0;i<A.length;i++)
        {
            primaryDiagonalSum+=A[i][i];
            secondaryDiagonalSum+=A[i][A.length-1-i];
        }
        System.out.println("Primary Diagonal Sum: "+primaryDiagonalSum);
        System.out.println("Secondary Diagonal Sum: "+secondaryDiagonalSum);
    }
}
