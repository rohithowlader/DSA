public class fb {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int n = arr.length;
        int[] count= new int[10];
        for(int k=0;k<10;k++)
        count[1]=0;
        int i,j;
        for (i=0;i<n;i++) 
            for (j=arr[i]-1;j>=0; j--)
                count[arr[i]] = count[arr[i]] + count[j];
                 count[arr[i]]++;

        int result = 0;
        for (i=0; i<10; i++)
        result = result + count[i];
        System.out.println(result);
    }
}
