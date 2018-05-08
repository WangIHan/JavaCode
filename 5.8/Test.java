import java.util.*;


public class Test {

    public static void main(String[] args) {
    String s = new String("ab+cd+ef");
    String u[] = s.split("//+");

    for(int i = 0; i < u.length; i++) {
        System.out.println(u[i]);
        }


    }   

}
