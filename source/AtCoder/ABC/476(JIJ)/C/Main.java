import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        Queue<Integer> tmp = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        for (int v : a) {
            tmp.add(v);
            if (tmp.size() > 3) tmp.poll();
            if (tmp.size() == 3) sb.append(tmp.peek() + "\n");
        }
        System.out.print(sb);
    }
}