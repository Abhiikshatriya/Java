@FunctionalInterface
interface A {
    void show(int i);
}

public class Lamda {
    public static void main(String args[]) {
        A obj = (i) -> System.out.println("in show" + " " + i);// lamda expresson is worked only in FunctionalInterface
        obj.show(5);
        /*
         * {
         * public void show() {
         * System.out.println("in show");
         * }
         * };
         * obj.show();
         */
    }

}
