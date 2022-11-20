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
        float floatSum = f + ff;
        float floatSub = f - ff;
        float floatProduct = f * ff;
        float floatQuotient = f / ff;
        float floatRemainder = f % ff;
        System.out.println(floatSum + "\n" +
                floatSub  + "\n" +
                floatProduct  + "\n" +
                floatQuotient  + "\n" +
                floatRemainder);

        System.out.println("Task №" + ++number);
        double doubleSum = f + ff;
        double doubleSub = f - ff;
        double doubleProduct = f * ff;
        double doubleQuotient = f / ff;
        double doubleRemainder = f % ff;
        System.out.println(doubleSum + "\n" +
                doubleSub + "\n" +
                doubleProduct  + "\n" +
                doubleQuotient  + "\n" +
                doubleRemainder);

        System.out.println("Task №" + ++number);
        String line3 = "________________________________________________" +
                "____________________________";
        System.out.println(line3 + "\n"
                + left + "f = 00.101101 " + middle + "ff = 30.19999" + "\t\t" + middle +
                "d = 100.101101" + middle + "dd = 10.09999" + "\t\t\t"+ right + "\n"
                + line3 + "\n"
                + left + "floatSum = " + floatSum + "\t\t\t\t\t\t" + middle +
                "doubleSum = " + doubleSum + "\t\t" + right + "\n"
                + left + "floatSub = " + floatSub + "\t\t\t\t\t\t" + middle +
                "doubleSub = " + doubleSub + "\t\t\t"+ right + "\n"
                + left + "floatProduct = " + floatProduct + "\t\t\t\t" + middle +
                "doubleProduct = " + doubleProduct + right + "\n"
                + left + "floatQuotient = " + floatQuotient + "\t\t\t\t" + middle +
                "doubleQuotient = " + doubleQuotient + right + "\n"
                + left + "floatRemainder = " + floatRemainder + "\t\t\t\t" +
                middle + "doubleRemainder = " + doubleRemainder + right + "\n"
                + line3);

        System.out.println("Task №" + ++number);
        System.out.println( "..........     ...........     .        .     ..........    " + "\n"
                                     + "       :    :       :     :        :    :      :     " + "\n"
                                     + "       :    :.........:     :        :    :........:     " + "\n"
                                     + ":.......:     :       :      :.......:     :      :     " + "\n");

        System.out.println("Task №" + ++number);
        Byte t1 = 0;
        Short t2 = 150;
        Short t3 = -120;
        Float t4 = - 505.505f;
        Integer t5 = 100100;
        Long t6 = 100010001000l;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;
        System.out.println(t1 + ", " +  t2 + ", " + t3 + ", " + t4 + ", " + t5 + ", " + t6
                + ", " + t7 + ", " + t8 +", " + t9);

        System.out.println("Task №" + ++number);

        System.out.println("Task №" + ++number);
        Integer num1 = 5;
        Integer num2 = 5;
       Boolean bool =  true;
       bool = num1.equals(num2);
       System.out.println("Если num1 равно  num2, то результат сравнения методом .equals() = …" +  bool);

        System.out.println("Task №" + ++number);
         



    }
}
