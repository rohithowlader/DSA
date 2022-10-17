import java.io.*;

public class palindrome_string {
    boolean isPalin(String s, int l, int r) {
        if (l >= r)
            return true;
        if (s.charAt(l) != s.charAt(r))
            return false;
        return isPalin(s, l + 1, r - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        String s = in.readLine();
        palindrome_string ob = new palindrome_string();
        boolean x = ob.isPalin(s, 0, s.length() - 1);
        System.out.println("Palindrome: " + x);
    }

}
