
public class p1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 0; i--) {
            for (int j = i-1; j > 0; j--) {
                System.out.print("*");
            }

            for (int j = 0; j <= n - i; j++) {
                System.out.print("l");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("l");
            }

            System.out.println();

        }
    }
}