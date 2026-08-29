import java.io.*;
import java.util.*;

public class Main {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    //
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Set<Point> r = new HashSet<>();
        boolean[] r = new boolean[h];
        boolean[] c = new boolean[w];
        for (int i = 0; i < h; i++) {
            char[] s = br.readLine().toCharArray();
            for (int j = 0; j < w; j++) {
                if (s[j] == '#') {
                    r[i] = true;
                    c[j] = true;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (!r[i] && !c[j]) {

                }
            }
        }
    }

    private static void fillColumn(int[][] a, int column, int v) {
        for (int i = 0; i < a.length; i++) {
            a[i][column] = v;
        }
    }

    public record Point(int x, int y) {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point point)) return false;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}