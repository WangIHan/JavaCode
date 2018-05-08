import java.util.*;
class ParseString {
    static boolean parsing(String str) {
        Stack<Character> stk = new Stack<Character>();
        char c;
        for(int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if(c == '{' || c == '(' || c == '[')
                stk.push(c);
            else if(c == '}') {
                if(stk.peek() == '{')
                    stk.pop();
                else
                    return false;
            }
            else if(c == '(') {
                if(stk.peek() == '(')
                    stk.pop();
                else
                    return false;
            }
            else if(c == '[') {
                if(stk.peek() == '[')
                    stk.pop();
                else
                    return false;
            }
        }
        if(stk.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(parsing("method(){int[] i1 = {1,3,5};int i2; }"));
        System.out.println(parsing("Syetem.out.println(a[3]+b[3]+c()))]"));
    }
}


StringTokenizer st = StringTokenizer("ab");
