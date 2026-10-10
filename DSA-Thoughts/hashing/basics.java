package hashing;
import java.util.Scanner;

public class basics {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int [] arr=new int[n];


        for(int i=0;i<n;i++){
            System.out.println("enter the "+(i+1)+"th element ");
            arr[i]=sc.nextInt();
        }
        int []ar=new int[13];

        for(int i=0;i<13;i++) {
            ar[i] = 0;

        }
        for(int i=0;i<n;i++){

            ar[arr[i]]+=1;
        }
        System.out.println("now we are gonna write the occurence of the numbers ");

        System.out.println("enter the index to check the elements number of occurence ");
        int ind=sc.nextInt();
        System.out.println("the no. of  occurence of "+ind+" is "+ar[ind]);




    }
}
