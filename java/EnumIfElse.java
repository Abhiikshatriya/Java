enum Status {
    Running, Pending, Failed, Successfull
}

public class EnumIfElse {
    public static void main(String args[]) {
        Status s = Status.Pending;

        switch (s) {
            case Running:
                System.out.println("all good");
                break;
            case Pending:
                System.out.println("please wait");
                break;
            case Failed:
                System.out.println("try again");
                break;
            default:
                System.out.println("Done");
                break;
        }

        /*
         * if (s == Status.Running)
         * System.out.println("all good");
         * else if (s == Status.Failed)
         * System.out.println("Try again");
         * else if (s == Status.Pending)
         * System.out.println("pleasse wait");
         * else
         * System.out.println("Done");
         */

    }
}
