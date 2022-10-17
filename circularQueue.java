/*
import java.io.*;

public class circularQueue {
    int majorityElement(int a[]) {
        CircularQueue<Integer> q = new LinkedList();
        int i, ansIndex = 0, count = 1;
        for (i = 1; i < a.length; i++) {
            if (a[ansIndex] == a[i])
                count++;
            else {
                count--;
            }
            if (count == 0) {
                ansIndex = i;
                count = 1;
            }

        }
        int c = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == a[ansIndex])
                c++;
        }
        if (c > ((int) a.length / 2))
            return a[ansIndex];
        else
            return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number of elements: ");
        int n = Integer.parseInt(in.readLine());
        System.out.println("\nEnter the Elements: \n");
        int i;
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = Integer.parseInt(in.readLine());
        }
        Moore_Voting_Algorithm ob = new Moore_Voting_Algorithm();
        int m = ob.majorityElement(a);
        System.out.println("\nMajority Elements in an Array: " + m);
    }
}
 */