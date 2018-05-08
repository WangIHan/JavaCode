import java.util.*;
public class testArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1st");
        list.add("2nd");
        list.add(new Integer(3));
        list.add(new Double(4.0));
        list.add("2nd");
        list.add(new Integer(3));
        System.out.println("The first time to show the elements int the ArrayList.");
        display(list);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(new Integer(3));
        list2.add(5);
        list2.add(100);
        list2.add(3);
        System.out.println("the second time to show the elements in the ArrayList:");
        display(list);
    }

    public static void display(List s) {
        System.out.println(s);
    }
}
