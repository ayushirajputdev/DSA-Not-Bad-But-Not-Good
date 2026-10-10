package Sorting;

public class InsertionSort {
    static int[] insertionSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int j=i;
            while(j>=0){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                j--;

            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int []arr={2,3,4,33,55,4,66,7,19,2};
        int []temp=insertionSort(arr);
        for(int i=0;i<temp.length;i++) {
            System.out.print(temp[i]+" ");
        }
    }
}
