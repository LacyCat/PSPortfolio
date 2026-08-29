import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m;
        int[] a = new int[n];
        int[] c;
        int[] r = new int[k];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        c = Arrays.stream(a.clone()).distinct().sorted().toArray();
        for (int v : a) {
            r[Arrays.binarySearch(c,v)]++;
        }
        m = Arrays.stream(r).max().getAsInt();

        System.out.print(Arrays.stream(r)
                .filter(v -> v + 1 >= m)
                .count());
    }
}