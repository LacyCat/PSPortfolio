import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int i = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int o = 0;
        int t = 0;
        int h = 0;
        long tmp = 0;
        for (int j = 0; j < i; j++) {
            long v = Long.parseLong(st.nextToken());
            tmp = ((v + 999) / 1000) * 1000;
            tmp = tmp - v;
            o += (int) (tmp % 10);
            t += (int) (tmp % 100 / 10);
            h += (int) (tmp / 100);
        }
        System.out.print(o + " " + t + " " + h);
    }
}