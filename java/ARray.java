public class ARray {
    public static void main(String args[]) {
        // int num[] = { 3, 5, 6, 7 };
        // System.out.println(num[1]);
        int num[] = new int[4];
        num[0] = 4;
        num[1] = 3;
        num[2] = 2;
        num[3] = 1;
        /*
         * System.out.println(num[0]);
         * System.out.println(num[1]);
         * System.out.println(num[2]);
         * System.out.println(num[3]);
         */
        // using loop
        for (int i = 0; i <= 3; i++) {
            System.out.println(num[i]);
        }

    }
}