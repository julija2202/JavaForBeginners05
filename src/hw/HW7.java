package hw;

import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) {



    //Прочитать ссылку про оператор switch в документации Oracle, посмотреть видео (ссылки в презентации), и переписать  методы returnMonth(), returnDayOfTheWeek() с помощью оператора switch.
    //      (Эти методы нужно найти в Слаке в коде, который выставляла Гаяна в субботу, 8 октября).
    //Написать универсальный метод для построения последовательности, которая начинается с числа start, заканчивается числом end (оба включительно). Все числа в этой последовательности должны быть кратны числу step. Этот метод должен высчитывать первое кратное число в диапазоне [start, end] и строить последовательность (возрастающую или убывающую) от вычисленного первого кратного числа с шагом step.
    //      (Эта задача по мотивам разбора HW6,  Part 1  в воскресенье 9 октября)

    //Создать массив catsNames[], заполнить его любыми своими значениями
    String[] cats = new String[5];
    cats = new  String[]{"Кристофер", "Ася", "Марта", "Васька", "Боня"};
        System.out.println(Arrays.toString(cats));

    //В массиве catsNames[] изменить значение элемента с индексом 4 на “Рыжик”,  а значение элемента с индексом 1 на “Черныш”.
        cats[1] = "Черныш";
        cats[4] = "Рыжик";
        System.out.println(Arrays.toString(cats));

    //Создать массив catsColors[] и заполнить его значениями (см картинку в презентации).
        String[] catsColor = new String[5];
        catsColor = new  String[]{"Серый", "Разноцветный", "Белый", "Черный", "Рыжий"};
        System.out.println(Arrays.toString(catsColor));

    //Создать массив catsAges[] и заполнить его любыми целочисленными валидными значениями.
        int[] catsAge = new int[5];
        catsAge= new  int[]{2, 1, 10, 7,3};
        System.out.println(Arrays.toString(catsAge));

        
    //Создать массив isCatRed[] и заполнить его соответствующими значениями (см картинку в презентации. Red = рыжий)
    //Распечатать для массивов catsNames[] и catsColors[]:
    //имя кота в коробке с номером 6
    //имена котов из коробок с четными индексами
    //имена котов из коробок, чьи индексы кратны 4
    //цвет котов из коробок с нечетными индексами
    //цвет котов из коробок, чьи индексы кратны 3, но не кратны 2
    //Распечатать “Накорми кота!” для всех серых котов
    //Распечатать “Дай коту воды!” для всех котов со значениями true из массива isCatRed[]
    //Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
    //Для кота в последней коробке распечатать имя, цвет, возраст
    //Распечатать имя, цвет, возраст котов в двух серединных коробках
    //Распечатать имена всех котов, чей возраст больше 2 лет
    //Распечатать “Накорми … !” , где … - имя кота, а значение isCatRed == true
    //Распечатать средний возраст котов из массива catsAges[]
    //Распечатать возраст самого молодого кота
    //Распечатать возраст самого старого кота
    //Распечатать количество серых котов и количество рыжих котов
    //Распечатать имя кота, если кот находится в коробке с нечетным индексом и его возраст не больше 2 лет
}
}
