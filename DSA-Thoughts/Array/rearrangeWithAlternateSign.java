public class rearrangeWithAlternateSign {
    static int[] rearrangeArray(int[] nums) {
        int []arr=new int[nums.length];
        int a=1,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arr[a]=nums[i];
                a+=2;
            }
            else{
                arr[b]=nums[i];
                b+=2;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        System.out.println("original array is ");
        int []arr={2,4,-3,4,-5,-4};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr=rearrangeArray(arr);
        System.out.println(" array after the arrangement is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
