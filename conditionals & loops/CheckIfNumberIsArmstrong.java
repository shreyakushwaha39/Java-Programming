import java.util.Scanner;
public class CheckIfNumberIsArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        int ds=String.valueOf(N).length();
        int temp=N;
        while(temp>0){
            int d=temp%10;
            sum += Math.pow(d,ds);
            temp/=10;
        }
        if(sum==temp){
            System.out.print("Armstrong number");
        }
        else {
            System.out.print("Not an Armstrong Number");
        }
    }
}