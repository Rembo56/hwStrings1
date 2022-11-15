public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Задание 1

        System.out.println("Task 1 \n");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ф.И.О сотрудника —" + lastName+" "+ firstName+" "+ middleName;
        System.out.println(fullName);

        System.out.println(" ");

        // Задание 2
        System.out.println("Task 2 \n");

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase() + "\n" );

        System.out.println(" ");

        // Задание 3
        System.out.println("Task 3 \n");

        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — "+fullName.replace('ё','е'));


    }
}