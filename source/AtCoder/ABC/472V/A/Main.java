import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] a = br.readLine().toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 'A') a[i] = '.';
        }
        String r = String.valueOf(a);
        System.out.print(r);
    }
}