import java.io.*;

public class trailing_zero {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i, s = 0;
        System.out.print("Enter a Number: ");
        int n = Integer.parseInt(in.readLine());
        for (i = 5; i <= n; i = i * 5) {
            s = s + (int) n / i;
        }
        System.out.println("Number of Trailing Zeros: " + s);
    }
}
