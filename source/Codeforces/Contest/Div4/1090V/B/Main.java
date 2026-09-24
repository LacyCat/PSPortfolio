import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int[] a = new int[7];
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);
            sb.append((a[6] * 2 - Arrays.stream(a).sum()) + "\n");
        }
        System.out.print(sb);
    }
}