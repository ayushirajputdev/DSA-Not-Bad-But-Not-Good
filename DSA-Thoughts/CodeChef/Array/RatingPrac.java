package Array;
import java.util.Scanner;

public class RatingPrac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }

            // Your code goes here
            int ans=1;
            for(int i=0;i<n-1;i++){
                if(d[i]<=d[i+1]){
                    continue;
                }
                else{
                    ans=0;
                    break;
                }
            }
            if(ans==0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }


        }

    }
}

