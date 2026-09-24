import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        boolean t = true;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(st.nextToken());
            if ((i / 10 + 1) * 10 < v || (i / 10 - 1) * 10 > v) t = false;
        }
        System.out.print(t ? "Yes" : "No");
    }
}