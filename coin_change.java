import java.io.*;
import java.util.*;
public class coin_change {
    public static int coinChange(int[] coins, int amount) {
        
        if(amount<0)
        return -1;
        if(amount==0)
        return 0;
        int[] dp=new int[amount+1];
        Arrays.fill(dp, -1);
        dp[0]=0;
        int ans= Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
            if(amount-coins[i]>=0)
            {
                int subAns=0;
                if(dp[amount-coins[i]] != -1)
                    subAns=dp[amount-coins[i]];
                else
                {
                    subAns=coinChange(coins, amount-coins[i]);
                }
                
            if(subAns!= Integer.MAX_VALUE && subAns +1 < ans)
                ans = subAns+1;
            }

        }
        return dp[amount-1]=ans;
        
        
    }
    public static void main(String[] args)throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int amount=11;
        int coins[] = {1,2,5};
        int ans = coinChange(coins,amount);
        System.out.println(ans);
    }
}
