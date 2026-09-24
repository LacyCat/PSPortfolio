import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //으윽 어캐푸는지몰라서 더블포인터로하는중
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        long l = Long.parseLong(st.nextToken());
        long[] d = new long[n + 1];

        if (n > 1) {
            st = new StringTokenizer(br.readLine());
            d[1] = 0;
            for (int i = 2; i <= n; i++) {
                d[i] = d[i - 1] + Long.parseLong(st.nextToken());
            }
        }
        int m = 0;
        for (int l_p = 1; l_p <= s; l_p++) {
            for (int r_p = s; r_p <= n; r_p++) {
                long c_4_left = (d[r_p] - d[s]) * 2 + (d[s] - d[l_p]);
                long c_4_right = (d[s] - d[l_p]) * 2 + (d[r_p] - d[s]);
                long min = Math.min(c_4_left, c_4_right);
                if (min <= l) {
                    m = Math.max(m, r_p - l_p + 1);
                }
            }
        }
        System.out.print(m);
    }
}
