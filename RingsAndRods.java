import java.io.*;
public class RingsAndRods {
    public int countPoints(String rings) {
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter the Sentence: \n");
        String s =in.readLine();

        RingsAndRods ob = new RingsAndRods();
        int ch = ob.countPoints(s);
        System.out.println("\nLetter to apper twice: " + ch);
    }
}
