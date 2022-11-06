package people;

public class Student {
    public static void main(String[] args){
        String first_name = "Вова";
        String last_name = "Сидоров";
        int klass = 5;
        int age = 10;
        String person = "Ученик";
        String first_name2 = "Маша";
        String last_name2 = "Семенова";
        int klass2 = 9;
        int age2 = 14;
        String person2 = "Ученица";
        System.out.println("Человек: " + person + " \n" +
                           "ФИО:     " + first_name + " " + last_name + " \n" +
                           "Класс: \t " + klass + " \n" +
                           "Возраст: " + age + " лет" );
        System.out.println("_____________________________");
        System.out.println("Человек: " + person2 + " \n" +
                           "ФИО:     " + first_name2 + " " + last_name2 + " \n" +
                           "Класс: \t " + klass2 + " \n" +
                           "Возраст: " + age2 + " лет" );
    }
}
