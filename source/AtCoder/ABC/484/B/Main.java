import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        boolean noNine = true;
        int min = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            int v = Integer.parseInt(st.nextToken());
            if (v == 9) noNine = false;
            if (v < min) min = v;
        }
        System.out.print(noNine ? "-1" : min);

    }
}