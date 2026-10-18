package Array;
import java.util.*;
public class intersectionOfTwoSortedArray {
    static int[] intersectionArray(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length&& j<nums2.length){
            if(nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
        }
        int [] ans2=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            ans2[k]=ans.get(k);

        }
        return ans2;
    }

    public static void main(String[] args) {
        int []arr1={2,3,4,3,2,0,6,0,6,0,3,0,1};
        int []arr2={2,0,6,0,6,0,3,0,1};
        int []arr=intersectionArray(arr1,arr2);
        System.out.println("the array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}