public class MulCatch {
    public static void main(String args[]) {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;
        try {
            j = 18 / i;
            System.out.println(nums[5]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("can't divide by zero" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("stay i ur limits" + e);
        } catch (NullPointerException e) {
            System.out.println("the value of string is null" + e);
        } catch (Exception e) {
            System.out.println("somethind went wrong");
        }
    }

}
