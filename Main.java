//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф.И.О. сотрудника - " + fullName + ".");


        String fullNameOne = "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта - " + fullNameOne.toUpperCase() + ".");


        String fullNameTwo = "Иванов Семён Семёнович";
        fullNameTwo = fullNameTwo.replace("ё", "е");

        System.out.println("Данные Ф.И.О. сотрудника — " + fullNameTwo + ".");

    }

    }
