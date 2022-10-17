import java.io.*;

public class palindrome {
    int reverse(int n) {
        int s = 0;
        while (n != 0) {
            int r = n % 10;
            s = s * 10 + r;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number");
        int n = Integer.parseInt(in.readLine());
        palindrome ob = new palindrome();
        int x = ob.reverse(n);
        if (n == x) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
