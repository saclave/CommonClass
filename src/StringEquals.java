public class StringEquals {
    public static void main(String[] args) {
        String a = "TEST";
        String b = "TEST";
        String c = "Test";

        System.out.println(a.equals(b)); //true
        System.out.println(a.equals(c)); //false
        System.out.println(a.equalsIgnoreCase(c)); //true
    }
}
