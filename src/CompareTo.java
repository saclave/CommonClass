public class CompareTo {
    public static void main(String[] args)
    {
        String a = "Test";
        String b = "T";
        String c = "This is a test";
        String d = "TEST";
        String e = "Test";

        System.out.println(a.compareTo(b)); //3
        System.out.println(a.compareTo(c)); //-3
        System.out.println(a.compareTo(d)); //32
        System.out.println(a.compareTo(e)); //0

    }
}
