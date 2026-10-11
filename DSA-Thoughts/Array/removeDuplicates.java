package Array;

public class removeDuplicates {
    static int removeduplicates(int[] nums) {
        int j=0;

        for(int i=1;i<nums.length;i++){
            if(nums[j]==nums[i]){
                continue;

            }
            j++;
            nums[j]=nums[i];


        }
        return j+1;

    }

    public static void main(String[] args) {
        int []nums={2,2,3,3,4,5,6,6,7,7,8,9};
        int ans=removeduplicates(nums);
        System.out.println("number of unique elements are " +ans);
    }

}
