package Array;

import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class FCTRL2
{
    static BigInteger fact(int num){

        if(num==1||num==0){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(fact(num-1));
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int p=sc.nextInt();
            System.out.println(fact(p));
        }

    }
}
