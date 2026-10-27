import java.util.*;
public class FindFactorialOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int fact=1;
        int i=1;
        while(N>=i) {
            fact=fact*i;
            i++;
        }
        System.out.print("Factorial: "+fact);
    }
}