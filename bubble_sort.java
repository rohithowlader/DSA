import java.io.*;

public class bubble_sort {
    void sorting(int a[]) {
        int i, j, n = a.length;
        for (i = 0; i < n - 1; i++) {
            boolean f = false;
            for (j = 0; j < n - i - 1; j++) {
                f = true;
                if (a[j + 1] < a[j])
                    swap(a, j + 1, j);
            }
            if (!f) {
                return;
            }
        }
    }

    void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
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
        bubble_sort ob = new bubble_sort();
        ob.sorting(a);
        System.out.println("Sorted Array:\n");
        for (i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
