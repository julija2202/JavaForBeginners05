package people;

public class Person {
    public static void main(String[] args){
        int yob = 1987;
        int year = 2022;
        int age = year - yob;
        int two = 2;
        int two_years_ago = age - two;
        System.out.println("Если человек родился в " +
                yob +
                " году, то его возраст - разница между " +
                year +
                " и " +
                yob +
                ", и равен - " +
                age );
        System.out.println("Если человек родился в " +
                yob +
                " году, то его возраст 2 года назад - разница между " +
                age +
                " и " +
                two +
                " равна " +
                two_years_ago);
    }
}
