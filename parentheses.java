import java.util.*;
public class parentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else if(st.isEmpty() && (ch==')' || ch=='}' || ch==']'))
                return false;
            
            else if( (ch==')' && st.peek()== '(')  || (ch=='}' && st.peek()== '{')   || (ch==']' && st.peek()== '[') )
                st.pop();
            else
            {
                return false;
            }

                
        }
        
        if(st.empty())
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        parentheses obj = new parentheses();
       String s= "()[]{}";
        System.out.println(obj.isValid(s));
    }
}
