package hashing;

import java.util.Scanner;

public class preCalcAlphabets {
    public static void main(String[] args) {
        int []count=new int[256];
        String s="absbdhxjcnkecsdsa";
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]+=1;

        }
        int q;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of querries");
        q=sc.nextInt();
        while(q>0){
            System.out.println("enter the number to find ots occurence");
            String s1=sc.next();
            System.out.println(s1+" appears "+count[s1.charAt(0)]+" times");
            q--;

        }

    }
}
