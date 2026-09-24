import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int[] a = new int[Integer.parseInt(br.readLine())];
            int o = 0;
            int e = 0;
            int tmp = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a.length; j++) {
                int v = Integer.parseInt(st.nextToken());
                if (v % 2 == 1) {
                    a[j] = 1;
                    o++;
                }
                else {
                    a[j] = v;
                    e++;
                    if (tmp > v) tmp = v;
                }
            }
            if (o > e) {
                sb.append(o + "\n");
            }
            else {
                o = 0;
                e = 0;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] != 1) {
                        if (a[j] % 4 == 0) o++;
                        else e++;
                    }
                }
                sb.append(Math.max(o,e) + "\n");
            }
        }
        System.out.print(sb);
    }
}