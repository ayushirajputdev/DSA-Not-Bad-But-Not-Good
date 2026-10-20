import java.util.*;
public class repeatingAndMissingNumber {
    static int[] findMissingRepeatingNumbers(int[] nums) {
        List<Integer> n1 = new ArrayList<>();

        HashMap<Integer, Integer> n = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            n.put(nums[i], n.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {

            if (!n.containsKey(i) || n.get(i) > 1) {
                n1.add(i);
            }
        }
        int[] arr = new int[n1.size()];
        for (int i = 0; i < n1.size(); i++) {
            arr[i] = n1.get(i);

        }
        if (arr.length == 2 && !n.containsKey(arr[0])) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        return arr;

    }
        public static void main(String[] args) {
            int []arr={3, 5, 4, 1, 1};
            int []ans=findMissingRepeatingNumbers(arr);
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
        }

    }

