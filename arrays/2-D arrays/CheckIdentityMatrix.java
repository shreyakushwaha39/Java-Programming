public class CheckIdentityMatrix {
    public static void main(String[] args)
    {
        int[][] A={{1,0,0},{0,1,0},{0,0,1}};
        boolean isIdentity=true;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                if(i==j && A[i][j]!=1)
                {
                    isIdentity=false;
                    break;
                }
                else if(i!=j && A[i][j]!=0)
                {
                    isIdentity=false;
                    break;
                }
            }
        }
        if(isIdentity)
        {
            System.out.println("The matrix is an identity matrix.");
        }
        else
        {
            System.out.println("The matrix is not an identity matrix.");
        }
    }
}
