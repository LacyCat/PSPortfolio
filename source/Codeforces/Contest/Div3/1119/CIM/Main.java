import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // SO HARD BRUH
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            List<Integer> idxp = new ArrayList<>();
            List<Integer> idxm = new ArrayList<>();
            int a[] = new int[Integer.parseInt(br.readLine())];
            int tmp = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a.length; j++) {
                int v = Integer.parseInt(st.nextToken());
                a[j] = v;
                if (v == 1) {
                    idxp.add(j);
                    tmp++;
                }
                if (v == -1) idxm.add(j);
            }
            if (tmp > 1) {
                int p = idxp.getLast();
                int m = idxm.getFirst();
                int f_t = thereisonebetween(a,p, idxp.getFirst() + 1) ? p - idxp.getFirst() + 1 : 0;
                int s_d = thereisonebetween(a,p, m + 1) ? p - m + 1 : 0;
                int t_d = thereisonebetween(a,idxm.getLast(), idxp.getFirst() + 1) ? idxm.getLast() - idxp.getFirst() + 1 : 0;
                if (f_t > s_d && f_t > t_d) {
                    Arrays.stream(a).filter(x->x==-1).map(x->x=0);
                }
                else if (s_d > t_d) {
                    Arrays.stream(a).filter(x->x==-1).map(x->x=0);
                }
            }
        }
    }
    private static boolean thereisonebetween(int[] a, int s, int d) {
        boolean r = false;
        for (int i = s; i < d; i++) {
            if (a[i] == 1) {
                r = true;
                break;
            }
        }
        return r;
    }
}