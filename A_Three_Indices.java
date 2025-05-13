import java.util.*;

public class A_Three_Indices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }
            solve(p, n);
        }
        sc.close();
    }

    public static void solve(int[] p, int n) {
        for (int i = 1; i < n - 1; i++) {
            if (p[i - 1] < p[i] && p[i] > p[i + 1]) {
                System.out.println("YES");
                System.out.println((i) + " " + (i + 1) + " " + (i + 2));
                return;
            }
        }
        System.out.println("NO");
    }
}