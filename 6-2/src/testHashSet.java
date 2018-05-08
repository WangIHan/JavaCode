//此处虽然java.util.HashSet中提示调用未检查,HashSet在初始化的时候没有指定类型但实际上，采用了默认类型，
// 并且允许其他类型的扩展
import java.util.*;
public class testHashSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("1st");
        hashSet.add("2nd");
        hashSet.add("3rd");
        hashSet.add("4th");
        hashSet.add(new Integer(6));
        hashSet.add(new Double(7.0));


        hashSet.add("2nd");
        hashSet.add(new Integer(6));
        System.out.println("The first time to show the elements in the hashset:");
        ml(hashSet);
        Set<String> hasSet2 = new HashSet<String>();
        hasSet2.add("aaa");
        hasSet2.add("bbb");
        hasSet2.add("ccc");
        System.out.println("The second time to show the elements in the hashset:");
        ml(hasSet2);
    }

    public static void ml(Set s) {
        System.out.println(s);
    }
}


