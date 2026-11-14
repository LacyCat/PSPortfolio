import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> a = new ArrayDeque<>(),b = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }

        boolean foward = true;
        for (int i = 0; i < 2; i++) {
            while (!a.isEmpty()) {
                if ((a.getFirst().equals(b.getFirst()) && foward) || (a.getLast().equals(b.getLast()) && !foward)) {
                    if (foward) {
                        a.pollFirst(); b.pollFirst();
                    }
                    else {
                        a.pollLast(); b.pollLast();
                    }
                }
                else {
                    foward = !foward;
                    break;
                }
            }
        }
        if (a.isEmpty()) {
            System.out.print("Yes");
            return;
        }
        else {
            Deque<Integer> ls = new ArrayDeque<>(a);
            ls.add(ls.pollFirst());
            Deque<Integer> rs = new ArrayDeque<>(a);
            rs.addFirst(rs.pollLast());
            System.out.print(new ArrayList<>(ls).equals(new ArrayList<>(b)) || new ArrayList<>(rs).equals(new ArrayList<>(b)) ? "Yes" : "No");
        }
    }
}