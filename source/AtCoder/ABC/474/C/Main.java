import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        LinkedHashSet<Integer> a = new LinkedHashSet<>(n);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < q; i++) {
            int v = Integer.parseInt(br.readLine());
            a.remove(v);
            a.add(v);
        }
        a.forEach(v -> sb.append(v + " "));
        System.out.print(sb);
    }
}