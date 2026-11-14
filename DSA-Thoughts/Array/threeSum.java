import java.util.*;
public class threeSum {
    static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st=new HashSet<>();

        for(int i=0;i<nums.length;i++){

            HashSet<Integer> h=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                if(h.contains(-(nums[i]+nums[j]))){
                    List<Integer> s=Arrays.asList(nums[i],nums[j],-(nums[i]+nums[j]));
                    Collections.sort(s);
                    st.add(s);

                }

                h.add(nums[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>(st);
        return ans;


    }

    public static void main(String[] args) {
        int []nums = {2, -2, 0, 3, -3, 5};
        List<List<Integer>> n=new ArrayList<>(threeSum(nums));
        System.out.println("the answer is ");
        System.out.println(n);

    }
}
