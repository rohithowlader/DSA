import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
public class Maximum_Number_of_Pairs_in_Array {
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> numOcc= new HashMap<>();
        int[] n=new int[7];
        
        for(int i=0;i<7;i++)
        n[i]=Integer.parseInt(in.readLine());

        for(int i=0;i<n.length;i++)
        {
            if (numOcc.containsKey(n[i])) {
 
                // If number is present in freqMap,
                // incrementing it's count by 1
                numOcc.put(n[i], numOcc.get(n[i]) + 1);
            }
            else {
 
                // If integer is not present in freqMap,
                // putting this integer to freqMap with 1 as it's value
                numOcc.put(n[i], 1);
            }          
        }
        for(int i=0;i<n.length;i++)
        System.out.println(n[i]);
        System.out.println(numOcc);

    }
}
