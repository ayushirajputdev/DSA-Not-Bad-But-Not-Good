package patterns.recursion;

public class revArray {
    static void swap(int []a,int i,int n){
        int temp=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=temp;

    }
    static int[] fuse(int i,int n ,int []a){
        if(i>=n/2){
            return a;
        }
        swap(a,i,n);
        return fuse(i+1,n,a);

    }
    public static void main(String[] args) {
        int[]a={2,3,4,5,6};
        int i=0;
        int n=5;
        int []b =fuse(i,n,a);
       for(int j=0;i<b.length;j++){
           System.out.print(b[j]+" ");
       }


    }
}
