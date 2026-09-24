import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 에라토스테네스의 체
        final int l = 110000;
        boolean[] c = new boolean[l + 1];
        long[] p = new long[10005];
        int cnt = 0;

        for (int i = 2; i <= l; i++) {
            if (!c[i]) {
                if (cnt < p.length) p[cnt++] = i;
                for (long j = (long) i * i; j <= l; j += i) c[(int) j] = true;
            }
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                sb.append((p[j] * p[j + 1]) + (j + 1 < n ? " " : "\n"));
            }
        }
        System.out.print(sb);
    }
}