import java.util.*;
public class FindTheSmallestInaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int min=10;
        while(N>0){
            int d=N%10;
            if(d<min){
                min=d;
            }
            N=N/10;
        }
        System.out.print("Minimum number: "+min);
    }
}
