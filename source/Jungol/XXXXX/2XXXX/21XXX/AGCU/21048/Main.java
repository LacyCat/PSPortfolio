import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        char[] a = br.readLine().toCharArray();
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != 0) {
                if (a[i] != a[i-1]) c++;
            }
        }
        if (a[a.length - 1] == 'G') c++;
        System.out.print(c);
    }
}