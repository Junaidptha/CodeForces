import java.util.*;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
         
            int n = sc.nextInt();
            
            String s = sc.next();
            
            // Count how many '1's we have
            int countOnes = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    countOnes++;
                }
            }
            
            if (countOnes == 0) {
                
                System.out.println("0");
            } else {
                
                System.out.println(countOnes);
                StringBuilder indices = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        indices.append(i + 1).append(" ");
                    }
                }
                System.out.println(indices.toString().trim());
            }
            
            System.out.println();
        }
        
        sc.close();
    }
}