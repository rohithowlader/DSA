import java.io.*;

public class ways_in_matrix {
    int count(int n, int m) {
        if (n == 1 || m == 1)
            return 1;
        else
            return count(n - 1, m) + count(n, m - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number");
        int n = Integer.parseInt(in.readLine());
        System.out.print("Enter a number");
        int m = Integer.parseInt(in.readLine());
        ways_in_matrix ob = new ways_in_matrix();
        int x = ob.count(n, m);
        System.out.println("Number of ways: " + x);
    }

}
