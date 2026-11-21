public class p14 {
    public static void main(String[] args){
        int n=5;
        
        for(int i=1;i<=n;i++){
            char s='A';
            for(int j=1;j<=i;j++){
                System.out.print(s++);
            }
            System.out.println();
        }
    }
    
}
