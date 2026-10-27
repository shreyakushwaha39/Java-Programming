import java.util.*;
public class ReverseAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int rev=0;
        int temp=N;
        while (temp>0) { 
            int d=temp%10;
            rev = rev*10+d;
            temp=temp/10;
        }
        System.out.print("Reverse of a Number: "+rev);
    }
}