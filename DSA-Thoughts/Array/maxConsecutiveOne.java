package Array;
public class maxConsecutiveOne {
    static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int max1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                max++;
            }
            else {
                max=0;
            }
            if(max1<max){
                max1=max;
            }
        }
        return max1;
    }
    public static void main(String[] args) {
        int []arr1={2,3,4,3,2,0,6,0,6,0,3,0,1};
       int ans= findMaxConsecutiveOnes(arr1);
        System.out.println("the max consecutive one's are "+ans);
    }
}