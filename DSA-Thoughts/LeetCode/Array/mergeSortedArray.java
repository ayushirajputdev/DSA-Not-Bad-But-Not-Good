import java.util.*;
public class mergeSortedArray {
    //approach 1
    static void swap(int[] num1, int[] num2, int a, int b) {
        if (num1[a] > num2[b]) {
            int temp = num1[a];
            num1[a] = num2[b];
            num2[b] = temp;
        }
    }

    static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int left = 0, right = 0;
        int gap = (m + n) / 2 + (m + n) % 2;
        if (n == 0) {
            return;
        }

        while (gap > 0) {

            left = 0;
            right = left + gap;
            while (right < m + n) {
                if (left < m && right >= m) {
                    swap(nums1, nums2, left, right - m);


                } else if (left < m && right < m) {
                    swap(nums1, nums1, left, right);

                } else {
                    swap(nums2, nums2, left - m, right - m);

                }
                left++;
                right++;

            }
            if (gap == 1) {
                break;
            }
            gap = (gap / 2) + (gap % 2);


        }
        int k = 0;
        for (int i = m; i < n + m; i++) {
            nums1[i] = nums2[k];
            k++;
        }


    }
    //approach 2
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int j = 0, i = 0, k = 0;
        int[] arr3 = new int[n + m];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr3[k] = nums1[i];
                i++;
                k++;
            } else {
                arr3[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            arr3[k] = nums1[i];
            i++;
            k++;

        }
        while (j < n) {
            arr3[k] = nums2[j];
            j++;
            k++;

        }
        for (int l = 0; l < n + m; l++) {
            nums1[l] = arr3[l];
        }
    }
    //approach 3
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=0;i<m+n;i++){
            if(nums1[i]==0&&j<n){
                nums1[i]=nums2[j];
                j++;
            }

        }
        Arrays.sort(nums1);

    }

    public static void main(String[] args) {
        int[]nums1={-5, -2, 4, 5, 0, 0, 0};
        int []nums2={-3, 1, 8};
        merge1(nums1,4,nums2,3);
        for(int i=0;i<7;i++){
            System.out.print(nums1[i]+" ");
        }
        System.out.println();

        int[]nums3={-5, -2, 4, 5, 0, 0, 0};
        int []nums4={-3, 1, 8};
        merge1(nums3,4,nums4,3);
        for(int i=0;i<7;i++){
            System.out.print(nums3[i]+" ");
        }
        System.out.println();

        int[]nums5={-5, -2, 4, 5, 0, 0, 0};
        int []nums6={-3, 1, 8};
        merge1(nums5,4,nums6,3);
        for(int i=0;i<7;i++){
            System.out.print(nums5[i]+" ");
        }
        System.out.println();

    }
}
