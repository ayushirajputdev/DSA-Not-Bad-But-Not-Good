import java.util.*;
public class missingAndRepeatingNumber {
    static int[] findMissingAndRepeatedValues1(int[][] grid) {
        int len=grid.length*grid[0].length;
        HashMap<Integer,Integer> n=new HashMap<>();
        int repeated=-1;
        int num=-1;
        for(int i=1;i<=len;i++){
            n.put(i,0);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                n.put(grid[i][j],n.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int nums:n.keySet()){
            if(n.get(nums)>1){
                repeated=nums;
            }
            if(n.get(nums)<1){
                num=nums;
            }

        }


        int[] ans={repeated,num};
        return ans;


    }

    static int[] findMissingAndRepeatedValues2(int[][] grid) {
        long len=grid.length*grid[0].length;
        long sum=len*(len+1)/2;
        long sums=len*(len+1)*(2*len+1)/6;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum-=grid[i][j];
                sums-=grid[i][j]*grid[i][j];
            }
        }
        long sum3=sums/sum;
        int repeated=(int)(sum+sum3)/2;
        int missing=(int)(sum3-repeated);
        int[]n ={missing,repeated};
        return n;



    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 3}, {2, 2}};
        int [] n1=findMissingAndRepeatedValues1(grid);

        int[][] grid2 = new int[][]{{1, 3}, {2, 2}};
        int [] n2=findMissingAndRepeatedValues2(grid2);

        for(int i=0;i<n1.length;i++){
            System.out.print(n1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n2.length;i++){
            System.out.print(n2[i]+" ");
        }


    }
}
