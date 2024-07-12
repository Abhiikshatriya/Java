import others.tools.*;
import others.*;

public class Inheritance {
    public static void main(String args[]) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(5, 10);
        int r2 = obj.sub(10, 5);
        int r3 = obj.mul(5, 3);
        int r4 = obj.div(20, 5);
        double r5 = obj.power(4, 2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
        A obj1 = new A();
        System.out.println(obj1.marks);

    }

}
