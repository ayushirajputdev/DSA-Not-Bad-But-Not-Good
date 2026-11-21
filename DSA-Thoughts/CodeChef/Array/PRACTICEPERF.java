package Array;

import java.util.*;
import java.lang.*;

public class PRACTICEPERF
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int count=0;
        for(int i=0;i<4;i++){
            if(sc.nextInt()>=10){
                count++;
            }
        }
        System.out.println(count);

    }
}

