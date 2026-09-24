import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        String s = br.readLine();
        String t = br.readLine();
        boolean tmp = true;
        for (int i = 0; i < s.length(); i++) {
            if (t.charAt(i) != '*' && s.charAt(i) != t.charAt(i)) tmp = false;
        }
        System.out.print(tmp ? "Yes" : "No");
    }
}