import java.io.*;
import java.util.*;
public class Binary_Deque {
    
    public int sum(Deque<Integer> q)
    {
        int s=0;
        for (Iterator<Integer> itr = q.iterator();itr.hasNext();) {
            s+=itr.next();
         }
        return s;
    }
    public int numberops()throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str=in.readLine();//10 1 
        String[] arr= str.split(" ");//["3", "1"]
        int l=Integer.parseInt(arr[0]);  //3
        int s=Integer.parseInt(arr[1]);//1
        String str1=in.readLine();//1 1 0
        String[] ar= str1.split(" ");//["1", "1", "0"]
        int[] a = Arrays.stream(ar)
                        .mapToInt(Integer::parseInt)
                        .toArray();//[1,1,0]
        Deque<Integer> q= new ArrayDeque<Integer>();
        int i;
        for( i=0;i<l;i++)
        {
            q.add(a[i]);
        }
        int op=0;
        if(s>sum(q))
        return -1;
        while(true)
        {
            if(sum(q)!=s && q.peekFirst()==1)
            {
                q.removeFirst();
                op++;
            }
            if(sum(q)!=s && q.peekLast()==1){
                q.removeLast();
                op++;
            }
            if(sum(q)==s)
            return  op;
        }
    }
    public static void main(String[] args)throws IOException {
        Binary_Deque obj=new Binary_Deque();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x= Integer.parseInt(in.readLine());
        int[] q=new int[x];
        for(int i=0;i<x;i++)
         q[i]=obj.numberops();
         for(int i=0;i<x;i++)
        System.out.println(q[i]);
    }
        
}
