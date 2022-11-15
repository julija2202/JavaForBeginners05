package hw;

public class HW2 {
    public static void main(String[] args) {
        String line = "__________________________";
        int number = 3;
        System.out.println("Task №" + ++number);

        int x = 10;
        int y = 40;
        int z = 30;
        System.out.println(x + " " + y + " " + z);
        System.out.println(x + "\n" +
                y + "\n" +
                z);

        System.out.println("Task №" + ++number);
        System.out.println(x + ", " + y + ", " + z);

        System.out.println("Task №" + ++number);
        int sum = x + y;
        int b = x * z;
        int a = z - y;
        System.out.println("Sum of x and y = " + sum);
        System.out.println("x * z = " + b);
        System.out.println("Разность переменных y и z =" + a);

        System.out.println("Task №" + ++number);
        int apple = 40;
        int student = 6;
        int integer_ = apple / student;
        int path = apple % student;
        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по " +
                "\n" + integer_ + " яблок(a), и " + path + " яблок(а) останется учителю.");

        System.out.println("Task №" + ++number);
        int apple2 = 100;
        int student2 = 21;
        int integer_2 = apple2 / student2;
        int path2 = apple2 % student2;
        System.out.println("Если " + apple2 + " яблок поделить на " + student2 + " учеников, то каждый ученик получит по " +
                "\n" + integer_2 + " яблок(a), и " + path2 + " яблок(а) останется учителю.");

        System.out.println("Task №" + ++number);
        int lemon = 6;
        int apples = lemon + 24;
        int pear = apples - 12;
        System.out.println(lemon + pear + apples);

        System.out.println("Task №" + ++number);
        int legs = 40;
        int eight = 8;
        int seven = 7;
        int two = 2;
        int five = 5;
        int sum_legs = legs - two - eight - five - seven;
        System.out.println("У сороконожки заболели ножки:" + "\n" +
                eight + " ноют, " + five + " гудят," + "\n" +
                seven + " хромают, " + two + " болят." + "\n" +
                "Помоги сороконожке" + "\n" +
                "Посчитать здоровые ножки." + "\n" +
                "Ответ: " + sum_legs);
        System.out.println(line);

        System.out.println("Task №" + ++number);
        int c = 35;
        int d = 7;
        int e = 48;
        int f = 8;
        int i = 54;
        int k = 6;
        int cd = c / d;
        int ef = e / f;
        int ik = i - k;
        System.out.println("Во сколько раз " + c + " больше, чем " + d + "?" + "\n" + "Ответ : в " + cd + " раз.");
        System.out.println("Во сколько раз " + f + " меньше, чем " + e + "?" + "\n" + "Ответ : в " + ef + " раз.");
        System.out.println("На сколько " + i + " больше " + k + "?" + "\n" + "Ответ : на " + ik);

        System.out.println("Task №" + ++number);
        //a. почему число 48 кратно 8
        int eeff = e % f;
        System.out.println("Число " + e + " кратно " + f + " т.к. в результате деления " + e + " на " +
                f + ", остаток от деления равен " + eeff);

        System.out.println("Task №" + ++number);
        double[][] matrix = new double[4][9];
        int kk = 5;
        int mm = 8;
        int ll = 9;
        int aa = 10;
        int bb = 5;
        int cc = 100;
        int dd = 2;
        matrix[1][0] = kk;
        matrix[2][0] = mm;
        matrix[3][0] = ll;
        matrix[0][1] = aa;
        matrix[0][2] = bb;
        matrix[0][3] = cc;
        matrix[0][4] = dd;
        matrix[0][5] = dd;
        matrix[0][6] = dd;
        matrix[1][1] = kk + aa;
        matrix[1][2] = kk - bb;
        matrix[1][3] = kk * cc;
        matrix[1][4] = kk / dd;
        matrix[1][5] = kk % dd;
        matrix[1][6] = kk * kk;
        matrix[1][7] = ++ kk;
        matrix[1][8] = -- kk;
        matrix[2][1] = mm + aa;
        matrix[2][2] = mm - bb;
        matrix[2][3] = mm * cc;
        matrix[2][4] = mm / dd;
        matrix[2][5] = mm % dd;
        matrix[2][6] = Math.pow(mm, dd);
        matrix[2][7] = ++ mm;
        matrix[2][8] = -- mm;
        matrix[3][1] = ll + aa;
        matrix[3][2] = ll - bb;
        matrix[3][3] = ll * cc;
        matrix[3][4] = ll / dd;
        matrix[3][5] = ll % dd;
        matrix[3][6] = Math.pow(ll, dd);
        matrix[3][7] = ++ ll;
        matrix[3][8] = -- ll;
        int element = 0;
        for (int ii = 0; ii < 4; ii++) {
            for (int jj = 0; jj < 9; jj++) {
                element++;
                System.out.print(matrix[ii][jj] + " | ");
            }
            System.out.println(" ");
        }
        System.out.println();

        System.out.println("Task №" + ++number);
        double xx = 7;
        double yy = 18;
        double nn = 3;
        double result = (Math.pow(xx, nn)) * ((5 * xx + 7 * yy) / (8 * xx + 10 * yy)) / ((3 * xx - yy)/(xx + yy));
        System.out.println("If \n" +
                "x = 7\n" +
                "y = 18\n" +
                "n = 3\n" +
                "then\n" +
                "xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = "  + result);

        System.out.println("Task №" + ++number);


        System.out.println("Task №" + ++number);

        System.out.println("Task №" + ++number);


    }
}
