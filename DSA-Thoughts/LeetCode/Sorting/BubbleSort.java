package Sorting;


public class BubbleSort {
    static int[] bubbleSort(int[] nums) {
        for( int i=nums.length-1;i>=0;i--){
            int isswap=0;
            for(int j=0;j<i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                    isswap=1;

                }
            }
            if(isswap==0){
                break;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int []arr={2,3,4,33,55,4,66,7,19,2};
        int []temp=bubbleSort(arr);
        for(int i=0;i<temp.length;i++) {
            System.out.print(temp[i]+" ");
        }
    }
}
