public class Equals {
    public static void main(String[] args) {
        String a = "TEST"; //we cannot use ==
        String b = "TEST"; //we cannot use ==
        int x = 1; //we cannot use .equals()
        int y = 1; //we cannot use .equals()

        System.out.println(a.equals(b)); //true
        System.out.println(x==y); //true

    }
}
