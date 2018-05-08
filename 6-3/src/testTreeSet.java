import java.util.*;
public class testTreeSet {
    public static void main(String[] args) {
        Set tree = new TreeSet();
        int[] data = {3, -34, 5, 0, 28};
        for(int i = 0; i < data.length; i++) {
            tree.add(new Integer(data[i]));
            System.out.println(tree);
        }
    }
}
