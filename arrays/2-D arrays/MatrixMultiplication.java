public class MatrixMultiplication {
    public static void main(String[] args)
    {
        int[][] A={{1,2,3},{4,5,6},{7,8,9}};
        int[][] B={{9,8,7},{6,5,4},{3,2,1}};
        int[][] C=new int[A.length][B[0].length];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B[0].length;j++)
            {
                C[i][j]=0;
                for(int k=0;k<A[0].length;k++)
                {
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        for(int i=0;i<C.length;i++)
        {
            for(int j=0;j<C[i].length;j++)
            {
                System.out.print(C[i][j]+" ");
            }
        }
        System.out.println();
    }
}
