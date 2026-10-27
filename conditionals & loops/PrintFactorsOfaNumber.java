public class PrintFactorsOfaNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N=sc.nextInt();
        System.out.print("Factors: ");
        for(int i=1;i<=N;i++){
            if(N%i==0){
                System.out.print(i+" ");
            }
        }
    }
}