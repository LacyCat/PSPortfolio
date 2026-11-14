import java.io.*;
import java.util.*;

public class Main {
    private static final int[] H = {2,3,0,1};
    private static final int[] Z = {0,1,3,2};
    private static final int[] X = {1,0,2,3};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int c;
        for (int i = 0; i < t; i++) {
            c = 0;
            int n = Integer.parseInt(br.readLine());
            char[] s = br.readLine().toCharArray();
            int[] v;
            for (int l = 0; l < n - 1; l++) {
                v = new int[]{0, 1, 2, 3};
                for (int r = l; r < n; r++) {
                    switch (s[r]) {
                        case 'H': {
                            v[0] = H[v[0]];
                            v[1] = H[v[1]];
                            v[2] = H[v[2]];
                            v[3] = H[v[3]];
                            break;
                        }
                        case 'Z': {
                            v[0] = Z[v[0]];
                            v[1] = Z[v[1]];
                            v[2] = Z[v[2]];
                            v[3] = Z[v[3]];
                            break;
                        }
                        case 'X': {
                            v[0] = X[v[0]];
                            v[1] = X[v[1]];
                            v[2] = X[v[2]];
                            v[3] = X[v[3]];
                            break;
                        }
                    }
                    if (Arrays.equals(v,new int[]{0,1,2,3})) c++;
                }
            }
            sb.append(c+"\n");
        }
        System.out.print(sb);
    }
}