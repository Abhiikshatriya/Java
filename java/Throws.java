class A {
    public void show() throws ClassNotFoundException {
        /*
         * try {
         * Class.forName("calc");
         * } catch (ClassNotFoundException e)
         */

        {
            System.out.println("class not found");
        }
    }
}

public class Throws {
    public static void main(String args[]) {
        A obj = new A();
        try {

            obj.show();
        } catch (ClassNotFoundException e) {

        }
    }

}
