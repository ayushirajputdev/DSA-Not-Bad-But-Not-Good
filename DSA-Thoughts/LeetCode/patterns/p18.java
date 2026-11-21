public class p18 {
    public static void main(String[] args) {
        int n = 5;
        char s = 'A';

        
        for (int i = 1; i <=n; i++) {
           for(int j=i;j>=1;j--){
            System.out.print((char)(s+n-j));

           }
            
            System.out.println();

        }

    }
}
