//Leetcode - 121 

import java.io.*;

public class buy_and_sell_stock_to_Maximise_Profit {
    int maxGains(int a[]) {
        int i, minValue = a[0], maxProfit = 0;
        for (i = 0; i < a.length; i++) {
            minValue = Math.min(a[i], minValue);
            int profit = a[i] - minValue;
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
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
        buy_and_sell_stock_to_Maximise_Profit ob = new buy_and_sell_stock_to_Maximise_Profit();
        int x = ob.maxGains(a);
        System.out.println("Max Profit: " + x);
    }
}
