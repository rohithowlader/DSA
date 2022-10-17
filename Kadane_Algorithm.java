import java.io.*;

public class Kadane_Algorithm {

    int Largest_Sum_Contiguous_Subarray(int a[]) {
        int maxSum = 0, currSum = 0;
        for (int i = 0; i < a.length; i++) {
            currSum = currSum + a[i];
            if (currSum > maxSum)
                maxSum = currSum;
            if (currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number of elements: ");
        int n = Integer.parseInt(in.readLine());
        System.out.println("\nEnter the Elemets: \n");
        int i;
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = Integer.parseInt(in.readLine());
        }
        Kadane_Algorithm ob = new Kadane_Algorithm();
        int x = ob.Largest_Sum_Contiguous_Subarray(a);
        System.out.println("Largest Sum Contiguous Subarray: " + x);
    }
}
