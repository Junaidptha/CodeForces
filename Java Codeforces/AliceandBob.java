import java.util.*;
public class AliceandBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            
            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();
            
            // Simple strategy based on which side has more marbles
            int left = 0, right = 0;
            for (int x : v) {
                if (x < a) left++;
                else if (x > a) right++;
            }
            
            int b = (right > left) ? (a + 1) : (a - 1);
            
            // Handle edge cases
            if (b < 0) b = 0;
            if (b > 2000000000) b = 2000000000;
            
            System.out.println(b);
        }
        sc.close();
    }
}
