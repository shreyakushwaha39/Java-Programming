import java.util.Scanner;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Not Prime");
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break; 
            }
        }

        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

/*import java.util.*;
public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N<=0) {
            System.out.print("Not a Prime Number");
        }
        else {
            int count=0;
            for(int i=1;i<=N;i++){
                if(N%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print("Prime Number");
            }
            else{
                System.out.print("Not a Prime Number");
            }
        } 
    }
}*/

