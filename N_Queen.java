import java.io.*;

public class N_Queen {
    boolean isSafe(int board[][], int row, int col, int N) {
        int i, j;

        /* Check this row on upper side */
        for (i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = col; i >= 0 && j < N; j++, i--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    void printarr(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println("");
        }

    }

    boolean backtracking(int a[][], int row, int n) {
        int col;
        if (row == n)
            return true;
        for (col = 0; col < n; col++) {
            if (isSafe(a, row, col, n)) {
                a[row][col] = 1;
                if (backtracking(a, row + 1, n))
                    return true;
                a[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: \n");
        int n = Integer.parseInt(in.readLine());
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++)
                a[i][j] = 0;
        }
        N_Queen ob = new N_Queen();
        if (ob.backtracking(a, 0, n))
            System.out.println("\nN_Queen possible\n");
        else
            System.out.println("N_Queen NOT possible");

        ob.printarr(a);

    }

}
