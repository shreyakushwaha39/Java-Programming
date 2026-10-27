public class SparseMatrix {
    public static void main(String[] args) {
        int[][] A = {
            {0,0,3},
            {0,0,0},
            {4,0,0}
        };
        int zeros=0, total=A.length*A[0].length;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]==0) zeros++;
            }
        }
        if(zeros > total/2) System.out.println("Sparse Matrix");
        else System.out.println("Not Sparse");
    }
}   