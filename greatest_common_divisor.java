import java.io.*;

public class greatest_common_divisor {

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter 1st number: ");
        int a = Integer.parseInt(in.readLine());
        System.out.print("Enter 2nd number: ");
        int b = Integer.parseInt(in.readLine());
        greatest_common_divisor ob = new greatest_common_divisor();
        int x = ob.gcd(a, b);
        System.out.println(x);
    }
}
