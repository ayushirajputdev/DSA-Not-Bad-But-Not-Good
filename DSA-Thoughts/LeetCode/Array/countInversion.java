public class countInversion {
    static long count = 0;
//approach =merge sort

    static void merge(int[] nums, int low, int mid, int high) {
        int left = low, k = 0;
        int[] temp = new int[high - low + 1];

        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (nums[left] > nums[right]) {
                temp[k] = nums[right];
                count += (mid - left + 1);
                right++;
                k++;

            } else {
                temp[k] = nums[left];
                left++;
                k++;
            }

        }
        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        while (right <= high) {
            temp[k++] = nums[right++];
        }
        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }

    }

    static void mergesort(int low, int high, int[] nums) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;

        mergesort(low, mid, nums);
        mergesort(mid + 1, high, nums);
        merge(nums, low, mid, high);
    }

    static long numberOfInversions(int[] nums) {
        mergesort(0, nums.length - 1, nums);
        return count;


    }

    public static void main(String[] args) {
        int []nums={2, 3, 7, 1, 3, 5};
        long count=numberOfInversions(nums);
        System.out.println(count);



    }
}
