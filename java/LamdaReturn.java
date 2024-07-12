@FunctionalInterface
interface A {

    int show(int i, int j);
}

public class LamdaReturn {
    public static void main(String args[]) {

        A obj1 = (i, j) -> i + j; // lamda exp with return type
        int result = obj1.show(5, 6);
        System.out.println(result);

        /*
         * A obj = new A() {
         * public int show(int i, int j) {
         * return i + j;
         * }
         * 
         * };
         * int result = obj.show(5, 6);
         * System.out.println(result);
         */
    }

}
