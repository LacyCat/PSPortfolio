import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            if (s.length() == 1) {sb.append(s + "\n"); continue;}
            long k = 1;
            long tmp = Integer.MIN_VALUE;
            long n = 0;
            boolean v = false;
            while ((long)k*(k-1)/2 <= s.length()) k++;
            k--;
            for (long j = k; j >= 2; j--) {
                long top = (long) 2 * (s.length() - j);
                long btm = j * (j - 1);
                if (top > 0 && top % btm == 0) {
                    v = true;
                    tmp = j;
                    n = top / btm;
                    break;
                }
            }
            k = tmp;
            if (!v) sb.append("0\n");
            else {
                tmp = 0;
                for (int j = 1; j <= k; j++) {
                    long len = 1 + (j - 1) * n;
                    sb.append(s.substring((int) tmp, (int) (tmp + len))).append("\n");
                    tmp += len;
                }
            }
        }
        System.out.print(sb);
    }
}