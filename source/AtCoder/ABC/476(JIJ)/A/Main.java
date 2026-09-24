import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        sb.append(s);
        if (s.charAt(s.length() - 1) == 'e'){
            sb.append("r");
        }
        else sb.append("er");
        System.out.print(sb);
    }
}