import java.util.Scanner;
public class FindNthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        if(N==0){
            System.out.print("0th Fibonacci Number: 0");
        }
        int a=0,b=1;
        for(int i=2;i<=N;i++){
            int sum=a+b;
            a=b;
            b=sum;
        }
        System.out.print(N+"th Fibonacci Number: "+b);
    }
}