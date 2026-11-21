import java.util.*;
public class majorityElement {
    static List<Integer> majorityElementTwo(int[] nums) {
        List<Integer> n=new ArrayList<>();
        HashMap<Integer,Integer> n1=new HashMap<>();
        for( int i=0;i<nums.length;i++){
            n1.put(nums[i],n1.getOrDefault(nums[i],0)+1);
        }
        for(int c:n1.keySet()){
            if(n1.get(c)>(int)(nums.length/2)){
                n.add(c);
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int []arr={1,2,2,2,3,2,2,2,1,2,2,3,4,4,5};
        List<Integer> ans=majorityElementTwo(arr);
        System.out.println("the majority element is "+ans);
    }
}