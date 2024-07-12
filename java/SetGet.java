import java.io.*;

class ThreadNaming extends Thread {

    public void run() {
        System.out.println("Thread is running.....");
    }
}

class SetGet {
    public static void main(String[] args) {

        ThreadNaming t1 = new ThreadNaming();
        ThreadNaming t2 = new ThreadNaming();
        System.out.println("Thread 1: " + t1.getName());
        System.out.println("Thread 2: " + t2.getName());
        t1.start();
        t2.start();
        t1.setName("abhi");
        t2.setName("ram");
        System.out.println(
                "Thread names after changing the "
                        + "thread names");
        System.out.println("New Thread 1 name:  "
                + t1.getName());
        System.out.println("New Thread 2 name: "
                + t2.getName());
    }
}