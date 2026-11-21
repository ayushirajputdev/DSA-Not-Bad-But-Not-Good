public class FindMissingNumber {
    static int missingNumber(int[] nums) {
        int xor1=0;
        for( int i=0;i<=nums.length;i++){
            xor1=xor1^i;
        }
        int xor2=0;
        for( int i=0;i<nums.length;i++){
            xor2=xor2^nums[i];
        }
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int []arr={0,2,3,4,5,6,7};
        int ans=missingNumber(arr);
        System.out.println("the missing number is");
        System.out.println(ans);


    }
}