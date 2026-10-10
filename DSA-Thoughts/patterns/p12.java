public class p12 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(i-j+1);
            }
            System.out.println();
        }
    }
    
}
