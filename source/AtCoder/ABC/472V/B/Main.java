import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int[] a = new int[t];
        int min = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < t; i++) {
            int r = subOfTwoArea(a, i);
            if (r < min) min = r;
        }
        System.out.print(min);
    }
    private static int subOfTwoArea(int[] a, int index) {
        int f = 0;
        int s = 0;
        for (int i = 0; i < index; i++) {
            f += a[i];
        }
        for (int i = index; i < a.length; i++) {
            s += a[i];
        }
        return Math.abs(f - s);
    }
}