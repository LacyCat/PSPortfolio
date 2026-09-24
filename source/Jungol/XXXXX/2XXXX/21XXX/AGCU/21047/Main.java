import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long r_c = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            r_c += Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(st.nextToken())) {
                case 1: {
                    int l = Integer.parseInt(st.nextToken());
                    int r = Integer.parseInt(st.nextToken());
                    int c = Integer.parseInt(st.nextToken());
                    r_c += (long) c * (r - l + 1);
                    break;
                }
                case 2: {
                    System.out.print(r_c + "\n");
                    break;
                }
                default: continue;
            }
        }
    }
}