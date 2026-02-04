import java.util.*;

public class AbrahamGreat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if (k == n * n - 1) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
            for (long row = 0; row < n; row++) {
                if (k >= n) {
                    System.out.println("U".repeat((int) n));
                    k -= n;
                } else if (k == n - 1) {
                    System.out.println("U".repeat((int) k) + "D");
                    k = 0;
                } else {
                    System.out.println("U".repeat((int) k) + "R".repeat((int) (n - 1 - k)) + "L");
                    k = 0;
                }
            }
        }
        sc.close();
    }
}
