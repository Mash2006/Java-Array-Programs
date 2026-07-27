import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    public PerformOperation isPrime() {
        return n -> {
            if (n < 2) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
    }

    public PerformOperation isPalindrome() {
        return n -> {
            int original = n;
            int reverse = 0;

            while (n > 0) {
                reverse = reverse * 10 + (n % 10);
                n /= 10;
            }
            return original == reverse;
        };
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        PerformOperation op;
        boolean ret;
        String ans;

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = ret ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = ret ? "PRIME" : "COMPOSITE";
            } else {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = ret ? "PALINDROME" : "NOT PALINDROME";
            }

            System.out.println(ans);
        }
    }
}