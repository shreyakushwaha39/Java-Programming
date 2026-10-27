import java.util.Scanner;
public class SumOfFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int a=0,b=1;
        int sum=0;
        for(int i=2;i<=N;i++){
            sum+=a+b;
            a=b;
            b=sum;
        }
        System.out.print("Sum of Fibonacci Series: "+sum);
    }
}