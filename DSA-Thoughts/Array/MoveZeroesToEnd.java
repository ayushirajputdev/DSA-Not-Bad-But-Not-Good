package Array;
public class MoveZeroesToEnd {
    static void moveZeroes(int[] nums) {
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    j=i;
                    break;
                }
            }
            for( int i=j;i<nums.length;i++){
                if(nums[i]!=0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j++;
                }
            }
    }
    public static void main(String[] args) {
        int []arr={2,3,4,3,2,0,6,0,6,0,3,0,1};
        moveZeroes(arr);
        System.out.println("the array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}