import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int r;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            int k = Integer.parseInt(st.nextToken());
            char[] a = br.readLine().toCharArray();
            r = 0;
            for (int j = 1; j < a.length / k + 1; j++) {
                if (isAllOne(a,j*k - k, j*k)) r++;
            }
            sb.append(r + "\n");
        }
        System.out.print(sb);
    }
    private static boolean isAllOne(char[] a, int s,int d) {
        boolean tmp = true;
        for (int i = s; i < d; i++) {
            if (a[i] != '1') {
                tmp = false;
                break;
            }
        }
        return tmp;
    }
}