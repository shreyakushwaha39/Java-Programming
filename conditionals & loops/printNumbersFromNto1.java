import java.util.Scanner;
public class printNumbersFromNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=N;
        while(i>0){
            System.out.print(i+" ");
            i--;
        }
    }
}