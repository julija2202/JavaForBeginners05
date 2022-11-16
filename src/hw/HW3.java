package hw;

public class HW3 {
    public static void main(String[] args) {
    int number = 1;
        System.out.println("Task №" + ++number);
        byte a = 3;
        byte b = 17;

        System.out.println("Task №" + ++number);
        short s = -30000;
        short t = 30000;

        System.out.println("Task №" + ++number);
        String line = "__________________________";
        String left = "|\t";
        String right = "\t|";
        String middle = "\t|\t";
        int i = -2147483648;
        int i_2 = 2147483647;
        System.out.println(line + "\n"
                                      + left + "int min" + middle + i + right + "\n"
                                      + line + "\n"
                                      + left + "int max" + middle + i_2 + right + "\n"
                                      + line + "\n");

        System.out.println("Task №" + ++number);
        long  phoneNumber = 375295044242l;
        System.out.println(phoneNumber);

        System.out.println("Task №" + ++number);
        float f = 100.101101f;
        double d = 100.101101;
        String line2 = "___________________________________";
        System.out.println(line2 + "\n"
                + left + "float f = 100.101101" + middle + f + right + "\n"
                + line2 + "\n"
                + left + "double d = 100.101101" + middle + d + right + "\n"
                + line2 + "\n");

        System.out.println("Task №" + ++number);
        double dd = 10.09999;
        float ff = 10.09999f + 20.099999f;
        System.out.println(dd + "\n" + ff);

        System.out.println("Task №" + ++number);
        double aa = 10;
        double bb = 3;
        float fff = 10f/3f;
        double ddd = aa/bb;
        System.out.println(fff + "\n" + ddd);

        System.out.println("Task №" + ++number);



    }
}
