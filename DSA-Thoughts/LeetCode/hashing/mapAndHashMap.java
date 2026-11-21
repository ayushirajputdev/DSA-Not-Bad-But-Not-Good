package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class mapAndHashMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();

        int []arr=new int[size];
        System.out.println("enter the array ");
        for(int i=0;i<size;i++){
            System.out.println("enter the array's "+i+"th term");
            arr[i]=sc.nextInt();

        }
        HashMap<Integer,Integer> s1=new HashMap<>();
        for(int i=0;i<size;i++){

            if(s1.containsKey(arr[i])){
                s1.put(arr[i],s1.get(arr[i])+1);
                continue;

            }
            s1.putIfAbsent(arr[i],1);
        }
        System.out.println("-----------------");
        System.out.println("enter the number of querries");
        int q=sc.nextInt();
        while(q>0){
            System.out.println("enter the number whose count you want to know ");
            int s=sc.nextInt();
            System.out.println(s+"appears "+s1.get(s)+" times");
            q--;
        }
    }
}
