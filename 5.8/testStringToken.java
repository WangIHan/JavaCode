import java.util.*;

public class testStringToken {
    public static void main(String[] args) {
        System.out.println("This is StringTokenizer:");
        String s = "ab+cd+ef";

        StringTokenizer ts = new StringTokenizer(s, "+");
        int n = ts.countTokens();
        System.out.println("n = " + n);
        while(ts.hasMoreTokens()) {
            String u = ts.nextToken();
            System.out.println(u);
        }

        System.out.println("\n\nThis is String");
        String s2 = "ab+cd+ef";
        String v[] = s2.split("\\+");
        System.out.println("n = " + v.length);
        for(int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
