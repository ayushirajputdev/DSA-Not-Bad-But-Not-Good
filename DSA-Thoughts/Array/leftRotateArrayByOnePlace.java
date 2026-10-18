package Array;
public class leftRotateArrayByOnePlace {
    static void rotateArrayByOne(int[] nums) {
        int temp=nums[0];
        for( int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;

    }
    public static void main(String[] args) {
        int []arr1={2,3,4,3,2,0,6,0,6,0,3,0,1};
        rotateArrayByOne(arr1);
        System.out.println("the array after rotaing by one place is");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}