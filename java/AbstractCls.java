abstract class Car {
    abstract public void drive();

    abstract public void fly();

    public void PlayMusic() {
        System.out.println("playing music..");

    }
}

abstract class WagnoR extends Car {
    public void drive() {
        System.out.println("driving..");

    }

    abstract public void fly();
}

class AdvWagnoR extends WagnoR {
    public void fly() {
        System.out.println("car is flying");
    }
}

public class AbstractCls {

    public static void main(String args[]) {

        Car obj = new AdvWagnoR();
        obj.drive();
        obj.fly();
    }
}
