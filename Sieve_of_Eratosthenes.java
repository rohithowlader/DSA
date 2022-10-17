import java.io.*;
import java.util.ArrayList;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Boolean> a = new ArrayList<Boolean>();
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(in.readLine());
        int i, j;
        for (i = 0; i <= n; i++)
            a.add(i, true);
        a.set(0, false);
        a.set(1, false);
        for (i = 2; i * i <= n; i++) {
            for (j = i + 1; j <= n; j++) {
                if ((j % i) == 0)
                    a.set(j, false);
            }
        }
        int s = 0, c = 0;
        for (Boolean m : a) {
            System.out.println(s + ": " + m);
            if (m == true)
                c++;
            s++;
        }
        System.out.println("Number of Prime numbers: " + c);
    }
}
