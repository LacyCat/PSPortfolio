import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                sb.append((j + 1) + " " + (3 * n - 2 * j) + " " + (3 * n - 2 * j - 1) + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}