public class WrapperCls {
    public static void main(String args[]) {
        int num = 12;
        // Integer num1 = new Integer(num); //boxing
        Integer num1 = num; // auto-boxing
        System.out.println(num1);
        // int num2 = num1.intValue(); // unboxing
        int num2 = num1;
        System.out.println(num2);
        String str = "12";
        int b = Integer.parseInt(str);
        System.out.println(b);
    }

}
