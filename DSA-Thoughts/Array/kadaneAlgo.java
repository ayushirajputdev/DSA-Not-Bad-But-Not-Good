public class kadaneAlgo {
    static int maxSubArray(int[] nums) {
        int cursum=0;
        int max=Integer.MIN_VALUE;
        for(int c:nums){
            cursum+=c;
            if(cursum>max){
                max=cursum;
            }
            if(cursum<0){
                cursum=0;
            }

        }
        return max;

    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println("the maximum sum of the subarray is ");
        int max=maxSubArray(nums);
        System.out.println(max);

    }

}
