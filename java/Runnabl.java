
//Normal Method.....
/*import java.beans.IntrospectionException;

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

public class Runnabl {
    public static void main(String args[]) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }

}*/
// using Lambda Function....
import java.beans.IntrospectionException;

public class Runnabl {
    public static void main(String args[]) {
        Runnable obj1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> { // lambda exprn
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}