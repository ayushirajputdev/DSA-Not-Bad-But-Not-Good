import java.util.*;
public class leadersInArray {
    static List<Integer> leaders(int[] nums) {
        List<Integer> n=new ArrayList<>();
        int ans=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            ans=Math.max(ans,nums[i]);
            if(!n.contains(ans)){
                n.add(ans);
            }
        }
        Collections.reverse(n);
        return n;

    }
    public static void main(String[] args) {
        int []nums=  {-3, 4, 5, 1, -4, -5};
        List<Integer> ne=leaders(nums);
        System.out.println(ne);


    }
}
