class Solution {
    public String sortSentence(String s) {
        String[] a=s.split(" ");
        String[] st=new String[a.length];
        for(String i : a)
        {
            int ch=i.charAt(i.length()-1)- '0';
            st[ch-1]=i.substring(0, i.length()-1);

        }
        String f="";
        for(String i: st)
            f=f+i+" ";

        return f.trim();

        
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        String  searchWord = "is2 sentence4 This1 a3";
        System.out.println(obj.sortSentence(searchWord));
    }
}