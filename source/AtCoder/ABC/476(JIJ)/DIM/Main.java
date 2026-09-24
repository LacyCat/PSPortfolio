import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        long tmp = 0;
        long v;
        long[] a = new long[n];
        long[] b = new long[m];
        long[] tmpa = new long[n + 1];
        long[] tmpb = new long[m + 1];
        long[] cost = new long[m + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b);
        tmpa[0] = a[0]; tmpb[0] = b[0];
        for (int i = 1; i < n; i++) {
            tmpa[i] = a[i] + tmpa[i - 1];
        }
        for (int i = 1; i < m; i++) {
            long r = b[i] + tmpb[i - 1];
            tmpb[i] = r;
            cost[i] = (r + k - 1) / k;
        }
        for (int i = 0; i < m; i++) {
            if (cost[i] >= y) tmp = m;
        }

        System.out.print(tmp);
    }

    public static int upperBound(long[] arr, long key) {
        int index = Arrays.binarySearch(arr, key);

        return index >= 0 ? index + 1 : -(index + 1);
    }
}