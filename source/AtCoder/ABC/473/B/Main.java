import java.io.*;
import java.util.*;

public class Main {
    // 2 7 1 8 2 8 1 8
    // 7 1 8 8 1 8
    // 7 8 8 8
    // 7 8
    // = 15
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Set<Integer> v = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(st.nextToken());
            if (!v.contains(t)) {
                v.add(t);
            }
            else v.remove(t);
        }
        System.out.print(v.stream().mapToInt(Integer::intValue).sum());
    }
}