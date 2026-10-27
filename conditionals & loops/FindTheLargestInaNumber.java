import java.util.Scanner;
public class FindTheLargestInaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int max=0;
        while(N>0) {
            int d=N%10;
            if(d>max){
                max=d;
            }
            N=N/10;
        }
        System.out.print("Maximum number: "+max);
    }
}