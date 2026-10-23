

public class nextPermutation {
    static void nextPermutation(int[] nums) {
        // Your code goes here
        int A=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                A=i;
                break;

            }
        }
        if(A==-1){
            for(int i=0;i<(nums.length)/2;i++){
                int temp3=nums[i];
                nums[i]=nums[nums.length-i-1];
                nums[nums.length-i-1]=temp3;

            }
        }
        else{
            int t2=-1;
            for(int j=nums.length-1;j>=A+1;j--){
                if((nums[j]>nums[A] )){
                    t2=j;

                    break;

                }

            }
            int temp=nums[A];
            nums[A]=nums[t2];
            nums[t2]=temp;


            int start = A + 1;
            int end = nums.length - 1;
            while (start < end) {
                int temp2 = nums[start];
                nums[start] = nums[end];
                nums[end] = temp2;
                start++;
                end--;
            }
        }

    }

    public static void main(String[] args) {
        int []nums={2,1,5,4,3,0,0};
        System.out.println("original array");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        nextPermutation(nums);
        System.out.println("next permutation");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
