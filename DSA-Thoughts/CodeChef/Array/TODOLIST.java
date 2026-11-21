package Array;

import java.util.*;
        import java.lang.*;

public class TODOLIST
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<num;i++){
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
                int p=sc.nextInt();
                if(p>=1000){
                    count++;
                }
            }
            System.out.println(count);
            count=0;
        }

    }
}

