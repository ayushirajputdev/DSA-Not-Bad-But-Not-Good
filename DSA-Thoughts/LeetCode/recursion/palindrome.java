package patterns.recursion;

public class palindrome {
    static boolean ispalindrome(String st,int len,int i){
        if(i>=len/2){
            return true;
        }
        if(st.charAt(i)!=st.charAt(len-i-1)){
            return false;
        }
        return ispalindrome(st,len,i+1);
    }
    public static void main(String[] args) {
        String st="MADAM";
        int i=0;
        System.out.println(ispalindrome(st,st.length(),i));

    }
}
