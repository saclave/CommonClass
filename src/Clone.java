public class Clone implements Cloneable {
    String a = "This", b = " is", c = " a", d = " sample";

    public static void main(String[] args) {
        Clone c1 = new Clone();

        System.out.println(c1.a + c1.b + c1.c + c1.d);
        //This is a sample

        try {
            Clone c2 = (Clone)c1.clone();
            System.out.println(c2.a + c2.b + c2.c + c2.d);
            //this is a sample

        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }

    }
}