package Array;
import java.util.*;
public class unionOfTwoSortedArray {
    static int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> n=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            n.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            n.add(nums2[i]);
        }
        int []arr=new int[n.size()];
        int index=0;
        for(int c:n){
            arr[index]=c;
            index++;
        }
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int []arr1={2,3,4,3,2,0,6,0,6,0,3,0,1};
        int []arr2={2,0,6,0,6,0,3,0,1};
        int []arr=unionArray(arr1,arr2);
        System.out.println("the array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}