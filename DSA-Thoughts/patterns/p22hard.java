public class p22hard {
    public static void main(String[]  args){
        int n=5;
        for(int i=0;i<=2*n-2;i++){
            for(int j=0;j<=2*n-2;j++){
                int top=i;
                int left=j;
                int right=2*n-j-2;
                int down=2*n-i-2;
                System.out.print(n-Math.min(Math.min(top,down),Math.min(right,left)));
                 

            }

            
            
            System.out.println();
        }
        
    }
    
}
 