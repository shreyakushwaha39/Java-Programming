import java.util.Scanner;
public class SumRowsCols {
    public static void main(String[] args)
    {
        int[][] A = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                A[i][j] = in.nextInt();
            }
        }
        for(int i = 0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        int[] rowSum = new int[A.length];
        int[] colSum = new int[A[0].length];
        for(int i = 0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                rowSum[i] += A[i][j];
                colSum[j] += A[i][j];
            }
        }
        System.out.println("Row sums:");
        for(int i = 0;i<rowSum.length;i++)
        {
            System.out.print(rowSum[i]+" ");
        }
        System.out.println();
        System.out.println("Column sums:");
        for(int j = 0;j<colSum.length;j++)
        {
            System.out.print(colSum[j]+" ");
        }
        System.out.println();
    }
}
