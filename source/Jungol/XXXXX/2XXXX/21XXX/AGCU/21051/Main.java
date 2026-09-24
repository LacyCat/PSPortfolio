import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long b = 0, c = 0;
        boolean a = n % 2 == 0;
        b = a ? ((long) n * n)/4 - 1 : ((long) n * n - 1)/2;
        c = a ? ((long) n * n)/4 + 1 : ((long) n * n + 1)/2;
        System.out.print(b + " " + c);
    }
}