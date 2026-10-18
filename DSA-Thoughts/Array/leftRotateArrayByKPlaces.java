package Array;
public class leftRotateArrayByKPlaces {
    static void rotateArray(int[] nums, int k) {
        if(k>nums.length){
            k=k%nums.length;
        }
        int []arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=nums[i];
        }
        for(int i=k;i<nums.length;i++){
            nums[i-k]=nums[i];
        }
        for(int i=nums.length-k;i<nums.length;i++){
            nums[i]=arr[i-(nums.length-k)];
        }
    }
    public static void main(String[] args) {
        int []arr1={2,3,4,3,2,0,6,0,6,0,3,0,1};
        int k=3;
        rotateArray(arr1,k);
        System.out.println("the array is");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}