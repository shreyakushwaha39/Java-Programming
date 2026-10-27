public class TrailingZerosInfactorial {
    public static void main(String[] args) {
        int n=100;
        int count=0;
        while(n>0){
            n/=5;
            count+=n;
        }
        System.out.println("Trailing Zeros: "+count);
    }
}
