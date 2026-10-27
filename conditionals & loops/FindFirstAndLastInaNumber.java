import java.util.Scanner;
public class FindFirstAndLastInaNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        int temp=n;
        while(temp>=10){
            temp=temp/10;
        }
        int first=temp;
        System.out.print("First: "+first);
        System.out.print("\nLast: "+last);
    }
}
