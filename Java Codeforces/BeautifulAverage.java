import java.util.Scanner;

public class BeautifulAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int maxVal = 0;
            
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num > maxVal) {
                    maxVal = num;
                }
            }
            
            System.out.println(maxVal);
        }
        
        sc.close();
    }
    
}
