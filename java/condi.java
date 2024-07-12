public class condi {
    public static void main(String args[]) {
        int x = 6;
        int y = 7;
        /*
         * if (x > y)
         * System.out.println("X is grester");
         * else
         * System.out.println("Y is greater");
         */

        int z = 10;
        if (x > y && x > z)
            System.out.println("x is grester");
        else if (y > x && y > z)
            System.out.println("y is greater");
        else
            System.out.println("Z is greater");

    }
}
