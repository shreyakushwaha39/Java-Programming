import java.util.*;
public class CheckIfNumberIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int rev=0;
        int temp=N;
        while (N>0) { 
            int d=N%10;
            rev = rev*10+d;
            N=N/10;
        }
        if(temp==rev){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}