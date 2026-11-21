package Sorting;

public class SelectionSort {
    static int[] selectionSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int mini=i;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<nums[mini]){
                    mini=j;
                }
            }
            int temp=nums[mini];
            nums[mini]=nums[i];
            nums[i]=temp;
        }
        return nums;

    }

    public static void main(String[] args) {
        int []arr={2,3,4,33,55,4,66,7,19,2};
        int []temp=selectionSort(arr);
        for(int i=0;i<temp.length;i++) {
            System.out.print(temp[i]+" ");
        }
    }
}
