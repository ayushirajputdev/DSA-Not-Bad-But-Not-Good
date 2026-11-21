package hashing;

import java.util.Scanner;

public class preCalcHash {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();

        int []arr=new int[n];
        System.out.println("enter the array ");
        for(int i=0;i<n;i++){
            System.out.println("enter the array's "+i+"th term");
            arr[i]=sc.nextInt();

        }
        int [] pre=new int[12];
        for(int i=0;i<n;i++){
            pre[arr[i]]+=1;
        }
        System.out.println("-----------------");
        System.out.println("enter the number of querries");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter the number whose count you want to know ");
            int s=sc.nextInt();
            System.out.println(s+"appears "+pre[s]+" times");
            q--;
        }

    }

}
