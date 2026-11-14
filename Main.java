import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            int m = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
                if (a[j] > m) m = a[j];
            }

            int[] b = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                b[j] = Integer.parseInt(st.nextToken());
            }
            int[] b_m = new int[m];
            int c_max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if (b[j] > c_max) {
                    c_max = b[j];
                }
                b_m[j] = c_max;
            }
            
            long sum = 0;
            for (int v : a) {
                sum += b_m[v - 1];
            }

            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
