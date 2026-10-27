public class PrintFibonacciSeries {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print("Fibonacci Series: ");
        for(int i=1;i<=N;i++){
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}