package hw;

public class HW4 {

    static int task = 2;
    public static void printTask(){
        System.out.println("Task № " + ++task);
    }
    public static void printTask(String text, int number){
        System.out.println(text + number);
    }
    public static void printLine(){
        System.out.println("@@@@@@@@@@@@@@@@@@@@");
    }

    public static void main(String[] args) {
        printTask();
        //Записать в виде кода следующие логические выражения:
        printTask("   задание ", 1);
        //1) (2 = 2) И (7 = 7);
        int two = 2;
        int seven = 7;
        System.out.println((two == two) && (seven == seven));
        printTask("   задание ", 2);
        //2) Не(15 < 3);
        int three = 3;
        int fifteen = 15;
        int ten = 10;
        int twenty = 20;
        int five = 5;
        int six = 6;
        System.out.println(!(fifteen < two));
        printTask("   задание ", 3);
        //3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        String dub = "дуб";
        String sosna = "сосна";
        String vishna = "вишня";
        String klen = "клен";
        System.out.println((sosna.equals(dub)) || (vishna.equals(klen)));
        printTask("   задание ", 4);
        //4) Не("Сосна" = "Дуб");
        System.out.println(!(sosna == dub));
        printTask("   задание ", 5);
        //5) (Не(15 < 3)) И (10 > 20);
        System.out.println((!(fifteen < three)) && (ten > twenty));
        printTask("   задание ", 6);
        //6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом
        // находится второй этаж");
        String aa = "Глаза даны, чтобы видеть";
        String bb = "Под третьим этажом находится второй этаж";
        //System.out.println(aa && bb)); невозможно сделать
        printTask("   задание ", 7);
        //7) (6/2 = 3) ИЛИ (7*5 = 20)
        System.out.println((six / two == three) || (seven * five == twenty));
        printLine();

        printTask();
        printTask("   задание ", 1);
        //Света младше Андрея и Наташи
        int Sveta = 23;
        int Andrey = 24;
        int Natasha = 25;
        System.out.println((Sveta < Andrey) && (Sveta < Natasha));
        printTask("   задание ", 2);
        //На полке стоят учебники, а на столе лежат справочники.
        String text1 = "На полке стоят учебники, ";
        String text2 = "на столе лежат справочники";
        //System.out.println( text1 && text2); невозможно сделать
        printTask("   задание ", 3);
        //БОльшая часть детей — девочки. Остальные - мальчики.
        int girls = 17;
        int boys = 13;
        System.out.println(girls > boys);
        printLine();
        printTask();

        printLine();
        printTask();

        printLine();
        printTask();

        printLine();
        printTask();
        int x = 13;
        if (x > 10) {
            System.out.println("x больше 10");
        } else if (x < 0) {
            System.out.println("x - отрицательное число");
        } else if (x == 5) {
            System.out.println("Разность x и 5 равна 0");
        } else {
            System.out.println("Число x меньше 11, больше или равно" +
                    " 0, но не равно 5");
        }
        System.out.println( (11 < x) && (x <= 0) && x != 5);

        printLine();
        printTask();
        if(x % 2  == 0) {
            System.out.println( x * 2);
        } else {
            System.out.println( x *x);
        }

        printLine();
        printTask();
        printTask("   задание ", 1);
        int age = 17;
        if (age > 18){
            System.out.println("Можно голосовать");
        } else {
            System.out.println("Нельзя голосовать");
        }
        printTask("   задание ", 2);
        if (age > 16){
            System.out.println("Можно водить машину");
        } else {
            System.out.println("Нельзя водить машину");
        }
        printTask("   задание ", 3);
        if (age >= 5){
            System.out.println("Можно идти в школу");
        } else {
            System.out.println("Нельзя идти в школу");
        }

        printLine();
        printTask();


    }
}
