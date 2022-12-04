package hw;
public class HW6 {
    public static int number =1;
    public static void printNumber(){
        System.out.println();
        System.out.print(" Task №" +
                number++ + "   ----       ");
    }
    //Распечатать последовательность чисел от 0 до 9 включительно.
    public static void subsequence_1(){
        for(int i = 0; i<=9; i++){
            System.out.print(i + " ");
        }
    }

    //Распечатать последовательность чисел от 10 исключительно до 0
    // включительно.
    public static void subsequence_2(){
        for(int i = 10; i>0; i--){
            System.out.print(i + " ");
        }
    }

    //Распечатать последовательность чисел от 50 до 55 включительно
    // с шагом 2.
    public static void subsequence_3(){
        for(int i = 50; i<=55; i+=2){
            System.out.print(i + " ");
        }
    }

    //Распечатать последовательность чисел, кратных 7, в промежутке
    // (327, 300)
    public static void subsequence_4(){
        for(int i = 328; i>300; i--){
            if (i %7 ==0){
                System.out.print(i + " ");
            }
        }
    }

    //Распечатать последовательность чисел в промежутке [12, 13] с
    // шагом 0.1
    public static void subsequence_5(){
        for(double i = 12; i<=13; i+=0.1){
            System.out.print(i + " ");
        }
    }

    //Распечатать последовательность четных чисел от 215 до 237
    // включительно
    public static void subsequence_6(){
        for(int i = 215; i<237; i++){
            if(i%2 ==0) {
                System.out.print(i + " ");
            }
        }
    }

    //Распечатать последовательность чисел, кратных 7, в промежутке
    // от 7 исключительно до 14 исключительно.
    public static void subsequence_7(){
        for(int i =8; i<14; i++){
            if(i%7 ==0) {
                System.out.print(i + " ");
            }
        }
    }

    //Распечатать последовательность которая начинается с
    // минимального значения типа данных short и заканчивается
    // максимальным значением short. Числа в последовательности
    // должны быть кратны 15001.
    public static void subsequence_8(){
        for(short i = Short.MIN_VALUE; i<Short.MAX_VALUE; i++){
            if(i%15001 ==0) {
                System.out.print(i + " ");
            }
        }
    }

    //Распечатать последовательность чисел в промежутке от -10 до 34
    // включительно. Числа, кратные 11, должны быть распечатаны
    // синим цветом. Числа, кратные 12, должны быть распечатаны
    // красным цветом. А ноль необходимо распечатать словом ZERO.
    public static void subsequence_9(){
        for(int i = -10; i<34; i++){
            if (i ==0){
                System.out.print("ZERO ");
            } else if(i%11 == 0 && i != 0) {
                System.out.print("\u001B[31m" + i + " " + "\u001B[0m");
            } else if ( i%12 == 0 && i !=0) {
                System.out.print("\u001B[34m"+ i + " " + "\u001B[0m");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    //Написать метод, который принимает на вход параметры
    // start,  end, step, и печатает последовательность десятичных  чисел,
    // начиная с числа start, с шагом step. Точка выхода из цикла - число end.
    public static void subsequence_10(double start, double end, double step){
        for(double i = start; i < end; i += step){
                System.out.print(i + ", ");
        }
    }

    //Написать метод, который принимает на вход параметры n и m
    // типа char, и выводит на печать последовательность букв
    // английского алфавита в промежутке между значениями n и m
    // включит
    public static void subsequence_11(char n, char m){
        for(char i = n; i <= m; i ++){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        printNumber();
        subsequence_1();
        printNumber();
        subsequence_2();
        printNumber();
        subsequence_3();
        printNumber();
        subsequence_4();
        printNumber();
        subsequence_5();
        printNumber();
        subsequence_6();
        printNumber();
        subsequence_7();
        printNumber();
        subsequence_8();
        printNumber();
        subsequence_9();
        printNumber();
        subsequence_10(0.1, 3.5, 0.51);
        printNumber();
        subsequence_11('a', 'n');
        

    }
}
