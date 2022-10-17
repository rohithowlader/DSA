import java.util.*;

class Solution1 {

    public int countConsistentStrings(String allowed, String[] words) {
        int x=0;
        for(int i=0;i<words.length;i++)
        {
            System.out.println(allowedChar(allowed, words[i]));
            if(allowedChar(allowed, words[i]))
            x++;
        }
        return x;
    }
    public boolean allowedChar(String s,String w)
    {
        HashSet<Character> map = new HashSet<>();
        HashSet<Character> map1 = new HashSet<>();
        for (int i = 0; i < w.length(); i++) {
            char ch= w.charAt(i);
            map.add(ch);
        }
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            map1.add(ch);
            map.add(ch);
        }
        if(map.equals(map1))
        return true;
        else
        return false;
    }

    public static void main(String[] args) {

        Solution1 obj = new Solution1();
        String[] words= { "a","b","c","ab","ac","bc","abc"};
        String nums="abc";
        int n=obj.countConsistentStrings(nums, words);
        System.out.println(n);
        // String[] candies = { "eat","tea","tan","ate","nat","bat" };
        // System.out.println(obj.groupAnagrams({"eat","tea","tan","ate","nat","bat"}));
        // List<List<String>> arr = obj.groupAnagrams(candies);
        // for (boolean i : arr)
        // System.out.println(i);
        // "he bought 2 pencils, 3 erasers, and 1 pencil-sharpener."
    }
}

/*public static void main(String[] args) {
        Solution obj = new Solution();
       int[] nums= { 1,2,2,1};
       int[] nums1= { 2,2};
        System.out.println(obj.intersection(nums, nums1));
    }
} 




        StringBuilder an=new StringBuilder();
         while(!st.isEmpty()){
             an.append(st.pop());
         }
         return an.reverse().toString();






         Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(map.containsKey(ch))
                {
                    map.put(ch, map.get(ch)+1);
                }
                else
                    map.put(ch,1);
            }
*/