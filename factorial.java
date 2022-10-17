import java.io.*;

public class factorial {

    int fact(int n) {
        if (n > 0)
            return n * fact(n - 1);
        else
            return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number");
        int n = Integer.parseInt(in.readLine());
        factorial ob = new factorial();
        System.out.println(ob.fact(n));
    }

}
