import java.util.*;

public class AandB{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();

            // Collect positions of 'a' and 'b'
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a') {
                    a.add(i);
                } else {
                    b.add(i);
                }
            }

            long cnt = 0;
            if (!a.isEmpty()) {
                int med = a.size() / 2;
                for (int i = 0; i < a.size(); i++) {
                    long dist = (long)(a.get(med) - a.get(i)) - (med - i);
                    if (dist < 0) dist = -dist;
                    cnt += dist;
                }
            }

            long ans = cnt;
            cnt = 0;

            if (!b.isEmpty()) {
                int med = b.size() / 2;
                for (int i = 0; i < b.size(); i++) {
                    long dist = (long)(b.get(med) - b.get(i)) - (med - i);
                    if (dist < 0) dist = -dist;
                    cnt += dist;
                }
            }

            if (cnt < ans) ans = cnt;

            System.out.println(ans);
        }

        sc.close();
    }
}
