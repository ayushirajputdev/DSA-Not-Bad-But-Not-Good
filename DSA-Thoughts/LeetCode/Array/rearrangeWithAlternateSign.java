import java.util.*;
public class rearrangeWithAlternateSign {


        static int[] rearrangeArrays(int[] nums) {
            ArrayList<Integer> pos=new ArrayList<>();
            ArrayList<Integer> neg=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(nums[i]<0){
                    neg.add(nums[i]);

                }
                else{
                    pos.add(nums[i]);

                }

            }
            int s=0,a=0,b=0;
            if(pos.size()>neg.size()){
                for(int i=0;i<neg.size()*2;i++){
                    if(i%2==0){
                        nums[i]=pos.get(a);
                        a++;
                    }
                    else{
                        nums[i]=neg.get(b);
                        b++;
                    }s++;

                }

                for(int j=a;j<pos.size();j++){
                    nums[s]=pos.get(j);
                    s++;
                }
            }
            else{
                for(int i=0;i<pos.size()*2;i++){
                    if(i%2==0){
                        nums[i]=pos.get(a);
                        a++;
                    }
                    else{
                        nums[i]=neg.get(b);
                        b++;
                    }
                    s++;

                }

                for(int j=b;j<neg.size();j++){
                    nums[s]=neg.get(j);
                    s++;

                }
            }
            return nums;

        }

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

        System.out.println();

        System.out.println("original array is ");
        int []arr2={2,4,-3,4,-5,-4,7};
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        arr2=rearrangeArrays(arr2);
        System.out.println(" array after the arrangement is ");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
