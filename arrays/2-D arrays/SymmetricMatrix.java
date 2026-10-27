public class SymmetricMatrix {
    public static void main(String[] args)
    {
        int[][] A={{1,2,3},{2,5,6},{3,6,9}};
        boolean isSymmetric=true;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                if(A[i][j]!=A[j][i])
                {
                    isSymmetric=false;
                    break;
                }
            }
        }
        if(isSymmetric)
        {
            System.out.println("The matrix is symmetric.");
        }
        else
        {
            System.out.println("The matrix is not symmetric.");
        }
    }
}
