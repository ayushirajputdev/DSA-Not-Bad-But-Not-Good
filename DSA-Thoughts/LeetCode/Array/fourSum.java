import java.util.*;
public class fourSum {
    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> st=new ArrayList<>();

        for(int i=0;i<nums.length-3;i++){
            if(i>0&&(nums[i]==nums[i-1])){continue;}
            for(int j=i+1;j<nums.length-2;j++){
                if(j!=i+1&&(nums[j]==nums[j-1])){continue;}
                else{
                    int k=j+1;
                    int l=nums.length-1;
                    while(k<l){
                        long  sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum<target){
                            k++;
                        }
                        else if(sum>target){
                            l--;
                        }
                        else{
                            List<Integer> s=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);

                            st.add(s);
                            k++;
                            l--;
                            while(k<l&&nums[k]==nums[k-1]){k++;}
                            while(k<l&&nums[l]==nums[l+1]){l--;}

                        }
                    }

                }
            }

        }

        return st;

    }

    public static void main(String[] args) {
        int []nums = {1, -2, 3, 5, 7, 9};
        int target=7;
        List<List<Integer>> n=new ArrayList<>(fourSum(nums,target));
        System.out.println("the answer is ");
        System.out.println(n);
    }
}
