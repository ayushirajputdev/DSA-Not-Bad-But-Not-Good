package hashing;

public class charalloc {
    public static void main(String[] args) {
        String s="abcdabehf";
        int[]arr=new int[26];//already initialized to 0

        //taking all the characters into the array

        /*for(int i=0;i<26;i++){
            arr[i]=a;
            a++;

        }for(int i=0;i<26;i++){
            System.out.println((char)arr[i]);

        }*/
        for( int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<s.length();i++){
            System.out.println("the occurence of "+s.charAt(i)+" is "+arr[s.charAt(i)-'a']);
        }
        System.out.println("the occurence of z is "+arr['z'-'a']);

    }
}
