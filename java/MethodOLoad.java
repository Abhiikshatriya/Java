class calculators {
    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }

    public int add(int n1, int n2, int n3) {
        int r1 = n1 + n2 + n3;
        return r1;
    }

    public double add(double n1, int n2) {
        double r2 = n1 + n2;
        return r2;
    }
}

public class MethodOLoad {
    public static void main(String args[])

    {
        calculators obj = new calculators();
        // int result = obj.add(5, 4, 5); if we pass 3 args 2nd method will executed
        int result = obj.add(5, 4);
        System.out.println(result);
    }

}
