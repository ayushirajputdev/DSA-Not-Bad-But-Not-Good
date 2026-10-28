import java.util.*;
public class leadersInArray {

        static List<Integer> leaders(int[] nums) {
            List<Integer> n=new ArrayList<>();
            int ans=Integer.MIN_VALUE;
            for(int i=nums.length-1;i>=0;i--){

                if(nums[i]>=ans){
                    n.add(nums[i]);
                }
                ans=Math.max(ans,nums[i]);
            }
            Collections.reverse(n);
            return n;

        }

    public static void main(String[] args) {
        int []nums = {1, 2, 5, 3, 1, 2};
        List n=leaders(nums);
        System.out.println(n);
    }
    }
