import java.util.*;
public class CountPrimeNumbersInaRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int primeCount=0;
        for(int num=A; num<=B; num++){
            if(isPrime(num)){
                primeCount++;
            }
        }
        System.out.print("Number of prime numbers between "+A+" and "+B+": "+primeCount);
    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i*i<=n; i++){        
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
