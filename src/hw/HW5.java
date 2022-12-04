package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW5 {
    public static int number =2;
        public static void printNumber(){
            System.out.print(" Test №" +
                    number++ + "   ----       ");
        }
        public static String verifyEquals ( int expectedResult, int actualResult){
            if (expectedResult == actualResult) {
                return "Pass";
            } else {
                return "Fail";
            }
        }
        public static String verifyEquals (String expectedResult, String actualResult){
            if (expectedResult == actualResult) {
                return "Pass";
            } else {
                return "Fail";
            }
        }

        public static String printDay ( int dayNumber){
            if (dayNumber == 1) {
                return "Monday";
            } else if (dayNumber == 2) {
                return "Tuesday";
            } else if (dayNumber == 3) {
                return "Wednesday";
            } else if (dayNumber == 4) {
                return "Thursday";
            } else if (dayNumber == 5) {
                return "Friday";
            } else if (dayNumber == 6) {
                return "Saturday";
            } else if (dayNumber == 7) {
                return "Sunday";
            } else {
                return "Error";
            }
        }

        public static int averAge(int a, int b, int c){
            List<Integer> list = Arrays.asList(a, b, c);
            int result = (a + b + c)/3;
            if (result> 0){
                return result;
            } else {
                return getMin(list);
            }

        }
    public static Integer getMin(List<Integer> list){
        Integer min = Integer.MAX_VALUE;
        for (Integer i: list) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static int finfMin(int a, int b){
            if(a>= b){
                return b;
            } else {
                return a;
            }
    }

    public static void main(String[] args) {
        //test 1 Написать метод, который принимает на вход число
        // от 1 до 7  и возвращает день недели. В случае невалидных
        // значений метод возвращает “Error”.
        //Протестировать метод
        int dayNumber = 3;
        String expectedResult = "Wednesday";
        String actualResult = printDay(dayNumber);
        printNumber();
        System.out.println(verifyEquals(expectedResult, actualResult));

        //test 2 и 3  Написать алгоритм вычисления среднего возраста
        // (int) в семье из 3х человек.   Например,
        //int age1 = 20, int age2 = 40, int age3 = 60 Average = 40.
        //или age1 = -5; age2 = -30; age3 = -3;
        //должно вернуть  Integer.MIN_VALUE; Протестируйте
        // алгоритм на позитивные и негативные сценарии.
        int person1 = 35;
        int person2 = 30;
        int person3 = 4;
        int expectedResult1 = 23;
        int actualResult1 = averAge(person1, person2, person3);
        printNumber();
        System.out.println(verifyEquals(expectedResult1, actualResult1));
        int person_1 = -6;
        int person_2 = -30;
        int person_3 = -1;
        int expectedResult_1 = -30;
        int actualResult_1 = averAge(person_1, person_2, person_3);
        printNumber();
        System.out.println(verifyEquals(expectedResult_1, actualResult_1));
        System.out.println(averAge(person_1, person_2, person_3));

//test4, 5 6   Найти минимальное  значение, используя переменные
// (по одному методу на каждый вариант)  a) k и l
// b)k, l, m           c) k, l, m, n
        //	Переменные должны быть типа int   Happy path test data:
        //if k = 3, l = 30, m = 300, n = 3000
        //expected results: a) 3  b) 3  c) 3
        // Написать тесты на каждый метод.
        int k = 3;
        int l = 30;
        int m = 300;
        int n = 3000;
        int expectedResult_11 = 3;
        int actualResult_11 = finfMin(k, l) ;
        int actualResult_12 = finfMin(k, finfMin(l, m)) ;
        int actualResult_13 = finfMin(k, finfMin(l, finfMin(m,n))) ;
        printNumber();
        System.out.println(verifyEquals(expectedResult_11,
                actualResult_11));
        printNumber();
        System.out.println(verifyEquals(expectedResult_11,
                actualResult_12));
        printNumber();
        System.out.println(verifyEquals(expectedResult_11,
                actualResult_13));
       }
     // test 8 Написать алгоритм вычисления среднего значения из
    // 5 показателей температуры тела кота. Метод принимает
    // и возвращает значения типа double



}