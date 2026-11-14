import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] grid = new int[r][c];
            for (int x = 0; x < r; x++) {
                String s = br.readLine();
                for (int y = 0; y < c; y++) {
                    grid[x][y] = s.charAt(y) == '#' ? -1 : 0;
                }
            }

            List<Integer> p = new ArrayList<>();
            for (int x = 0; x < r; x++) {
                for (int y = 0; y < c; y++) {
                    if (grid[x][y] == 0) {
                        int h_c = 0;
                        for (int j = 0; j < 8; j++) {
                            int r_x = x + dx[j];
                            int r_y = y + dy[j];
                            if (r_x >= 0 && r_x < r && r_y >= 0 && r_y < c) {
                                if (grid[r_x][r_y] == -1) {
                                    h_c++;
                                }
                            }
                        }
                        p.add(h_c);
                    }
                }
            }
            p.sort(Collections.reverseOrder());
            int sum = 0;
            int v = -1;
            if (k == 0) {
                sb.append(0 + "\n");
                continue;
            }
            for (int j = 0; j < p.size(); j++) {
                sum += p.get(j);
                if (sum >= k) {
                    v = j + 1;
                    break;
                }
            }

            sb.append(v + "\n");
        }
        System.out.print(sb);
    }
}