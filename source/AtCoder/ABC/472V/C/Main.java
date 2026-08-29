import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        long c_k = 0;
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            c_k += (long)a[i];
            if (i + 1 > m) {
                c_k -= a[Math.max(i-m,0)];
            }
            if (c_k <= k) sb.append("Yes\n");
            else {
                c_k -= a[i];
                a[i] = 0;
                sb.append("No\n");
            }
        }
        System.out.print(sb);
    }
}