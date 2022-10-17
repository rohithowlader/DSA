import java.io.*;
import java.util.HashMap;
public class firstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
            if(map.get(ch)==2)
                return ch;
        }
        return ' ';
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\nEnter the Sentence: \n");
        String s =in.readLine();

        firstLetterToAppearTwice ob = new firstLetterToAppearTwice();
        char ch = ob.repeatedCharacter(s);
        System.out.println("\nLetter to apper twice: " + ch);
    }
}
