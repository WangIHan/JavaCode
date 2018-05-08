public class testSringBuffer {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("ab");
        System.out.println(s.length());
        System.out.println(s.charAt(1));

        s.append("cd");
        System.out.println(s);
        s.insert(1,"ef");
        System.out.println(s);

    }
}
