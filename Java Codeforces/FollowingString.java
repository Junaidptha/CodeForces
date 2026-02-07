import java.util.*;
public class FollowingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            StringBuilder sb = new StringBuilder();
            int[] letterCount = new int[26];

            char nxt = 'a';

            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    sb.append(nxt);
                    letterCount[nxt-'a']++;
                    nxt++;
                }else{
                    for(int j=0;j<26;j++){
                        if(letterCount[j]==arr[i]){
                            sb.append((char) ('a' + j));
                            letterCount[j]++;
                            break;
                        }
                    }
                }
            }
            System.out.println(sb.toString());

        }
        sc.close();
    }
}
