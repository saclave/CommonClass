public class GetClass {

    static class Test{
    }

    public static void main(String[] args)
    {
        Test test = new Test();
        System.out.println("Class : " + test.getClass().getName()); //GetClass$Test -- class Test inside GetClass

    }
}
