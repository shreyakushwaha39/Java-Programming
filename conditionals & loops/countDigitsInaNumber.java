import java.util.*;
public class countDigitsInaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        int temp=N;
        while (temp>0) { 
            int d=temp%10;
            count+=1;
            temp=temp/10;
        }
        System.out.print("Count Digits in a Number: "+count);
    }
}
