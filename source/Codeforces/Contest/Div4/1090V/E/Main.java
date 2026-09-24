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
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }

            int mx = 0;
            int msk = 0;
            for (int j = 30; j > -1; j--) {
                msk |= (1 << j);
                Set<Integer> p = new HashSet<>();
                for (int v : a) {
                    p.add(v & msk);
                }
                int c = mx | (1 << j);
                for (int pr : p) {
                    if (p.contains(pr ^ c)) {
                        mx = c;
                        break;
                    }
                }
            }
            sb.append(mx + "\n");
        }
        System.out.print(sb);
    }
}