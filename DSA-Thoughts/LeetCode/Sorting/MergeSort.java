package Sorting;

public class MergeSort {
    static void  merge(int[]arr,int low,int mid,int high){
        int temp[]=new int[high-low+1];
        int i=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                temp[i]=arr[left];
                left++;

            }
            else if(arr[right]<arr[left]){
                temp[i]=arr[right];
                right++;

            }
            else{
                temp[i]=arr[left];
                left++;
                i++;
                temp[i]=arr[right];
                right++;
            }
            i++;


        }
        while(left<=mid){
            temp[i]=arr[left];
            i++;
            left++;
        }
        while(right<=high){
            temp[i]=arr[right];
            i++;
            right++;
        }
        for(int j=0;j<temp.length;j++){
            arr[low+j]=temp[j];
        }


    }
    static void mergesort(int []arr,int low, int high){
        if(low>=high){
            return ;
        }
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }


    public static void main(String[] args) {
        int []arr={2,3,4,33,55,4,66,7,19,2};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
