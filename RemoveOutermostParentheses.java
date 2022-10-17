import java.io.*;
import java.util.*;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(st.empty() && i!=0 && i!=s.length())
            return "";
            else if(s.charAt(i) == '(')
            {
                st.push(s.charAt(i));
            } 
            else if ( !st.empty() && (((s.charAt(i) == ')' && st.peek() == '('))))
            {
                st.pop();
            }
            
            else 
            {
               st.push(s.charAt(i));
            }
                
        }
            for(int i=1;i<s.length()-1;i++)
            {
                char ch=s.charAt(i);
                ans=ans+ch;
            }
            return ans;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        String s=in.readLine();
        RemoveOutermostParentheses ob=new RemoveOutermostParentheses();
        String ans=ob.removeOuterParentheses(s);
        System.out.println("Final result: " + ans);
    }
}
