public class PrintDigitsInWords {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N=sc.nextInt();
        String result="";
        while(N>0){
            int d=N%10;
            switch(d){
                case 0:
                    result="Zero "+result;
                    break;
                case 1:
                    result="One "+result;
                    break;
                case 2:
                    result="Two "+result;
                    break;
                case 3:
                    result="Three "+result;
                    break;
                case 4:
                    result="Four "+result;
                    break;
                case 5:
                    result="Five "+result;
                    break;
                case 6:
                    result="Six "+result;
                    break;
                case 7:
                    result="Seven "+result;
                    break;
                case 8:
                    result="Eight "+result;
                    break;
                case 9:
                    result="Nine "+result;
                    break;
            }
            N=N/10;
        }
        System.out.print(result.trim());
    }
}