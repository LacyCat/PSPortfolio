import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        System.out.print(switch (x) {
            case 1 -> 2;
            case 2 -> 3;
            case 3 -> 2;
            default -> 0;
        });
    }
}