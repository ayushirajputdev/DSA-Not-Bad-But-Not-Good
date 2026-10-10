public class p17 {
    public static void main(String[] args){
        int n=5;
        char s='A';
    

         for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            
            
            for(int j=1;j<=i;j++){
                
                System.out.print(s++);
                

            }

            s--;
            for(int j=1;j<i;j++){
                
                System.out.print(--s);

            }
            s='A';
            
           
             
            System.out.println();
           
        }


    }
    
}
